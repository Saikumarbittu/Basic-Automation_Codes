package com.Javacode;

public class Email {
	public static String login(String un,String pwd)
	{
		return un+" "+pwd;
	}
	public static void main(String args[]) {
		System.out.println(login("Saikumar11","sai123"));
		System.out.println(login("anand","anand232"));
		
	}

}
