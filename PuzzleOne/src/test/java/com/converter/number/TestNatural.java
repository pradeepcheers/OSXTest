package com.converter.number;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestNatural {
	
	@Test
	public void shouldItBeOne(){
		assertThat(1, is(1));
	}
	
}
	