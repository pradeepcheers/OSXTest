package com.converter.number;

import org.junit.Test;

import com.converter.number.exception.InvalidInputException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldBeZero() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("0");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("zero"));
	}
	
	@Test
	public void shouldBeOne() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("1");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("one"));
	}

	@Test
	public void shouldBeTwo() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("2");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("two"));
	}

	@Test
	public void shouldBeThree() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("3");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("three"));
	}
	
	@Test
	public void shouldBeFour() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("4");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("four"));
	}
	
	@Test
	public void shouldBeFive() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("5");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("five"));
	}
	
	@Test
	public void shouldBeSix() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("6");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("six"));
	}
	
	@Test
	public void shouldBeSeven() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("7");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("seven"));
	}
	
	@Test
	public void shouldBeEight() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("8");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("eight"));
	}
	
	@Test
	public void shouldBeNine() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("9");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("nine"));
	}
	
	@Test
	public void shouldBeTen() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("10");
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("ten"));
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void shouldNotBeNegetive() throws Exception{
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("-1");
		unitNumber.getStringRepresentationOfUnitNaturalNumber();
	}
	
	@Test
	public void shouldRemoveLeadingZeros() throws InvalidInputException {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber("00001");
		assertThat(unitNumber.getStringRepresentationOfUnitNaturalNumber(), is("one"));
	}
}
