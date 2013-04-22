package com.converter.number;

import com.converter.number.utility.CommonMethods;
import com.converter.number.utility.Constants;

public class HundredNaturalNumber {
	
	private String number = "", hundredthNumberInAlphabet = "", tenthAndUnitNumbersInAlphabet = "";
	
	public String getStringRepresentationOfHundredthNaturalNumber(String number){
		this.number = number;	
		if(this.getHundredthPlace() != 0)
			hundredthNumberInAlphabet = getHundredthNumberInAlphabet();	
		tenthAndUnitNumbersInAlphabet = new TenNaturalNumber().getStringRepresentationOfTenthNaturalNumber(this.getTenthAndUnitPlace());
		return outputAppender(this.getHundredthPlace());
	}
	
	private String outputAppender(int hundredthPlace) {
		if (hundredthPlace != 0 && (tenthAndUnitNumbersInAlphabet.equals("") || tenthAndUnitNumbersInAlphabet.equalsIgnoreCase(Constants.ZERO_IN_ALPHABET)))
			return hundredthNumberInAlphabet; 
		else if (hundredthPlace != 0 && !tenthAndUnitNumbersInAlphabet.equals(""))
			return hundredthNumberInAlphabet + Constants.AND + tenthAndUnitNumbersInAlphabet;
		else
			return tenthAndUnitNumbersInAlphabet;
	}
	
	private int getHundredthPlace() {
		if(number.length() == 3)
			return new CommonMethods().getLeftMostPlaceValueInInteger(number);
		else
			return 0;
	}
	
	private String getHundredthNumberInAlphabet() {
		UnitNaturalNumber hundredthNatural = new UnitNaturalNumber();
		hundredthNumberInAlphabet = hundredthNatural.getStringRepresentationOfUnitNaturalNumber(this.getHundredthPlace());
		return hundredthNumberInAlphabet += Constants.HUNDRED;
	}

	private String getTenthAndUnitPlace() {
		if(number.length() == 3)
			return number.substring(Constants.ONE);
		else
			return number;
	}
}
