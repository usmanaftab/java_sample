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
	
	public void estR1() {
		String regex = "^[\\s]*";
		String data = "     adfadsf";
		String [] sdata = data.split(regex);
		System.out.println(sdata[0].length());
		System.out.println(sdata[1]);
	}
	
	public void estR2() {
		String mregex = "^\\{[\\s]*\"[\\w\\d_]+\"[\\s]*:.*";
		String data = "{  \"adfad_adf\" , ";
		boolean a = data.matches(mregex);
		System.out.println(a);
	}
	
	public void testR3() {
//		String mregex = "^[\\s]*\".*\"[\\s]*\\}.*";
//		String mregex = "^[\\s]*[\\d]+[\\s]*\\}.*";
		String mregex = "^\\s*(null|true|false|\".*\"|\\d+)\\s*\\}.*";
		String data = " null }";
		boolean a = data.matches(mregex);
		System.out.println(a);
	}
	
	public void estR4() {
		String json = Utils.readStream(ClassLoader.getSystemResourceAsStream("all_case.txt")).toString();
		System.out.println("Before : " + json);
		json = json.replaceAll("[\\s]+", "");
		System.out.println("After : " + json);
	}

}
