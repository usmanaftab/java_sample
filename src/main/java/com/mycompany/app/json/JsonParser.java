/**
 * 
 */
package com.mycompany.app.json;

import org.apache.log4j.Logger;

import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
public class JsonParser {
	private static final Logger log = Logger.getLogger(JsonParser.class);
	
	private static final String matchCase1Regex = "^\\s*\\[\\s*\\{.*";
	private static final String matchCase2Regex = "^\\s*\\{\\s*\"[\\w\\d_]+\"\\s*:.*";
	private static final String matchCase3Regex = "^\\s*(null|true|false|\".*\"|\\d+)\\s*(,|\\}).*";
	private static final String matchCase4Regex = "^\\s*\".*\".*";
	private static final String matchCase5Regex = "^.*,.*";
	private static final String matchCase6Regex = "^\\s*\\].*";
	private static final String matchCase7Regex = "^\\s*$";
	private static final String matchCase8Regex = "^\\s*,.*";
	private static final String matchCase9Regex = "^\\s*\\}.*";

	private int index;
	private String json;

	public INotationObj buildTree(String json) throws InvalidJsonException {
		this.index = 0;
		this.json = json;
		JsonNode jn = buildTree();
		if (index < json.length()) {
			if (!json.substring(index).matches(matchCase7Regex)) {
				throw new InvalidJsonException("Invalid json at index: "
						+ index + "string: " + json.substring(index));
			}
		}
		return jn;
	}

	private JsonNode buildTree() throws InvalidJsonException {
		if (index >= json.length()) {
			throw new InvalidJsonException("Invalid json at index: " + index
					+ "string: " + json.substring(index));
		}

		log.debug(json.substring(index));
		// CASE: [
		if (matches(matchCase1Regex)) {
			moveTill("[");
			JsonNodeArray jn = new JsonNodeArray();
			do {
				jn.add(buildTree());
				if (!matches(matchCase8Regex)) {
					break;
				}
				moveTill(",");
			} while (true);
			if (!matches(matchCase6Regex)) {
				throw new InvalidJsonException(
						"closing braces/brakets missing at index: " + index);
			}
			moveTill("]");
			return jn;
		}

		// CASE: { "foo" :
		if (matches(matchCase2Regex)) {
			moveTill("{");
			JsonNodeKeyValue jn = new JsonNodeKeyValue();
			do {
				String key = extractKey();
				log.debug("key: " + key);
				moveTill(":");
				jn.add(key.toString(), buildTree());
				if (!matches(matchCase8Regex)) {
					break;
				}
				moveTill(",");
			} while (true);
			if (!matches(matchCase9Regex)) {
				throw new InvalidJsonException("closing braces/brakets missing at index: " + index);
			}
			moveTill("}");
			return jn;
		}

		// CASE: "bar" } || 1234 }
		if (matches(matchCase3Regex)) {
			String val = extractVal();
			log.debug("val: " + val);
			JsonNodeValue jn = new JsonNodeValue();
			jn.setValue(val.toString());
			return jn;
		}

		throw new InvalidJsonException("Invalid json at index: " + index + "string: " + json.substring(index));
	}

	private String extractKey() {
		int beginIndex = indexOf("\"") + 1;
		int endIndex = json.indexOf("\"", beginIndex);
		String key = json.substring(beginIndex, endIndex);
		index = endIndex + 1;
		return key;
	}

	private String extractVal() throws InvalidJsonException {
		if (matches(matchCase4Regex)) {
			int beginIndex = indexOf("\"") + 1;
			int endIndex = json.indexOf("\"", beginIndex);
			String val = json.substring(beginIndex, endIndex);
			index = endIndex + 1;
			return val;
		}

		int endIndex = json.matches(matchCase5Regex) ? indexOf(",") : indexOf("}");
		String val = json.substring(index, endIndex);
		val.trim();
		index = endIndex;
		return val;

	}

	private void moveTill(String till) {
		index = json.indexOf(till, index) + 1;
	}

	private boolean matches(String regex) {
		return json.substring(index).matches(regex);
	}
	
	private int indexOf(String s) {
		return json.indexOf(s, index);
	}
}
