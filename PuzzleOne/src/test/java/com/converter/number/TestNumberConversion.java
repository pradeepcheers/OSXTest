package com.converter.number;

import org.junit.Test;
import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.NaturalNumber;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestNumberConversion {
	@Test
	public void shouldItBeZerooooooooo() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("000000000");
		assertThat(numberConversion.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldItBeOneMillion() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("1000000");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one million"));
	}
	
	@Test
	public void shouldItBeOneMillionAndOne() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("1000001");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one million one"));
	}
	
	@Test
	public void shouldItBeTenThousandFiveHundredFifty() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("10550");
		assertThat(numberConversion.getStringEquivalentNumber(), is("ten thousand five hundred and fifty"));
	}
	
	@Test
	public void shouldItBeTenThousandAndOne() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("10001");
		assertThat(numberConversion.getStringEquivalentNumber(), is("ten thousand one"));
	}
	
	@Test
	public void shouldItBeOne() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("1");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one"));
	}
	
	@Test
	public void shouldItBeTwentyOne() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("21");
		assertThat(numberConversion.getStringEquivalentNumber(), is("twenty one"));
	}
	
	@Test
	public void shouldItBeHundredAndFive() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("105");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one hundred and five"));
	}
	
	@Test
	public void shouldItBeMillionTest() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("56945781");
		assertThat(numberConversion.getStringEquivalentNumber(), is("fifty six million nine hundred and forty five thousand seven hundred and eighty one"));
	}
	
	@Test
	public void shouldItBeThousand() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("1000");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one thousand"));
	}
	
	@Test
	public void shouldItBeTwenty() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("020");
		assertThat(numberConversion.getStringEquivalentNumber(), is("twenty"));
	}
	
	@Test
	public void shouldItBeTen() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("10");
		assertThat(numberConversion.getStringEquivalentNumber(), is("ten"));
	}
	
	@Test
	public void shouldItBeZero() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("000");
		assertThat(numberConversion.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldItBeOneHundred() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("100");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one hundred"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldThrowOutOfLimitExceptionGreaterThanLimit() throws Exception {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("1000000000");
		numberConversion.getStringEquivalentNumber();
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldThrowOutOfLimitExceptionLessThanZero() throws Exception{
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("-1");
		numberConversion.getStringEquivalentNumber();		
	}
	
	@Test
	public void shouldItBeHundredNatural() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("312");
		assertThat(numberConversion.getStringEquivalentNumber(), is("three hundred and twelve"));
	}
	
	@Test
	public void shouldItBeTenNatural() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("012");
		assertThat(numberConversion.getStringEquivalentNumber(), is("twelve"));
	}
	
	@Test
	public void shouldItBeFiftyFour() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("054");
		assertThat(numberConversion.getStringEquivalentNumber(), is("fifty four"));
	}

	@Test
	public void shouldItBeFour() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("004");
		assertThat(numberConversion.getStringEquivalentNumber(), is("four"));
	}
	
	@Test
	public void shouldItBeOneHundredAndOne() throws  NaturalNumberException {
		NaturalNumber numberConversion = new AbstractNumberFactory().getNumberFactory().getNaturalNumber("101");
		assertThat(numberConversion.getStringEquivalentNumber(), is("one hundred and one"));
	}
	
}
