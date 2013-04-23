package com.converter.number;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.*;
import com.converter.number.utility.Constants;

/**
 * Factory for number creations
 */
public class NumberFactory extends AbstractNumberFactory{
	
	/**
	 * Factory method for getting natural numbers
	 * @param number
	 * @return type of natural number depending on its length
	 * @throws NaturalNumberException
	 */
	public NaturalNumber getNaturalNumber(String number) throws NaturalNumberException
	{
		/*
		 * Needed validateNumberPattern to avoid get a false length. Eg 0005, length=1
		 */
		String validatedNumber = NaturalNumber.validateNumberPattern(number);
			
		switch (validatedNumber.length())
		{
		case Constants.ONE:
			return new UnitNaturalNumber(number);		//Unit natural number creation
		case Constants.TWO:
			return new TenNaturalNumber(number);		//Ten natural number creation
		case Constants.THREE:
			return new HundredNaturalNumber(number);	//Hundred natural number creation
		default:
			return new LargeNaturalNumber(number);	//Larger than hundred natural number creation
		}
		
	}
}
