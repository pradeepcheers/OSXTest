package com.converter.number.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Constants {
	
	public static final int MAX_LIMIT_LENGTH = 9;
	public static final int MIN_LIMIT_LENGTH = 0;
	
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	
	public static final String ZERO_STRING = "0";
	public static final String ZERO_IN_ALPHABET = "zero";

	public static final String HUNDRED = " hundred";
	public static final String AND = " and ";
	public static final String MILLION = " million ";
	public static final String THOUSAND = " thousand ";
	public static final String QUOTES = "";
	public static final String SINGLE_SPACE = " ";
	public static final String MULTIPLE_SPACES = " +";
	public static final String NUMBER_PATTERN = "([0-9]*)";
	
	public final static Map<Integer, String> ALPHABET_CONSTANTS = createMap();
	
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
	
	/**
	 * Text for error messages
	 */
	public static class Error
	{
		public final static String NATURAL_NULL = "Null value for a natural number encountered";
		public final static String NATURAL_INVALID_FORMAT = "Invalid input format number for natural number";
		public final static String NATURAL_UNEXPECTED = "Unexpected exception in normalization of natural number";
		public final static String NATURAL_BOUNDARY = "Input is out of range";
		public final static String NATURAL_LAST_DIGITS = "Unexpected exception tokenizing number";

	}
	
	//public final static String [] UNITS = {"zero","one","two","three","four","five","six","seven","eigth","nine"};
	//public final static String [] UNITS_NEXT = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	//public final static String [] TENS = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

}
