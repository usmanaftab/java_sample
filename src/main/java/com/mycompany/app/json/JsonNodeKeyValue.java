/**
 * 
 */
package com.mycompany.app.json;

import java.util.HashMap;

import com.mycompany.app.BasicException;
import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
class JsonNodeKeyValue extends JsonNode {

	private HashMap<String, JsonNode> map;

	/**
	 * 
	 */
	public JsonNodeKeyValue() {
		map = new HashMap<String, JsonNode>();
	}

	/**
	 * @param key
	 * @param buildTree
	 */
	public void add(String key, JsonNode jsonNode) {
		map.put(key, jsonNode);
	}

	/**
	 * @param key
	 */
	public JsonNode get(String key) {
		return map.get(key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getNotationObj(java.lang.String)
	 */
	public INotationObj getINotationObj(String key) throws BasicException {
		return map.get(key);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getINotationObj(int)
	 */
	public INotationObj getINotationObj(int index) throws BasicException {
		try {
			return map.get(map.keySet().toArray()[index]);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

}
