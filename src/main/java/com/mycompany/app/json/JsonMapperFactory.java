/**
 * 
 */
package com.mycompany.app.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.mycompany.app.IMapperFactory;
import com.mycompany.app.INotationObj;
import com.mycompany.app.Utils;

/**
 * @author boy
 * 
 */
public class JsonMapperFactory implements IMapperFactory {

	public INotationObj createNotationObject(String json) {
		if(JsonParser.isArray(json)) {
			return new ArrayJsonObject(json);
		}
		
		return new SingleJsonObject(json);
	}

	public INotationObj createNotationObject(File file) throws IOException {
		return createNotationObject(Utils.readFile(file).toString());
	}

	public INotationObj createNotationObject(InputStream is) {
		return createNotationObject(Utils.readStream(is).toString());
	}

}
