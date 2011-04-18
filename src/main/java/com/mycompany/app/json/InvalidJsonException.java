/**
 * 
 */
package com.mycompany.app.json;

/**
 * @author boy
 *
 */
public class InvalidJsonException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidJsonException(String msg) {
		super(msg);
	}

	public InvalidJsonException(Exception exception) {
		super(exception.getMessage());
		this.initCause(exception);
	}

	public InvalidJsonException(String msg, Exception exception) {
		super(msg);
		this.initCause(exception);
	}
}
