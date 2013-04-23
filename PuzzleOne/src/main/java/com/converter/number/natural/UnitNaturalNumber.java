package com.converter.number.natural;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.Constants;

public class UnitNaturalNumber extends NaturalNumber 
{
	
	public UnitNaturalNumber(String inputNumber) throws NaturalNumberException 
	{
		super(inputNumber);
		
		if(this.getNumberLength() > Constants.ONE)
		{
			throw new NaturalNumberException(Constants.Error.NATURAL_BOUNDARY);
		}
	}

	public String getStringEquivalentNumber() 
	{
		String unitNumber;
		if(this.getNumberLength() == Constants.ONE)
			unitNumber = Constants.BASIC_MAPPINGS.get(this.getNumberAsInteger());
		else
			unitNumber = Constants.QUOTES;
		return unitNumber;
	}

}
