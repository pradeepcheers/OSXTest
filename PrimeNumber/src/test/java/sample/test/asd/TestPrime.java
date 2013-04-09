package sample.test.asd;

import static org.junit.Assert.*;

import org.junit.*;

public class TestPrime {
	
	Prime primeObject = new Prime();
	
	@Test
	public void testPrimeNumberOne() {
		assertTrue(primeObject.isPrime(1));
	}
	
	@Test
	public void testPrimeNumberTwo() {
		assertTrue(primeObject.isPrime(2));
	}
	
	@Test
	public void testPrimeNumberThree() {
		assertTrue(primeObject.isPrime(3));
	}
	
	@Test
	public void testPrimeNumberFour() {
		assertEquals(false, primeObject.isPrime(4));
	}

	@Test
	public void testPrimeNumberFive() {
		assertTrue(primeObject.isPrime(5));
	}
	@Test
	public void testPrimeNumberSix() {
		assertEquals(false,primeObject.isPrime(6));
	}
	
	@Test
	public void testPrimeNumberSeven() {
		assertTrue(primeObject.isPrime(7));
	}
	
	@Test
	public void testPrimeNumberEight() {
		assertEquals(false, primeObject.isPrime(8));
	}
	
	@Test
	public void testPrimeNumberNine() {
		assertEquals(false, primeObject.isPrime(9));
	}

	@Test
	public void testPrimeNumberTen() {
		assertEquals(false, primeObject.isPrime(10));
	}
}
