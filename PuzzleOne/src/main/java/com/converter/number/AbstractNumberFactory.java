package com.converter.number;

/**
 * 
 * @author Pradeep Sadashivamurthy
 *
 */
public class AbstractNumberFactory {
	
	/**
	 * 
	 * @return NumberFactory
	 */
	public NumberFactory getNumberFactory()
	{
		return new NumberFactory();
	}

}
