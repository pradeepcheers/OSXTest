package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.HundredNaturalNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestHundredNaturalNumber {
	
	@Test
	public void shouldBeZero() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("000");
		assertThat (convertNumber.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldBeOne() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("001");
		assertThat (convertNumber.getStringEquivalentNumber(), is("one"));
	}

	@Test
	public void shouldBeOneHundred() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("100");
		assertThat (convertNumber.getStringEquivalentNumber(), is("one hundred"));
	}

	@Test
	public void shouldBeThreeThirtyThree() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("333");
		assertThat (convertNumber.getStringEquivalentNumber(), is("three hundred and thirty three"));
	}
	
	@Test
	public void shouldBeFourNineNine() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("499");
		assertThat (convertNumber.getStringEquivalentNumber(), is("four hundred and ninety nine"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldBeFiveThousand() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("5000");
		assertThat (convertNumber.getStringEquivalentNumber(), is("five thousand"));
	}
	
	@Test
	public void shouldBeSixNotTwo() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("602");
		assertThat (convertNumber.getStringEquivalentNumber(), is("six hundred and two"));
	}
	
	@Test
	public void shouldBeSeventy() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("070");
		assertThat (convertNumber.getStringEquivalentNumber(), is("seventy"));
	}
	
	@Test
	public void shouldBeEightOneOne() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("811");
		assertThat (convertNumber.getStringEquivalentNumber(), is("eight hundred and eleven"));
	}
	
	@Test
	public void shouldBeNine() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("9");
		assertThat (convertNumber.getStringEquivalentNumber(), is("nine"));
	}
	
	@Test
	public void shouldBeNinety() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("90");
		assertThat (convertNumber.getStringEquivalentNumber(), is("ninety"));
	}
	
	@Test
	public void shouldBeNineHundred() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("900");
		assertThat (convertNumber.getStringEquivalentNumber(), is("nine hundred"));
	}
	
	@Test
	public void shouldBeTen() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("10");
		assertThat (convertNumber.getStringEquivalentNumber(), is("ten"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldNotBeNegetive() throws Exception{
		Convertable convertNumber = new HundredNaturalNumber("-1");
		convertNumber.getStringEquivalentNumber();
	}
	
	@Test
	public void shouldRemoveLeadingZeros() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("00001");
		assertThat(convertNumber.getStringEquivalentNumber(), is("one"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldItBeEmpty() throws NaturalNumberException {
		Convertable convertNumber = new HundredNaturalNumber("");
		assertThat(convertNumber.getStringEquivalentNumber(), is(""));
	}
}
