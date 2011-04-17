/**
 * 
 */
package com.mycompany.app.json;

/**
 * @author boy
 * 
 */
class JsonParser {

	private String json;
	private int index;

	public JsonParser(String json) {
		this.json = json;
	}

	public boolean isArray() {
		return JsonParser.isArray(this.json);
	}

	public boolean hasMore() {
		return index < json.length();
	}

	public String nextElement() {
		StringBuilder sb = new StringBuilder();
		StringBuffer groups = new StringBuffer();
		prepareElement(sb, index, groups);
		return sb.toString();
	}

	private void prepareElement(StringBuilder sb, int index, StringBuffer groups) {
		if (index >= json.length()) {
			throw new RuntimeException("Invalid Json");
		}

		if (json.charAt(index) == '[') {
			groups.append('[');
			prepareElement(sb, ++index, groups);
			return;
		}
		
		if (json.charAt(index) == '{') {
			groups.append('{');
			prepareElement(sb, ++index, groups);
			return;
		}
		
		if (json.charAt(index) == ']') {
			if(groups.charAt(groups.length() - 1) != '[') {
				throw new RuntimeException("Invalid Json at index: " + index);
			}
			index++;
			groups.deleteCharAt(groups.length() - 1);
			return;
		}
		
		if (json.charAt(index) == '}') {
			if(groups.charAt(groups.length() - 1) != '{') {
				throw new RuntimeException("Invalid Json at index: " + index);
			}
			index++;
			groups.deleteCharAt(groups.length() - 1);
			return;
		}
		
		
		
		sb.append(json.charAt(index));
		prepareElement(sb, ++index, groups);
	}
	
	public static boolean isArray(String js) {
		return js.matches(JsonConstants.isArrayRegex);
	}
}
