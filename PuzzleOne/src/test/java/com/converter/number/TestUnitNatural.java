package com.converter.number;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestUnitNatural {
	
	@Test
	public void shouldBeZero(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(0), is("zero"));
	}
	
	@Test
	public void shouldBeOne(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(1), is("one"));
	}

	@Test
	public void shouldBeTwo(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(2), is("two"));
	}

	@Test
	public void shouldBeThree(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(3), is("three"));
	}
	
	@Test
	public void shouldBeFour(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(4), is("four"));
	}
	
	@Test
	public void shouldBeFive(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(5), is("five"));
	}
	
	@Test
	public void shouldBeSix(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(6), is("six"));
	}
	
	@Test
	public void shouldBeSeven(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(7), is("seven"));
	}
	
	@Test
	public void shouldBeEight(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(8), is("eight"));
	}
	
	@Test
	public void shouldBeNine(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(9), is("nine"));
	}
	
	@Test
	public void shouldBeTen(){
		UnitNatural unitNumber = new UnitNatural();
		assertThat (unitNumber.getAlphabeticalNumber(10), is("ten"));
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void shouldNotBeNegetive() throws Exception{
		UnitNatural unitNumber = new UnitNatural();
		unitNumber.getAlphabeticalNumber(-1);
	}
	
	@Test
	public void shouldRemoveLeadingZeros() {
		UnitNatural unitNumber = new UnitNatural();
		assertThat(unitNumber.getAlphabeticalNumber(00001), is("one"));
	}
}
