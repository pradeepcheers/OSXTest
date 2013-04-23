package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.TenNaturalNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestTenNatural {
	
	@Test
	public void shouldBeZero() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("0");
		assertThat (convertNumber.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldBeOne() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("01");
		assertThat (convertNumber.getStringEquivalentNumber(), is("one"));
	}

	@Test
	public void shouldBeTwo() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("12");
		assertThat (convertNumber.getStringEquivalentNumber(), is("twelve"));
	}

	@Test
	public void shouldBeThree() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("3");
		assertThat (convertNumber.getStringEquivalentNumber(), is("three"));
	}
	
	@Test
	public void shouldBeFour() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("4");
		assertThat (convertNumber.getStringEquivalentNumber(), is("four"));
	}
	
	@Test
	public void shouldBeFive() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("5");
		assertThat (convertNumber.getStringEquivalentNumber(), is("five"));
	}
	
	@Test
	public void shouldBeSix() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("6");
		assertThat (convertNumber.getStringEquivalentNumber(), is("six"));
	}
	
	@Test
	public void shouldBeSeven() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("7");
		assertThat (convertNumber.getStringEquivalentNumber(), is("seven"));
	}
	
	@Test
	public void shouldBeEight() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("8");
		assertThat (convertNumber.getStringEquivalentNumber(), is("eight"));
	}
	
	@Test
	public void shouldBeNine() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("9");
		assertThat (convertNumber.getStringEquivalentNumber(), is("nine"));
	}
	
	@Test
	public void shouldBeNinety() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("90");
		assertThat (convertNumber.getStringEquivalentNumber(), is("ninety"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldBeNineHundred() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("900");
		assertThat (convertNumber.getStringEquivalentNumber(), is("nine hundred"));
	}
	
	@Test
	public void shouldBeTen() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("10");
		assertThat (convertNumber.getStringEquivalentNumber(), is("ten"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldNotBeNegetive() throws Exception{
		Convertable convertNumber = new TenNaturalNumber("-1");
		convertNumber.getStringEquivalentNumber();
	}
	
	@Test
	public void shouldRemoveLeadingZeros() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("00001");
		assertThat(convertNumber.getStringEquivalentNumber(), is("one"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldItBeEmpty() throws NaturalNumberException {
		Convertable convertNumber = new TenNaturalNumber("");
		assertThat(convertNumber.getStringEquivalentNumber(), is(""));
	}
}
