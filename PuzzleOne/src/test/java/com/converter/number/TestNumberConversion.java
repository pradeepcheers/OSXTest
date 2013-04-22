package com.converter.number;

import org.junit.Test;
import com.converter.number.exception.InvalidInputException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestNumberConversion {
	@Test
	public void shouldItBeZerooooooooo() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("000000000");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("zero"));
	}
	
	@Test
	public void shouldItBeOneMillion() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("1000000");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one million"));
	}
	
	@Test
	public void shouldItBeOneMillionAndOne() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("1000001");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one million one"));
	}
	
	@Test
	public void shouldItBeTenThousandFiveHundredFifty() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("10550");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("ten thousand five hundred and fifty"));
	}
	
	@Test
	public void shouldItBeTenThousandAndOne() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("10001");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("ten thousand one"));
	}
	
	@Test
	public void shouldItBeOne() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("1");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one"));
	}
	
	@Test
	public void shouldItBeTwentyOne() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("21");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("twenty one"));
	}
	
	@Test
	public void shouldItBeHundredAndFive() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("105");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one hundred and five"));
	}
	
	@Test
	public void shouldItBeMillionTest() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("56945781");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("fifty six million nine hundred and forty five thousand seven hundred and eighty one"));
	}
	
	@Test
	public void shouldItBeThousand() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("1000");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one thousand"));
	}
	
	@Test
	public void shouldItBeTwenty() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("020");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("twenty"));
	}
	
	@Test
	public void shouldItBeTen() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("10");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("ten"));
	}
	
	@Test
	public void shouldItBeZero() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("000");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("zero"));
	}
	
	@Test
	public void shouldItBeOneHundred() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("100");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one hundred"));
	}
	
	@Test (expected=InvalidInputException.class)
	public void shouldThrowOutOfLimitExceptionGreaterThanLimit() throws Exception {
		NaturalNumber numberConversion = new NaturalNumber("1000000000");
		numberConversion.getStringRepresentationOfNumber();
	}
	
	@Test (expected=InvalidInputException.class)
	public void shouldThrowOutOfLimitExceptionLessThanZero() throws Exception{
		NaturalNumber numberConversion = new NaturalNumber("-1");
		numberConversion.getStringRepresentationOfNumber();		
	}
	
	@Test
	public void shouldItBeHundredNatural() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("312");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("three hundred and twelve"));
	}
	
	@Test
	public void shouldItBeTenNatural() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("012");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("twelve"));
	}
	
	@Test
	public void shouldItBeFiftyFour() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("054");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("fifty four"));
	}

	@Test
	public void shouldItBeFour() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("004");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("four"));
	}
	
	@Test
	public void shouldItBeOneHundredAndOne() throws  InvalidInputException {
		NaturalNumber numberConversion = new NaturalNumber("101");
		assertThat(numberConversion.getStringRepresentationOfNumber(), is("one hundred and one"));
	}
	
}
