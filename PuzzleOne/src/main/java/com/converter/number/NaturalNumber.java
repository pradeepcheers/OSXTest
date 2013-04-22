package com.converter.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.converter.number.exception.NotANumberException;
import com.converter.number.exception.OutOfLimitException;
import com.converter.number.utility.Constants;

public class NaturalNumber {
	private int number;
	private String numberInString;
	HundredNaturalNumber hundredNatural = new HundredNaturalNumber();
	
	public String converter(String numberToConvert) throws OutOfLimitException, NotANumberException {
	    number = this.validator(numberToConvert);
		this.boundChecker();
		numberInString = String.valueOf(number);
		int numberLength = getNumberLength();
		String outPut= "",temp = "";
		String [] outArray = new String[3];
		for(int factor=0, args=0, i = numberLength; i>0; i=i-3, args++) {
			factor = (i < 3) ? 0 : i-3;
			temp = numberInString.substring(factor, i);
			outArray[args] = hundredNatural.getHundredthNaturalAlphabetNumber(temp);
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
	
	private int validator(String numberToConvert) throws NotANumberException{
		Pattern p = Pattern.compile( "([0-9]*)" );
		Matcher m = p.matcher(numberToConvert);
		if(m.matches()) {
//			System.out.println(Integer.parseInt(numberToConvert));
			return Integer.parseInt(numberToConvert);
		}
		else
			throw new NotANumberException();
	}
	
	private void boundChecker () throws OutOfLimitException{
		if(this.getNumberLength() > Constants.MAX_LIMIT_LENGTH || number < Constants.MIN_LIMIT_LENGTH){
			throw new OutOfLimitException();
		}
	}
	
	private int getNumberLength () {
		return String.valueOf(number).length();
	}

}
