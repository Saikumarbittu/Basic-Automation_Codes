package com.Javacode;

import java.util.Random;

public class RandomEmail_Phoneno {
	
  static Random random=new Random();
	public static void main(String[] args) {

      

		// Create a array for all email domains
		String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "ybl.com", "spoors.in" };
		// Create Random class

		// Get the count of the domains
		int index = random.nextInt(domains.length);
      
		// Create another string to store the random domain
		String domain = domains[index];
		// length of email address between 5 and 14 characters
		int length = random.nextInt(10) + 5;
	     System.out.println(length);
	     
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			char c = (char)(random.nextInt(26) + 'a');
			sb.append(c);
		}

		sb.append("@").append(domain);

		System.out.println(sb);
		
	}

}
