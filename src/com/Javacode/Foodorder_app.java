package com.Javacode;

public class Foodorder_app {
     static String restaurant_name="Mefil Restaurant";
     static int No_of_dishes_order=20,price=5000;
     int order_id=1221,disamt=250;
     public static void order_details()
     {
    	 System.out.println("Restaurant_name :"+restaurant_name);
    	 System.out.println("No.of orders :"+No_of_dishes_order);
    	 System.out.println("Price :"+price);
    	//we need to create a object to access non static variables to static method.
    	 Foodorder_app f1= new Foodorder_app(); 
    	 System.out.println("order id :"+f1.order_id);         
    	 System.out.println("disamount :"+f1.disamt);
     }
    public void delivery_person(String address,int wait_charges)
     {
    	 System.out.println("Address :"+address);
    	 System.out.println("wait charges :"+wait_charges);
         order_details();         //there is no object  creation for non static method call to static method
     }
    public void zomato_partner()
    {
    	  int food_rate=5,hygen=5,del_rate=5;
    	  System.out.println("food rate :"+food_rate +"\n"+"Hygenic rating :"+hygen+"\n"+"Delivery_rating :"+del_rate);
    	  delivery_person("QSP KPHB",500);
    }
    public static void main(String args[])
    {
    	Foodorder_app f1 = new Foodorder_app(); //we need to create a object to call static method to non-static method
         f1.zomato_partner();
    }
}
