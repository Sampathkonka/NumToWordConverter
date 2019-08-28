package com.main.converter;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.numtoword.converter.NumToWordConverter;
import com.numtoword.exception.NumberToWordException;

public class NumToWordConverterTest {

	NumToWordConverter converter;

	@Before
	public void setup() {
		converter = new NumToWordConverter();
	}

	@Test
	public void testConvertInput() throws Exception {
		assertEquals("One", converter.convertInput(1));
	}

	@Test
	public void testConvertInput2() throws Exception {
		assertEquals("One Million One Hundred and Eleven Thousand One Hundred and Eleven", converter.convertInput(1111111));
	}
	
	@Test
	public void testConvertInput3() throws Exception {
		assertEquals("Twenty Two", converter.convertInput(22));
	}
	@Test
	public void testConvertInput4() throws Exception {
		assertEquals("Sixteen", converter.convertInput(16));
	}
	@Test(expected = NumberToWordException.class)
	public void testConvertInput5() throws Exception {
		 converter.convertInput(1000000012);
	}
	@Test
	public void testConvertInput6() throws Exception {
		assertEquals("Minus Nine", converter.convertInput(-9));
	}
			
	@After
	public void tearDown() {
		converter = null;
	}

}
