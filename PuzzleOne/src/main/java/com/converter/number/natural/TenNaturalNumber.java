package com.converter.number.natural;

import com.converter.number.AbstractNumberFactory;
import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.*;

public class TenNaturalNumber extends NaturalNumber
{	
	public TenNaturalNumber(String inputNumber) throws NaturalNumberException
	{
		super(inputNumber);
	}
	
	public String getStringEquivalentNumber () throws NaturalNumberException 
	{	
//		if(this.getFirstDigit(this.getNumber()) == 0)
//		{
//			return new UnitNaturalNumber(this.getNumber()).getStringEquivalentNumber();
//		} 
//		else 
		if (Constants.BASIC_MAPPINGS.containsKey(this.getNumberAsInteger()))
		{	
			return Constants.BASIC_MAPPINGS.get(this.getNumberAsInteger());
		}
		else 
		{
			return Constants.BASIC_MAPPINGS.get(Integer.parseInt(this.getFirstDigit(this.getNumber())+Constants.ZERO_STRING)) 
					+ Constants.SINGLE_SPACE
					+ new AbstractNumberFactory().getNumberFactory().getNaturalNumber(String.valueOf(this.getSecondDigit(this.getNumber()))).getStringEquivalentNumber();
		}	
	}

}
