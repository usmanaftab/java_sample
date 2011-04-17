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
	
	public INotationObj createNotationObject(String json);
	
	public INotationObj createNotationObject(File file) throws IOException;
	
	public INotationObj createNotationObject(InputStream is);

}
