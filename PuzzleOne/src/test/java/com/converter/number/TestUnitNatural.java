package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.UnitNaturalNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldItBeOne(){
		assertThat(1, is(1));
	}
	
	@Test
	public void shouldBeZero() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("0");
		assertThat (convertNumber.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldBeOne() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("1");
		assertThat (convertNumber.getStringEquivalentNumber(), is("one"));
	}

	@Test
	public void shouldBeTwo() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("2");
		assertThat (convertNumber.getStringEquivalentNumber(), is("two"));
	}

	@Test
	public void shouldBeThree() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("3");
		assertThat (convertNumber.getStringEquivalentNumber(), is("three"));
	}
	
	@Test
	public void shouldBeFour() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("4");
		assertThat (convertNumber.getStringEquivalentNumber(), is("four"));
	}
	
	@Test
	public void shouldBeFive() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("5");
		assertThat (convertNumber.getStringEquivalentNumber(), is("five"));
	}
	
	@Test
	public void shouldBeSix() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("6");
		assertThat (convertNumber.getStringEquivalentNumber(), is("six"));
	}
	
	@Test
	public void shouldBeSeven() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("7");
		assertThat (convertNumber.getStringEquivalentNumber(), is("seven"));
	}
	
	@Test
	public void shouldBeEight() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("8");
		assertThat (convertNumber.getStringEquivalentNumber(), is("eight"));
	}
	
	@Test
	public void shouldBeNine() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("9");
		assertThat (convertNumber.getStringEquivalentNumber(), is("nine"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldBeTen() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("10");
		assertThat (convertNumber.getStringEquivalentNumber(), is("ten"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldNotBeNegetive() throws Exception{
		Convertable convertNumber = new UnitNaturalNumber("-1");
		convertNumber.getStringEquivalentNumber();
	}
	
	@Test
	public void shouldRemoveLeadingZeros() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("00001");
		assertThat(convertNumber.getStringEquivalentNumber(), is("one"));
	}
	
	@Test (expected=NaturalNumberException.class)
	public void shouldItBeEmpty() throws NaturalNumberException {
		Convertable convertNumber = new UnitNaturalNumber("");
		assertThat(convertNumber.getStringEquivalentNumber(), is(""));
	}
}
