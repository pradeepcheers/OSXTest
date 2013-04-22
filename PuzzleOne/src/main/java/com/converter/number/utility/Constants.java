package com.converter.number.utility;

import java.util.Map;

public class Constants {
	
	public static final int MAX_LIMIT_LENGTH = 9;
	public static final int MIN_LIMIT_LENGTH = 0;
	
	public static final int ZERO = 0;
	public static final int ONE = 1;
	
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
	
	public final static Map<Integer, String> ALPHABET_CONSTANTS = CommonMethods.createMap();
		
	public final static String [] UNITS = {"zero","one","two","three","four","five","six","seven","eigth","nine"};
	public final static String [] UNITS_NEXT = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	public final static String [] TENS = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

}
