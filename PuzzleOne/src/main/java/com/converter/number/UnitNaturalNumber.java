package com.converter.number;

import com.converter.number.exception.InvalidInputException;
import com.converter.number.utility.Constants;

public class UnitNaturalNumber extends NaturalNumber 
{
	
	public UnitNaturalNumber(String inputNumber) throws InvalidInputException 
	{
		super(inputNumber);
	}

	public String getStringRepresentationOfUnitNaturalNumber() 
	{
		String unitNumber;
		if(this.getNumberLength() == Constants.ONE)
			unitNumber = Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(this.getNumber()));
		else
			unitNumber = Constants.QUOTES;
		return unitNumber;
	}

}
