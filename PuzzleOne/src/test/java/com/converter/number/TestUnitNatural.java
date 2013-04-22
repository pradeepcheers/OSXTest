package com.converter.number;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldBeZero(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(0), is("zero"));
	}
	
	@Test
	public void shouldBeOne(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(1), is("one"));
	}

	@Test
	public void shouldBeTwo(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(2), is("two"));
	}

	@Test
	public void shouldBeThree(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(3), is("three"));
	}
	
	@Test
	public void shouldBeFour(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(4), is("four"));
	}
	
	@Test
	public void shouldBeFive(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(5), is("five"));
	}
	
	@Test
	public void shouldBeSix(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(6), is("six"));
	}
	
	@Test
	public void shouldBeSeven(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(7), is("seven"));
	}
	
	@Test
	public void shouldBeEight(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(8), is("eight"));
	}
	
	@Test
	public void shouldBeNine(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(9), is("nine"));
	}
	
	@Test
	public void shouldBeTen(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getUnitNaturalAlphabetNumber(10), is("ten"));
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void shouldNotBeNegetive() throws Exception{
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		unitNumber.getUnitNaturalAlphabetNumber(-1);
	}
	
	@Test
	public void shouldRemoveLeadingZeros() {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat(unitNumber.getUnitNaturalAlphabetNumber(00001), is("one"));
	}
}
