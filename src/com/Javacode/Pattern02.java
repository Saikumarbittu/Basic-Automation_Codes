package com.Javacode;

public class Pattern02 {

	public static void main(String[] args) {
       int star=1;
       for(int i=1;i<=7;i++)
       {
    	   for(int k=1;k<=star;k++)
    	   {
    		   System.out.print("*");
    	   }
    	   if(i>=4) 
    	   {
    		   star--;
    	   }
    	   else
    	   {
    		   star++;
    	   }
       }
       System.out.println();
	
	}
}
