/**
 * 
 */
package com.mycompany.app;

/**
 * @author boy
 *
 */
public interface DataRead {
	
	public Integer toInt() throws BasicException;

	public Long toLong() throws BasicException;

	public Double toDouble() throws BasicException;

	public Boolean toBoolean() throws BasicException;

	public byte[] toBytes() throws BasicException;

	public Object toObject() throws BasicException;
}
