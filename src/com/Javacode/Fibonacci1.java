package com.Javacode;

public class Fibonacci1 {

	public static void main(String[] args) {
		int f1 = 0, f2 = 1, f3;
		System.out.println(f1 + "   " + f2);
		for (int i = 1; i <= 15; i++) {
			f3 = f1 + f2;
       // if(f3%2==0)
	    System.out.println(f3+"  ");
			f1 = f2;
			f2 = f3;
		}
	}

}
