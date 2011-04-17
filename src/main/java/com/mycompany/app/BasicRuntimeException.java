/**
 * 
 */
package com.mycompany.app;

/**
 * @author boy
 *
 */
public class BasicRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BasicRuntimeException(String msg) {
		super(msg);
	}

	public BasicRuntimeException(Exception exception) {
		super(exception.getMessage());
		this.initCause(exception);
	}

	public BasicRuntimeException(String msg, Exception exception) {
		super(msg);
		this.initCause(exception);
	}
}
