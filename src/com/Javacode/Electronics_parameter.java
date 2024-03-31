package com.Javacode;

public class Electronics_parameter {
      String name,brand,color,size;
      int price;
      //Constructor
      public Electronics_parameter(String ename,String ebrand,String ecolor,int eprice,String esize)
      {
    	  //Initialize
    	  name=ename;
    	  brand=ebrand;
    	  color=ecolor;
    	  price=eprice;
    	  size=esize;
      }
      public void display()
      {
    	   System.out.println(".....Electronics Details.......");
    	   System.out.println(name);
    	   System.out.println(brand);
    	   System.out.println(color);
    	   System.out.println(price);
    	   System.out.println(size);
  	   
      }
      public static void main(String arg[])
      {
    	  Electronics_parameter e1 = new Electronics_parameter("Tv","Mi","Black",14000,"32inches");
    	  e1.display();
    	  Electronics_parameter e2 = new Electronics_parameter("Ac","Samsung","White",25000,"1.5ton");
    	  e2.display();
      }
      
}
