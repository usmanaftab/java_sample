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
	private Logger log = Logger.getLogger(JsonObjectTest.class);
	private IMapperFactory mf;

	public void setUp() {
		mf = Mapper.getJsonMapperFactory();
	}

	public void testSimpleJson() throws BasicException {
		log.info("Testing simple json");
		INotationObj obj = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("simple.txt"));
		assertNotNull(obj);
	}

	public void testArrayJson() throws BasicException {
		log.info("Testing full array json");
		INotationObj obj = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("full_array.txt"));
		assertNotNull(obj);
	}

	public void testAllCaseJson() throws BasicException {
		log.info("Testing all cases json");
		INotationObj obj = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("all_case.txt"));
		assertNotNull(obj);
	}

}
