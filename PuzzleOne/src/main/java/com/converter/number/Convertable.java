package com.converter.number;

import com.converter.number.exception.NaturalNumberException;


/**
 * @author pradeep
 *
 */
public interface Convertable {
	
	/**
	 * @return the equivalent number in British English words
	 * @throws NaturalNumberException 
	 */
	public String getStringEquivalentNumber() throws NaturalNumberException;
}
