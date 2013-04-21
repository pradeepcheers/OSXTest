package com.converter.number.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommonMethods {
	
	static Map<Integer, String> createMap(){
		Map<Integer, String> tempMap = new HashMap<Integer, String>();
		tempMap.put(0, "zero");
		tempMap.put(1, "one");
		tempMap.put(2, "two");
		tempMap.put(3, "three");
		tempMap.put(4, "four");
		tempMap.put(5, "five");
		tempMap.put(6, "six");
		tempMap.put(7, "seven");
		tempMap.put(8, "eight");
		tempMap.put(9, "nine");
		tempMap.put(10, "ten");
		tempMap.put(11, "eleven");
		tempMap.put(12, "twelve");
		tempMap.put(13, "thirteen");
		tempMap.put(14, "fourteen");
		tempMap.put(15, "fifteen");
		tempMap.put(16, "sixteen");
		tempMap.put(17, "seventeen");
		tempMap.put(18, "eighteen");
		tempMap.put(19, "nineteen");
		tempMap.put(20, "twenty");
		tempMap.put(30, "thirty");
		tempMap.put(40, "forty");
		tempMap.put(50, "fifty");
		tempMap.put(60, "sixty");
		tempMap.put(70, "seventy");
		tempMap.put(80, "eighty");
		tempMap.put(90, "ninety");
		return Collections.unmodifiableMap(tempMap);
	}
	
	public int getLeftMostPlaceValueInInteger(String number) {
		return Character.getNumericValue(number.charAt(Constants.ZERO));
	}

	public String getLeftMostPlaceValueInString(String number) {
		return String.valueOf(number.charAt(Constants.ZERO));
	}
	
	public int getLeftButOnePlaceVaueInInt(String number) {
		return Character.getNumericValue(number.charAt(Constants.ONE));
	}
}
