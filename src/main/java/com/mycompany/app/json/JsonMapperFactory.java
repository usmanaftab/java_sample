/**
 * 
 */
package com.mycompany.app.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.mycompany.app.BasicException;
import com.mycompany.app.IMapperFactory;
import com.mycompany.app.INotationObj;
import com.mycompany.app.Utils;

/**
 * @author boy
 * 
 */
public class JsonMapperFactory implements IMapperFactory {

	public INotationObj createNotationObject(String json) throws BasicException {
		try {
			JsonParser jp = new JsonParser();
			return jp.buildTree(json);
		} catch (InvalidJsonException e) {
			throw new BasicException(e);
		}
	}

	public INotationObj createNotationObject(File file) throws IOException, BasicException {
		return createNotationObject(Utils.readFile(file).toString());
	}

	public INotationObj createNotationObject(InputStream is) throws BasicException {
		return createNotationObject(Utils.readStream(is).toString());
	}

}
