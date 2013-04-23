package com.converter.number.exception;

/**
 * Box for delimiting natural numbers exceptions.
 * @author Pradeep
 *
 */
public class NaturalNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @see java.lang.Exception
	 */
	public NaturalNumberException(String message) {
		super(message);
	}
}
