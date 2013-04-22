package com.converter.number;

import com.converter.number.utility.*;

public class TenNaturalNumber {
	
	UnitNaturalNumber unitNatural = new UnitNaturalNumber();
	CommonMethods commonMethods = new CommonMethods();
	
	public String getTenthNaturalAlphabetNumber(String number) {	
		if(getTenthPlaceInteger(number) == 0)
			return unitNatural.getUnitNaturalAlphabetNumber(Integer.parseInt(number));
		else if(Constants.ALPHABET_CONSTANTS.containsKey(Integer.parseInt(number)))
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(number));
		else {
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(this.getTenthPlaceInteger(number)+Constants.ZERO_STRING)) + " " + unitNatural.getUnitNaturalAlphabetNumber(this.getUnitPlace(number));
		}
	}
	
	private int getTenthPlaceInteger(String number) {
		return commonMethods.getLeftMostPlaceValueInInteger(number);
	}
	
	private int getUnitPlace(String number) {
		return commonMethods.getLeftButOnePlaceVaueInInt(number);
	}

}
