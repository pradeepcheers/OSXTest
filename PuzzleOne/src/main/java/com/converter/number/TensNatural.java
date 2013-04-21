package com.converter.number;

public class TensNatural {

	public String getTensNaturalNumber(int number) {
		String [] tensNumberString = new String[9];
		tensNumberString[1] = "ten";
		tensNumberString[2] = "twenty";
		tensNumberString[3] = "thirty";
		tensNumberString[4] = "fourty";
		tensNumberString[5] = "fifty";
		tensNumberString[6] = "sixty";
		tensNumberString[7] = "seventy";
		tensNumberString[8] = "eighty";
		tensNumberString[9] = "ninety";
		
		return tensNumberString[number].toString();
	}
	
}
