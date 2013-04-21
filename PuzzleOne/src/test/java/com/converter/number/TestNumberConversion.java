package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.NotANumberException;
import com.converter.number.exception.OutOfLimitException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestNumberConversion {
	
	@Test
	public void shouldItBeTenThousandFiveHundredFifty() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("10550"), is("ten thousand five hundred and fifty"));
	}
	
	@Test
	public void shouldItBeTenThousandAndOne() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("10001"), is("ten thousand one"));
	}
	
	@Test
	public void shouldItBeOne() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("1"), is("one"));
	}
	
	@Test
	public void shouldItBeTwentyOne() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("21"), is("twenty one"));
	}
	
	@Test
	public void shouldItBeHundredAndFive() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("105"), is("one hundred and five"));
	}
	
	@Test
	public void shouldItBeMillionTest() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("56945781"), is("fifty six million nine hundred and forty five thousand seven hundred and eighty one"));
	}
	
	@Test
	public void shouldItBeThousand() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("1000"), is("one thousand"));
	}
	
	@Test
	public void shouldItBeTwenty() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("020"), is("twenty"));
	}
	
	@Test
	public void shouldItBeTen() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("10"), is("ten"));
	}
	
	@Test
	public void shouldItBeZero() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("000"), is("zero"));
	}
	
	@Test
	public void shouldItBeOneHundred() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("100"), is("one hundred"));
	}
	
	@Test (expected=OutOfLimitException.class)
	public void shouldThrowOutOfLimitExceptionGreaterThanLimit() throws Exception {
		NumberConversion numberConversion = new NumberConversion();
		numberConversion.converter("1000000000");
	}
	
	@Test (expected=NotANumberException.class)
	public void shouldThrowOutOfLimitExceptionLessThanZero() throws Exception{
		NumberConversion numberConversion = new NumberConversion();
		numberConversion.converter("-1");		
	}
	
	@Test
	public void shouldItBeHundredNatural() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("312"), is("three hundred and twelve"));
	}
	
	@Test
	public void shouldItBeTenNatural() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("012"), is("twelve"));
	}
	
	@Test
	public void shouldItBeFiftyFour() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("054"), is("fifty four"));
	}

	@Test
	public void shouldItBeFour() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("004"), is("four"));
	}
	
	@Test
	public void shouldItBeOneHundredAndOne() throws OutOfLimitException, NotANumberException {
		NumberConversion numberConversion = new NumberConversion();
		assertThat(numberConversion.converter("101"), is("one hundred and one"));
	}
	
}
