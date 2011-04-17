/**
 * 
 */
package com.mycompany.app.json;

import java.util.ArrayList;
import java.util.Date;

import com.mycompany.app.BasicException;
import com.mycompany.app.INotationObj;

/**
 * @author boy
 * 
 */
class ArrayJsonObject extends JsonObject {

	ArrayList<SingleJsonObject> jsonObjs;

	/**
	 * @param json
	 */
	public ArrayJsonObject(String json) {
		super(json);
		init();
	}
	
	private void init() {
		JsonParser jp = new JsonParser(getJson());
		jsonObjs = new ArrayList<SingleJsonObject>();
		while(jp.hasMore()) {
			String s = jp.nextElement();
			jsonObjs.add(new SingleJsonObject(s));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.INotationObj#getNotationObj(java.lang.String)
	 */
	public INotationObj getNotationObj(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getBoolean(java.lang.String)
	 */
	public Boolean getBoolean(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getBytes(java.lang.String)
	 */
	public byte[] getBytes(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getDouble(java.lang.String)
	 */
	public Double getDouble(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getInt(java.lang.String)
	 */
	public Integer getInt(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getLong(java.lang.String)
	 */
	public Long getLong(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getObject(java.lang.String)
	 */
	public Object getObject(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getString(java.lang.String)
	 */
	public String getString(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.app.DataRead#getTimestamp(java.lang.String)
	 */
	public Date getTimestamp(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

}
