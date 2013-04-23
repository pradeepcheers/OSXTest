package com.converter.number.natural;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.converter.number.Convertable;
import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.Constants;

public abstract class NaturalNumber implements Convertable
{
	private String number;
	private int numberLength;
	private int numberAsInteger;

	public NaturalNumber (String inputNumber) throws NaturalNumberException 
	{
		this.setNumber(validateNumberPattern(inputNumber));
		this.setNumberLength(this.getNumber().length());
		this.setNumberAsInteger(Integer.parseInt(this.getNumber()));
	}
	
	public static String validateNumberPattern(String number) throws NaturalNumberException
	{
		if(number == null || number.equals(""))
			throw new NaturalNumberException(Constants.Error.NATURAL_NULL);
		
		Long longNumber = Long.parseLong(number);
		
		if(longNumber < Constants.ZERO)
			throw new NaturalNumberException(Constants.Error.NATURAL_BOUNDARY);
		
		number = String.valueOf(longNumber);
		
		Pattern p = Pattern.compile(Constants.NUMBER_PATTERN);
		Matcher m = p.matcher(number);
		if(!m.matches())
			throw new NaturalNumberException(Constants.Error.NATURAL_INVALID_FORMAT);
		
		if(number.length() > Constants.MAX_LIMIT_LENGTH || Long.parseLong(number) < Constants.MIN_LIMIT_LENGTH)
			throw new NaturalNumberException(Constants.Error.NATURAL_BOUNDARY);
		
		return number;
	}
	
	protected String getNumber() {
		return number;
	}

	private void setNumber(String number) {
		this.number = number;
	}
	
	protected int getNumberLength () {
		return numberLength;
	}

	private void setNumberLength(int numberLength) {
		this.numberLength = numberLength;
	}
	
	protected int getNumberAsInteger() {
		return numberAsInteger;
	}

	private void setNumberAsInteger(int numberAsInteger) {
		this.numberAsInteger = numberAsInteger;
	}
	
	protected int getFirstDigit(String number) {
		return Character.getNumericValue(number.charAt(Constants.ZERO));
	}
	
	protected int getSecondDigit(String number) {
		return Character.getNumericValue(number.charAt(Constants.ONE));
	}

}
