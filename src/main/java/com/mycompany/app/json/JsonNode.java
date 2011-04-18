/**
 * 
 */
package com.mycompany.app.json;

import com.mycompany.app.BasicException;
import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
abstract class JsonNode implements INotationObj {

	public boolean isArray() {
		return this instanceof JsonNodeArray;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getINotationObj(int)
	 */
	public INotationObj getINotationObj(int index) throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getNotationObj(java.lang.String)
	 */
	public INotationObj getINotationObj(String key) throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toBoolean()
	 */
	public Boolean toBoolean() throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toBytes()
	 */
	public byte[] toBytes() throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toDouble()
	 */
	public Double toDouble() throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toInt()
	 */
	public Integer toInt() throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toLong()
	 */
	public Long toLong() throws BasicException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toObject()
	 */
	public Object toObject() throws BasicException {
		return null;
	}

}
