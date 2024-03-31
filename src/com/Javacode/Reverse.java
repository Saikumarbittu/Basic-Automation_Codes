package com.Javacode;
//wap to reverse given input
public class Reverse {
	
	
	
	public void RevereseofNo() {
		int n=123456,rev=0,rem;
	      while(n>0)
	      {
	    	  rem=n%10;
	    	  n=n/10;
	    	  rev=rev*10+rem;
	      }
	      System.out.println(rev);
	}
	//By Using Stringbuilder class
	public void Reverseofstring() {
		String s= "Saikumar";
		StringBuilder sb=new StringBuilder();
	   sb.append(s);
	   sb.reverse();
	   System.out.println(sb);
	    }
	//Print reverse of string using string buffer
	public void Reversewithstringbuffer() {
		String s= "Saikumar";
		StringBuffer sf=new StringBuffer();
		sf.append(s);
		System.out.println("string Length : "+sf.length());
	}
	
	public static void main(String[] args) {
      
   Reverse rev= new Reverse();
   rev.RevereseofNo();
   rev.Reverseofstring();
   rev.Reversewithstringbuffer();
	}}


