/**
 * 
 */
package com.mycompany.app;

import com.mycompany.app.json.JsonMapperFactory;

/**
 * @author boy
 *
 */
public class Mapper {
	
	public static IMapperFactory getJsonMapperFactory() {
		return new JsonMapperFactory();
	}

}
