/**
 * 
 */
package com.mycompany.app.json;

import java.util.ArrayList;

import com.mycompany.app.BasicException;
import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
class JsonNodeArray extends JsonNode {

	ArrayList<JsonNode> list;

	/**
	 * 
	 */
	public JsonNodeArray() {
		list = new ArrayList<JsonNode>();
	}

	/**
	 * 
	 */
	public void add(JsonNode jn) {
		list.add(jn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getINotationObj(int)
	 */
	public INotationObj getINotationObj(int index) throws BasicException {
		try {
			return list.get(index);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

}
