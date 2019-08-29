package com.numtoword.converter;

import com.numtoword.converter.constants.Constants;
import com.numtoword.util.Utility;

public class NumToWordConverter {

	private final String[] digits = Constants.digits;
	private final String[] ten_multiples = Constants.ten_multiples;

	public String convertInput(int num) throws Exception {
		Utility.validateInputNum(num);
		if(num == 0) 
			return "Zero";
		else
			return compute(num);
	}

	private String compute(int num) {
		if (num < 0) {
			return "Minus " + compute(-num);
		} else if (num >= 0 && num < 20) {
			return digits[num];
		} else if (num >= 20 && num < 100){
			return ten_multiples[num/10] + ((num%10 != 0) ? " " : "") + digits[num % 10];
		} else if(num >= 100 && num < 1000) {
			return compute(num/100) + " Hundred" + ((num%100 != 0) ? " and " : "") + compute(num%100);			
		} else if(num >= 1000 && num < 1000000) {
			return compute(num/1000) + " Thousand" + ((num%1000 != 0) ? " " : "") + compute(num%1000);			
		} else {
			return compute(num/1000000) + " Million" + ((num%1000000 != 0) ? " " : "") + compute(num%1000000);
		}
	}

}
