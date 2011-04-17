/**
 * 
 */
package com.mycompany.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author boy
 *
 */
public class Utils {
	
	public static StringBuffer readFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		return readStream(is);
	}
	
	public static StringBuffer readStream(InputStream is) {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(is, "UTF-8");
		try {
			while (scanner.hasNextLine()) {
				sb.append(scanner.nextLine());
			}
		} finally {
			scanner.close();
		}
		return sb;
	}

}
