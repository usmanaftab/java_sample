/**
 * 
 */
package com.mycompany.app;

import org.apache.log4j.Logger;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import junit.framework.TestCase;

/**
 * @author boy
 * 
 */
public class JsonObjectIsArrayTest extends TestCase {
	private Logger log = Logger.getLogger(JsonObjectIsArrayTest.class);
	private IMapperFactory mf;
	
	public void setUp() {
		mf = Mapper.getJsonMapperFactory();
	}

	public void testEmptyString() {
		log.info("Testing Empty String");
		String s = "";
		INotationObj jp = mf.createNotationObject(s);
		assertNotNull(jp);
		assertTrue(!jp.isArray());
	}

	public void testEmptyArray() {
		log.info("Testing Empty Array");
		String s = "[]";
		INotationObj jp = mf.createNotationObject(s);
		assertNotNull(jp);
		assertTrue(jp.isArray());
	}
	
	public void testFullArray() {
		log.info("Testing Full Array");
		INotationObj jp = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("full_array.txt"));
		assertNotNull(jp);
		assertTrue(jp.isArray());
	}
	
	public void testInvalidArray() {
		log.info("Testing Invalid Array");
		String s = "[";
		INotationObj jp = mf.createNotationObject(s);
		assertNotNull(jp);
		assertTrue(!jp.isArray());
	}

}
