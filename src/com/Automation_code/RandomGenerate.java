package com.Automation_code;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomGenerate {
	static Random random = new Random();

	public static void main(String[] args) {

		Randommailgenerate();
		Generatephoneno();
	}

	public static void Randommailgenerate() {

		System.out.println("Generate Random emails : ");
		// Create an Array with no. of all email
		String[] domains = { "gmail.com", "Yahoo.in", "Spoors.in", "Test.in", "XYZ.in", "abc.com" };
		// Get the length of array with random domains picking and store value in
		// integer
		int index = random.nextInt(domains.length);
		// Selecting that random numbers array item and store it in varible
		String domain = domains[index];
		// length of email address between 5 and 14 characters
		int a = random.nextInt(10) + 5;

		// Create String builder it is user to add string to generated string with
		// append method
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a; i++) {
			char c = (char) (random.nextInt(26) + 'a');
			sb.append(c);
		}
		sb.append("@").append(domain);
		System.out.println(sb);
	}

	public static void Generatephoneno() {

		int num1 = (random.nextInt(7) + 1) * 100 + (random.nextInt(8) * 10) + random.nextInt(8);
		int num2 = random.nextInt(743);
		int num3 = random.nextInt(10000);
		DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
		String phoneNumber = df3.format(num1) + df3.format(num2) + df4.format(num3);
		System.out.println(phoneNumber);

	}
}