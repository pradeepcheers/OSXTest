package com.converter.number;

import com.converter.number.exception.InvalidInputException;
import com.converter.number.utility.*;

public class TenNaturalNumber extends NaturalNumber
{	
	public TenNaturalNumber(String inputNumber) throws InvalidInputException
	{
		super(inputNumber);
	}
	
	public String getStringRepresentationOfTenthNaturalNumber() throws InvalidInputException 
	{	
		if(getTenthPlaceInteger(this.getNumber()) == 0)
			return new UnitNaturalNumber(this.getNumber()).getStringRepresentationOfUnitNaturalNumber();
		else if(Constants.ALPHABET_CONSTANTS.containsKey(Integer.parseInt(this.getNumber())))
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(this.getNumber()));
		else {
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(this.getTenthPlaceInteger(this.getNumber())+Constants.ZERO_STRING)) 
					+ Constants.SINGLE_SPACE
					+ new UnitNaturalNumber(String.valueOf(this.getUnitPlace(this.getNumber()))).getStringRepresentationOfUnitNaturalNumber();
		}
	}
	
	private int getTenthPlaceInteger(String number) {
		return getFirstDigit(number);
	}
	
	private int getUnitPlace(String number) {
		return getSecondDigit(number);
	}

}
