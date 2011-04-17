/**
 * 
 */
package com.mycompany.app;

/**
 * @author boy
 *
 */
public interface INotationObj extends DataRead {
	
	public INotationObj getNotationObj(String column) throws BasicException;
	
	public boolean isArray();

}
