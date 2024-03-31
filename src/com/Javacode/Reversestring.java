package com.Javacode;

public class Reversestring {

	public static void main(String[] args) {
	       String str="Saikumar";
	       System.out.println("Before Reverse :"+str);
	      String rev=" ";
	      int len=str.length();
          for(int i =len-1;i>=0;i--)
          {
        	  rev=rev+str.charAt(i);
          }
          System.out.println("After Reversing :"+rev);
         StringBuffer sb=new StringBuffer(str);
         System.out.println("Using String Buffer Reversing: "+sb.reverse());

	}
}
