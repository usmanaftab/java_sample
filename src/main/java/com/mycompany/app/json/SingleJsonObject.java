/**
 * 
 */
package com.mycompany.app.json;

import java.util.Date;
import java.util.HashMap;

import com.mycompany.app.BasicException;
import com.mycompany.app.INotationObj;
/**
 * @author boy
 *
 */
class SingleJsonObject extends JsonObject {
	
	protected HashMap<String , String> map;

	/**
	 * @param json
	 */
	public SingleJsonObject(String json) {
		super(json);
		init();
	}
	
	private void init() {
		JsonParser jp = new JsonParser(getJson());
		map = new HashMap<String, String>();
		while(jp.hasMore()) {
			String str = jp.nextElement();
			String[] kv = str.split(",");
			if(kv == null || kv.length < 1) {
				throw new RuntimeException("Invalid json");
			}
			map.put(kv[0], kv[1]);
		}
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.INotationObj#getNotationObj(java.lang.String)
	 */
	public INotationObj getNotationObj(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getBoolean(java.lang.String)
	 */
	public Boolean getBoolean(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getBytes(java.lang.String)
	 */
	public byte[] getBytes(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getDouble(java.lang.String)
	 */
	public Double getDouble(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getInt(java.lang.String)
	 */
	public Integer getInt(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getLong(java.lang.String)
	 */
	public Long getLong(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getObject(java.lang.String)
	 */
	public Object getObject(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getString(java.lang.String)
	 */
	public String getString(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.app.DataRead#getTimestamp(java.lang.String)
	 */
	public Date getTimestamp(String column) throws BasicException {
		// TODO Auto-generated method stub
		return null;
	}

}
