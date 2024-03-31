package com.Javacode;

public class Class_book {
    public static String details(String name,String color,int price) {
		return name+" "+color+" "+price;
    }
    public static void main(String args[]) {
    	System.out.println(details("java","black",1000));
    	System.out.println(details("sql","green",15000));
    	System.out.println(details("testing","red",14000));
    	System.out.println(details("c","black",15000));
    	System.out.println(details("c++","blue",19000));

    }
}
