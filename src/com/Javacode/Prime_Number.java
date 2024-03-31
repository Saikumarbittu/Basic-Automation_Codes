package com.Javacode;

public class Prime_Number {


	public static void main(String[] args) {
	    int i,n=5,count=0;
	    for(i=1;i<=n;i++)
	    {
	    	if(n%i==0)
	    		count++;
	    }
	    if(count==2)
	    	System.out.println("Prime");
	    else
	    	System.out.println("Non prime");
	    }
	}


