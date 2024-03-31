package com.Javacode;
//Static variables Inside class and Outside method 
   public class Electronics_wthstatic
   {
	   static String pdt_name="Mobile";
	   static int pdt_price=18000;
	   static String pdt_color="Black";
	   static String pdt_from="Amazon";
	    static String pdt_model="Iphone";
   
 public static  void pdtdisplay()
 {
	 System.out.println("pdt_name:"+pdt_name);	
	 System.out.println("Price :"+pdt_price);
	 System.out.println("pdt_color :"+pdt_color);
	 System.out.println("pdt_from :"+pdt_from);
	 System.out.println("pdt_model :"+pdt_model);
 }
 public static void main(String args[])
 {
	 pdtdisplay(); 
 }}
   