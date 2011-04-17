/**
 * 
 */
package com.mycompany.app;

import java.util.Date;

/**
 * @author boy
 *
 */
public interface DataRead {
	
	public Integer getInt(String column) throws BasicException;

	public String getString(String column) throws BasicException;

	public Long getLong(String column) throws BasicException;

	public Double getDouble(String column) throws BasicException;

	public Boolean getBoolean(String column) throws BasicException;

	public Date getTimestamp(String column) throws BasicException;

	public byte[] getBytes(String column) throws BasicException;

	public Object getObject(String column) throws BasicException;

}
