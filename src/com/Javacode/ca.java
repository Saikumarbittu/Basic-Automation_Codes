package com.Javacode;
 import java.util.Scanner;

 public class ca
 {
	 public static void main(String args[])
	 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Value");
	int n=s.nextInt();
		 int r,s1=0,t=n;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		s1=s1+(r*r*r);
	}
	if(t==s1)
 System.out.println("a");
	else
		System.out.println("N0");
	 }
 }