package com.Javacode;
//if digit 2 is present in any numbers from 1 to 100 there are displayed.

public class Digit_find {
	public static void main(String[] args) {
	    
	     for(int i=1;i<=100;i++)
	     {
	  	   if(i%10==3 || i/10==3)
	  		   System.out.println(i);
	     }
		}

	}

