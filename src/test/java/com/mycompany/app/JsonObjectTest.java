/**
 * 
 */
package com.mycompany.app;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

/**
 * @author boy
 *
 */
public class JsonObjectTest extends TestCase {
	private Logger log = Logger.getLogger(JsonObjectIsArrayTest.class);
	private IMapperFactory mf;
	
	public void setUp() {
		mf = Mapper.getJsonMapperFactory();
	}
	
	public void testJson() {
		log.info("Testing json");
		INotationObj jp = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("full_array.txt"));
		assertNotNull(jp);
	}

}
