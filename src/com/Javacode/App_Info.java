package com.Javacode;

public class App_Info {
	public static String app(String name,String data,String purpose) //static with arguments
	{
	   return name+" "+data+" "+purpose;
	}
	public static void main(String []args) {
		System.out.println(app("FACEBOOK","250MB","Social Media"));
		System.out.println(app("Whatsapp","180MB","Chating"));
		System.out.println(app("Photoshop","358MB","Photo Editing"));
		System.out.println(app("Maps","125MB","Navigation"));

	}
	
}
