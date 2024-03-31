package com.Javacode;

public class Pattern11 {
    public static void main(String args[])
    {
    	//outer loop
    	for(int i=1;i<=4;i++)
    	{     //inner loop
    		for(int j=1;j<=i;j++)
    		{
    		int sum=i+j;   
    		if(sum%2==0)      
    			//sum of even
    	System.out.print("1 ");
    			else
    			System.out.print("0 ");  //odd
    		
    		}
    		System.out.println();
    	}
    }
}
