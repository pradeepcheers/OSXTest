package com.converter.number.natural;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.Constants;

public class UnitNaturalNumber extends NaturalNumber 
{
	
	public UnitNaturalNumber(String inputNumber) throws NaturalNumberException 
	{
		super(inputNumber);
	}

	public String getStringEquivalentNumber() 
	{
		String unitNumber;
		if(this.getNumberLength() == Constants.ONE)
			unitNumber = Constants.BASIC_MAPPINGS.get(Integer.parseInt(this.getNumber()));
		else
			unitNumber = Constants.QUOTES;
		return unitNumber;
	}

}
