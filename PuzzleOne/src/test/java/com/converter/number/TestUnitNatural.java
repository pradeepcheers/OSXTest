package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.NaturalNumberException;
import com.converter.number.natural.UnitNaturalNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldBeZero() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("0");
		assertThat (unitNumber.getStringEquivalentNumber(), is("zero"));
	}
	
	@Test
	public void shouldBeOne() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("1");
		assertThat (unitNumber.getStringEquivalentNumber(), is("one"));
	}

	@Test
	public void shouldBeTwo() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("2");
		assertThat (unitNumber.getStringEquivalentNumber(), is("two"));
	}

	@Test
	public void shouldBeThree() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("3");
		assertThat (unitNumber.getStringEquivalentNumber(), is("three"));
	}
	
	@Test
	public void shouldBeFour() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("4");
		assertThat (unitNumber.getStringEquivalentNumber(), is("four"));
	}
	
	@Test
	public void shouldBeFive() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("5");
		assertThat (unitNumber.getStringEquivalentNumber(), is("five"));
	}
	
	@Test
	public void shouldBeSix() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("6");
		assertThat (unitNumber.getStringEquivalentNumber(), is("six"));
	}
	
	@Test
	public void shouldBeSeven() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("7");
		assertThat (unitNumber.getStringEquivalentNumber(), is("seven"));
	}
	
	@Test
	public void shouldBeEight() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("8");
		assertThat (unitNumber.getStringEquivalentNumber(), is("eight"));
	}
	
	@Test
	public void shouldBeNine() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("9");
		assertThat (unitNumber.getStringEquivalentNumber(), is("nine"));
	}
	
	@Test
	public void shouldBeTen() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("10");
		assertThat (unitNumber.getStringEquivalentNumber(), is("ten"));
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void shouldNotBeNegetive() throws Exception{
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("-1");
		unitNumber.getStringEquivalentNumber();
	}
	
	@Test
	public void shouldRemoveLeadingZeros() throws NaturalNumberException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("00001");
		assertThat(unitNumber.getStringEquivalentNumber(), is("one"));
	}
}
