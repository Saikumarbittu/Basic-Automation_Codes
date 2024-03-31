package com.Javacode;

public class Grocery_app {
	static String itemname="GOOD DAY",brandname="BRITANNIA";
	int amount=500,quantity=100;
	public static void customer_order()
	{
		System.out.println("Item name :"+itemname+"\n"+"Brand name :"+brandname);
		Grocery_app f1= new Grocery_app();
		System.out.println("Amount :"+f1.amount+"\n"+"Quantity :"+f1.quantity);
	}
	public void delivery_partner()
	{
		int mask_charges=50,sanitise_charge=50;
		System.out.println("Mask charges :"+mask_charges+"\n"+"Sanitise charges:"+sanitise_charge);
	}
	public static void main (String args[])
	{
		customer_order();
		Grocery_app f2= new Grocery_app();
		f2.delivery_partner();
	}

}
