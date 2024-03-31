package com.Javacode;
//we should cube every digit of a no. and add them then we should get same number
public class Armstrong {

	public static void main(String[] args) {
      int n=153;
      int t=n;    //we can store 'n' data in 'temp'.
      int r,sum=0;
      while(n>0)
      {
    	r=n%10;           // remainder value
    	n=n/10;           // quotient value
    	sum=sum+r*r*r;     // 0+3*3*3=27,27+5*5*5=152,152+1*1*1=153/ t=n(true)
      }
      if(t==sum)
    	  System.out.println("Is an Armstrong");
      else 
    	  System.out.println("Is not Armstrong");
	}
}
/* import java.util.Scanner;
public class Practice{

public static void main(String args[])
{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter N Value");
	  int n=s.nextInt();
	  int t=n,r,sum=0;
	  while(n>0)
	  {
		  r=n%10;
		  n=n/10;
		  sum=sum+r*r*r;
	  }
	  if(t==sum)
		   System.out.println("Its Armstrong No."+sum);
	  else
		  System.out.println("Its not Armstrong No.");
}}*/