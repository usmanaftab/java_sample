/**
 * 
 */
package com.mycompany.app;

import junit.framework.TestCase;

/**
 * @author boy
 *
 */
public class RegexTest extends TestCase {
	
	public void testR1() {
		String regex = "^\\[.*\\]$";
		String json = Utils.readStream(ClassLoader.getSystemResourceAsStream("full_array.txt")).toString();
		json.replaceAll(".*\\s*.*", "");
		assertTrue(json.matches(regex));
		for(String s : json.split(regex)) {
			System.out.println(s);
		}
		
	}

}
