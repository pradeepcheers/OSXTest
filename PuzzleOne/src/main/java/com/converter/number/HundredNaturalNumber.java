package com.converter.number;

import com.converter.number.exception.InvalidInputException;
import com.converter.number.utility.Constants;


public class HundredNaturalNumber extends NaturalNumber{
	
	public HundredNaturalNumber(String inputNumber)	throws InvalidInputException 
	{
		super(inputNumber);
		
		if(this.getNumberLength() > Constants.THREE)
		{
			throw new InvalidInputException(Constants.Error.NATURAL_BOUNDARY);
		}
	}

	private String hundredthNumberInAlphabet = "", tenthAndUnitNumbersInAlphabet = "";
	
	public String getStringRepresentationOfHundredthNaturalNumber() throws InvalidInputException
	{
		if(this.getHundredthPlace() != 0)
			hundredthNumberInAlphabet = getHundredthNumberInAlphabet();	
		
		tenthAndUnitNumbersInAlphabet = new TenNaturalNumber(this.getTenthAndUnitPlace()).getStringRepresentationOfTenthNaturalNumber();
		
		return outputAppender(this.getHundredthPlace());
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
		if(this.getNumber().length() == 3)
			return this.getFirstDigit(this.getNumber());
		else
			return Constants.ZERO;
	}
	
	private String getHundredthNumberInAlphabet() throws InvalidInputException
	{
		UnitNaturalNumber hundredthNatural = new UnitNaturalNumber(String.valueOf(this.getHundredthPlace()));
		hundredthNumberInAlphabet = hundredthNatural.getStringRepresentationOfUnitNaturalNumber();
		return hundredthNumberInAlphabet += Constants.HUNDRED;
	}

	private String getTenthAndUnitPlace() 
	{
		if(this.getNumberLength() == 3)
			return this.getNumber().substring(Constants.ONE);
		else
			return this.getNumber();
	}
}
