package com.main.converter;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.numtoword.converter.NumToWordConverter;

public class NumToWordConverterTest {

	NumToWordConverter converter;

	@Before
	public void setup() {
		converter = new NumToWordConverter();
	}

	@Test
	public void testConvertInput() throws Exception {
		assertEquals("One", converter.convertInput(1));
		//("One", converter.convertInput(1));
	}

	@Test
	public void testWithLongValue() throws Exception {
		assertEquals("One", converter.convertInput(95803405));
		//("One", converter.convertInput(1));
	}

	
	@After
	public void tearDown() {
	}

}
