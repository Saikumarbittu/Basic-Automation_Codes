package com.Javacode;

public class Method2 {
   
	public static void flipkart(String item,int price,String color,String brand,String date) {
	System.out.println(item+" "+price+"  "+color+"  "+brand+"  "+date);
}
     public static void main(String args[])
     {
    	
    	 flipkart("Laptop",70000,"Silver","HP","17-Dec-2021");
    	 flipkart("Mobile",45000,"Black","Oneplus","21-Jan-2022");
    	 flipkart("Airpods",17800,"White","Apple","22-Jan-2022");
     }
}
