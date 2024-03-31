package com.Javacode;

public class Electronics{
       String name,brand;
       int price;
       public Electronics(String name,String brand,int price)
       {
    	   this.name=name;
    	   this.brand=brand;
    	   this.price=price;
       }
       public void display()
       {
    	   System.out.println("....Product Details....");
    	   System.out.println(name);
    	   System.out.println(brand);
    	   System.out.println(price);

       }
       public static void main(String args[])
       {
    	   Electronics e1=new Electronics("Mobile","MI",17000);
    	   Electronics e2=new Electronics("Laptop","HP",75000);
    	   Electronics e3=new Electronics("Watch","MI",1000);
             e1.display();
             e2.display();
             e3.display();
       }
}
