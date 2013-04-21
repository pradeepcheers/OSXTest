package com.converter.number;

import com.converter.number.utility.*;

public class TenNatural {
	
	UnitNatural unitNatural = new UnitNatural();
	CommonMethods commonMethods = new CommonMethods();
	
	public String getTenNaturalNumber(String number) {	
		if(getTenthPlaceInteger(number) == 0)
			return unitNatural.getAlphabeticalNumber(Integer.parseInt(number));
		else if(Constants.ALPHABET_CONSTANTS.containsKey(Integer.parseInt(number)))
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(number));
		else {
			return Constants.ALPHABET_CONSTANTS.get(Integer.parseInt(this.getTenthPlaceInteger(number)+Constants.ZERO_STRING)) + " " + unitNatural.getAlphabeticalNumber(this.getUnitPlace(number));
		}
	}
	
	public int getTenthPlaceInteger(String number) {
		return commonMethods.getLeftMostPlaceValueInInteger(number);
	}
	
	public int getUnitPlace(String number) {
		return commonMethods.getLeftButOnePlaceVaueInInt(number);
	}

}
