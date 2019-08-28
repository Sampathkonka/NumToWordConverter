package com.numtoword.util;

import com.numtoword.exception.NumberToWordException;

public class Utility {

	public static void validateInputNum(int num) throws NumberToWordException {
		if(num > 999999999 || num < -999999999) {
			throw new NumberToWordException("Out of Range Exception");
		}
	}

}
