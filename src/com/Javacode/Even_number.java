package com.Javacode;

public class Even_number {

	public static void main(String[] args) {
  int n=23456789,r,s=0;
   while(n%2==0)
   {
	   r=n%10;
	   n=n/10;
	   s=s*10+r;
   }
    if(s%2==0)
	   System.out.println(s);
  
	}

}
