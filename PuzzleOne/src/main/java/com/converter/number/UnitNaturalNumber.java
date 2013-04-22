package com.converter.number;

import com.converter.number.utility.Constants;

public class UnitNaturalNumber {
	
	public String getStringRepresentationOfUnitNaturalNumber(int number) {
		String unitNumber;
		if(String.valueOf(number).length() == Constants.ONE)
			unitNumber = Constants.ALPHABET_CONSTANTS.get(number);
		else
			unitNumber = "";
		return unitNumber;
	}

}
