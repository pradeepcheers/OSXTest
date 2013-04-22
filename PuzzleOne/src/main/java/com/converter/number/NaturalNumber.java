package com.converter.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.converter.number.exception.InvalidInputException;
import com.converter.number.exception.OutOfLimitException;
import com.converter.number.utility.Constants;

public class NaturalNumber 
{
	private String number;
	private int numberLength;
	
	public NaturalNumber (String inputNumber) throws InvalidInputException, OutOfLimitException 
	{
		this.setNumber(validateNumberPattern(inputNumber));
		this.setNumberLength(this.number.length());
	}
	
	
	public String getStringRepresentationOfNumber() throws OutOfLimitException, InvalidInputException 
	{	
		String [] outArray = new String[3];
		for(int sIndex=0, args=0, i = numberLength; i>0; i=i-3, args++) 
		{
			sIndex = (i < 3) ? 0 : i-3;
			outArray[args] = new HundredNaturalNumber().getStringRepresentationOfHundredthNaturalNumber(getNumber().substring(sIndex, i));
		}
		return this.getFormattedOutput(outArray);
	}
	
	private String getFormattedOutput(String [] outArray)
	{
		String outPut = "";
		if (outArray[2] != null && !outArray[2].equalsIgnoreCase(Constants.QUOTES))
			outPut = outArray[2] + Constants.MILLION;
		if (outArray[1] != null && !outArray[1].equalsIgnoreCase(Constants.QUOTES) )
			if (!(outPut.endsWith(Constants.MILLION) && outArray[1].equalsIgnoreCase(Constants.ZERO_IN_ALPHABET)))
				outPut += outArray[1] + Constants.THOUSAND;
		if (outArray[0] != null && !outArray[0].equalsIgnoreCase(Constants.QUOTES))
			if (!((outPut.endsWith(Constants.MILLION) || outPut.endsWith(Constants.THOUSAND)) && outArray[0].equalsIgnoreCase(Constants.ZERO_IN_ALPHABET)))
				outPut += outArray[0];
		
		return  outPut.trim().replaceAll(Constants.MULTIPLE_SPACES, Constants.SINGLE_SPACE);
	}
	
	private static String validateNumberPattern(String number) throws InvalidInputException, OutOfLimitException{
		if(number == null)
			throw new InvalidInputException();
		
		Long longNumber = Long.parseLong(number);
		
		if(longNumber < Constants.ZERO)
			throw new InvalidInputException();
		
		number = String.valueOf(longNumber);
		
		Pattern p = Pattern.compile(Constants.NUMBER_PATTERN);
		Matcher m = p.matcher(number);
		if(!m.matches())
			throw new InvalidInputException();
		
		if(number.length() > Constants.MAX_LIMIT_LENGTH || Long.parseLong(number) < Constants.MIN_LIMIT_LENGTH)
			throw new OutOfLimitException();
		
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

	public void setNumberLength(int numberLength) {
		this.numberLength = numberLength;
	}
}
