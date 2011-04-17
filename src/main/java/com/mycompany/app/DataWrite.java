/**
 * 
 */
package com.mycompany.app;

import java.util.Date;

/**
 * @author boy
 *
 */
public interface DataWrite {
	
	public void setInt(String paramIndex, int iValue) throws BasicException;

	public void setString(String paramIndex, String sValue) throws BasicException;

	public void setLong(String paramIndex, Long dValue) throws BasicException;

	public void setDouble(String paramIndex, Double dValue) throws BasicException;

	public void setBoolean(String paramIndex, Boolean bValue) throws BasicException;

	public void setTimestamp(String paramIndex, Date dValue) throws BasicException;

	public void setBytes(String paramIndex, byte[] value) throws BasicException;

	public void setObject(String paramIndex, Object value) throws BasicException;

}
