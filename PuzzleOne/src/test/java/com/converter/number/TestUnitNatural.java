package com.converter.number;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldBeZero(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(0), is("zero"));
	}
	
	@Test
	public void shouldBeOne(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(1), is("one"));
	}

	@Test
	public void shouldBeTwo(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(2), is("two"));
	}

	@Test
	public void shouldBeThree(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(3), is("three"));
	}
	
	@Test
	public void shouldBeFour(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(4), is("four"));
	}
	
	@Test
	public void shouldBeFive(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(5), is("five"));
	}
	
	@Test
	public void shouldBeSix(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(6), is("six"));
	}
	
	@Test
	public void shouldBeSeven(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(7), is("seven"));
	}
	
	@Test
	public void shouldBeEight(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(8), is("eight"));
	}
	
	@Test
	public void shouldBeNine(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(9), is("nine"));
	}
	
	@Test
	public void shouldBeTen(){
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat (unitNumber.getStringRepresentationOfUnitNaturalNumber(10), is("ten"));
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void shouldNotBeNegetive() throws Exception{
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		unitNumber.getStringRepresentationOfUnitNaturalNumber(-1);
	}
	
	@Test
	public void shouldRemoveLeadingZeros() {
		UnitNaturalNumber unitNumber = new UnitNaturalNumber();
		assertThat(unitNumber.getStringRepresentationOfUnitNaturalNumber(00001), is("one"));
	}
}
