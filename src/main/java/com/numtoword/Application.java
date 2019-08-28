package com.numtoword;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.numtoword.converter.NumToWordConverter;
import com.numtoword.exception.NumberToWordException;

public class Application {

	public static void main(String[] args) {
		try {
			System.out.println("********** Number to Word Converter **********");
			System.out.println("Enter a number to convert into words");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			NumToWordConverter nwc = new NumToWordConverter();
			String convertedWord = nwc.convertInput(num);
			System.out.println("********** Number Converted into Words **********");
			System.out.println(num + " = " + convertedWord);
			sc.close();
		}catch (NumberToWordException nwe) {
			System.err.println("Invalid input : " +nwe.getMessage());
		} 
		catch (InputMismatchException ime) {
			System.err.println("Invalid input");
		} catch (Exception e) {
			System.err.println("Something went wrong!!!" + e.getMessage());
		}
	}

}