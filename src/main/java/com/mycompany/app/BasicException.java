/**
 * 
 */
package com.mycompany.app;

/**
 * @author boy
 *
 */
public class BasicException extends Exception {

	private static final long serialVersionUID = 1L;

	public BasicException(String msg) {
		super(msg);
	}

	public BasicException(Exception exception) {
		super(exception.getMessage());
		this.initCause(exception);
	}

	public BasicException(String msg, Exception exception) {
		super(msg);
		this.initCause(exception);
	}
}
