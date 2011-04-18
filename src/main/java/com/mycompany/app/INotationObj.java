/**
 * 
 */
package com.mycompany.app;

/**
 * @author boy
 *
 */
public interface INotationObj extends DataRead {
	
	public INotationObj getINotationObj(String key) throws BasicException;
	
	public INotationObj getINotationObj(int index) throws BasicException;
	
	public boolean isArray();

}
