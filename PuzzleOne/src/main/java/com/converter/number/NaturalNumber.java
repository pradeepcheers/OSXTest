package com.converter.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.converter.number.exception.InvalidInputException;
import com.converter.number.exception.OutOfLimitException;
import com.converter.number.utility.Constants;

public class NaturalNumber {
	private String number;
	private int numberLength;
	
	public NaturalNumber (String inputNumber) throws InvalidInputException, OutOfLimitException {
		this.setNumber(validateNumberPattern(inputNumber));
		this.setNumberLength(this.number.length());
	}
	
	
	public String getStringRepresentationOfNumber() throws OutOfLimitException, InvalidInputException {
		
		int numberLength = getNumberLength();
		String outPut= "",temp = "";
		String [] outArray = new String[3];
		for(int factor=0, args=0, i = numberLength; i>0; i=i-3, args++) {
			factor = (i < 3) ? 0 : i-3;
			temp = number.substring(factor, i);
			outArray[args] = new HundredNaturalNumber().getStringRepresentationOfHundredthNaturalNumber(temp);
		}
		
		if (outArray[2] != null && !outArray[2].equalsIgnoreCase(""))
			outPut = outArray[2] + " million ";
		if (outArray[1] != null && !outArray[1].equalsIgnoreCase("") )
			if (outPut.endsWith(" million ") && outArray[1].equalsIgnoreCase("zero"))
				outArray[1] = "";
			else
				outPut += outArray[1] + " thousand ";
		if (outArray[0] != null && !outArray[0].equalsIgnoreCase(""))
			if ((outPut.endsWith(" million ") || outPut.endsWith(" thousand ")) && outArray[0].equalsIgnoreCase("zero"))
				outArray[0] = "";
			else
				outPut += outArray[0];
		
		return  outPut.trim().replaceAll(" +", " ");
	}
	
	private static String validateNumberPattern(String number) throws InvalidInputException, OutOfLimitException{
		if(number == null)
			throw new InvalidInputException();
		
		Long longNumber = Long.parseLong(number);
		
		if(longNumber < Constants.ZERO)
			throw new InvalidInputException();
		
		number = String.valueOf(longNumber);
		
		Pattern p = Pattern.compile( "([0-9]*)" );
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
	
	private int getNumberLength () {
		return numberLength;
	}

	public void setNumberLength(int numberLength) {
		this.numberLength = numberLength;
	}
}
