package com.git;

public class Occurance {

	public static void main(String[] args) {
		String s = "Veena stays @ OMR - 600097 ";
		int upperCase = 0;
		int lowerCase = 0;
		int splCase = 0;
		int numbersCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ca = s.charAt(i);
			if (ca >= 'A' && ca <= 'Z') {
				upperCase++;
			} else if (ca >= 'a' && ca <= 'z') {
				lowerCase++;
			} else if (ca >= '0' && ca <= '9') {
				numbersCount++;
			} else {
				splCase++;
			}
		}
		System.out.println("upperCase =" + upperCase);
		System.out.println("lowerCase =" + lowerCase);
		System.out.println("splCase =" + splCase);
		System.out.println("numbersCount =" + numbersCount);
	}
}
