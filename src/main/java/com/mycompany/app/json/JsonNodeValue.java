/**
 * 
 */
package com.mycompany.app.json;

import com.mycompany.app.BasicException;

/**
 * @author boy
 * 
 */
class JsonNodeValue extends JsonNode {

	private String value;

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toBoolean()
	 */
	public Boolean toBoolean() throws BasicException {
		try {
			return Boolean.valueOf(value);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toBytes()
	 */
	public byte[] toBytes() throws BasicException {
		try {
			return value.getBytes();
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toDouble()
	 */
	public Double toDouble() throws BasicException {
		try {
			return Double.valueOf(value);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toInt()
	 */
	public Integer toInt() throws BasicException {
		try {
			return Integer.valueOf(value);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toLong()
	 */
	public Long toLong() throws BasicException {
		try {
			return Long.valueOf(value);
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#toObject()
	 */
	public Object toObject() throws BasicException {
		try {
			return value;
		} catch (Exception e) {
			throw new BasicException(e);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return value;
	}

}
