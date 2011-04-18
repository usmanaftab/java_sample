/**
 * 
 */
package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author boy
 *
 */
public interface IMapperFactory {
	
	public INotationObj createNotationObject(String json) throws BasicException;
	
	public INotationObj createNotationObject(File file) throws IOException, BasicException;
	
	public INotationObj createNotationObject(InputStream is) throws BasicException;

}
