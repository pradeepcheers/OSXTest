package com.converter.number.natural;

import com.converter.number.AbstractNumberFactory;
import com.converter.number.exception.NaturalNumberException;
import com.converter.number.utility.Constants;

public class LargeNaturalNumber extends NaturalNumber
{
	
	public LargeNaturalNumber(String inputNumber) throws NaturalNumberException {
		super(inputNumber);
	}

	public String getStringEquivalentNumber() throws NaturalNumberException 
	{	
		String [] outArray = new String[3];
		for(int sIndex=0, args=0, i = getNumberLength(); i>0; i=i-3, args++) 
		{
			sIndex = (i < 3) ? 0 : i-3;
			outArray[args] = new AbstractNumberFactory().getNumberFactory().getNaturalNumber(this.getNumber().substring(sIndex, i)).getStringEquivalentNumber();
		}
		return this.getFormattedOutput(outArray);
	}
	
	private String getFormattedOutput(String [] outArray)
	{
		String outPut = new String();
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
}
