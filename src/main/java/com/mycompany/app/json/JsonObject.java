/**
 * 
 */
package com.mycompany.app.json;

import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
public abstract class JsonObject implements INotationObj {

	protected String json;
	private boolean array;

	/**
	 * @param json
	 */
	public JsonObject(final String js) {
		json = js;
		if(json == null || json.length() < 1) {
			array = false;
			return;
		}
		
		array = json.matches(JsonConstants.isArrayRegex);
	}
	
	/** 
	 * true: if json is an array.
	 */
	public boolean isArray() {
		return array;
	}
	
	/**
	 * @return the json
	 */
	protected String getJson() {
		return json;
	}
	
	/** 
	 * returns original json
	 */
	@Override
	public String toString() {
		return json;
	}
	
}
