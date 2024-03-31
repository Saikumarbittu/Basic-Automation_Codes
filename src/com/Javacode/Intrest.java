package com.Javacode;

import java.util.Scanner;
public class Intrest {
     public static void main(String args[])
     {
    	 try (Scanner s = new Scanner(System.in)) {
			System.out.println("Principal Amt");
			 int p = s.nextInt();
			 System.out.println("Rate of Intrest");
			 float r = s.nextFloat();
			 System.out.println("Enter Tenure");
			 byte b = s.nextByte();
			 float si=(p*r*b)/100;
			 System.out.println("Simple Intrest :"+si);
		}
     }
}

