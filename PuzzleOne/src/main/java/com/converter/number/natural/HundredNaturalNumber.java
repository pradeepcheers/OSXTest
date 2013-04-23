package com.converter.number.natural;

import com.converter.number.AbstractNumberFactory;
import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.Constants;


public class HundredNaturalNumber extends NaturalNumber
{
	private String hundredthNumberInAlphabet, tenthAndUnitNumbersInAlphabet;
	
	public HundredNaturalNumber(String inputNumber)	throws NaturalNumberException 
	{
		super(inputNumber);
		
		if(this.getNumberLength() > Constants.THREE)
		{
			throw new NaturalNumberException(Constants.Error.NATURAL_BOUNDARY);
		}
	}

	public String getStringEquivalentNumber() throws NaturalNumberException
	{
		if(this.getHundredthPlace() != 0)
			hundredthNumberInAlphabet = getHundredthNumberInAlphabet();	
		
		tenthAndUnitNumbersInAlphabet = new AbstractNumberFactory().getNumberFactory().getNaturalNumber(this.getTenthAndUnitPlace()).getStringEquivalentNumber();
		
		return outputAppender(this.getHundredthPlace());
	}
	
	private String getHundredthNumberInAlphabet() throws NaturalNumberException
	{
		hundredthNumberInAlphabet = new AbstractNumberFactory().getNumberFactory().getNaturalNumber(String.valueOf(this.getHundredthPlace())).getStringEquivalentNumber();
		return hundredthNumberInAlphabet += Constants.HUNDRED;
	}
	
	private String outputAppender(int hundredthPlace) 
	{
		if (hundredthPlace != 0 && (tenthAndUnitNumbersInAlphabet.equals("") || tenthAndUnitNumbersInAlphabet.equalsIgnoreCase(Constants.ZERO_IN_ALPHABET)))
			return hundredthNumberInAlphabet; 
		else if (hundredthPlace != 0 && !tenthAndUnitNumbersInAlphabet.equals(""))
			return hundredthNumberInAlphabet + Constants.AND + tenthAndUnitNumbersInAlphabet;
		else
			return tenthAndUnitNumbersInAlphabet;
	}
	
	private int getHundredthPlace() 
	{
		if(this.getNumberLength() == Constants.THREE)
			return this.getFirstDigit(this.getNumber());
		else
			return Constants.ZERO;
	}
	
	private String getTenthAndUnitPlace() 
	{
		if(this.getNumberLength() == Constants.THREE)
			return this.getNumber().substring(Constants.ONE);
		else
			return this.getNumber();
	}
}
