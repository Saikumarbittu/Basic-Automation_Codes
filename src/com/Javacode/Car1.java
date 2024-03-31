package com.Javacode;

public class Car1 {
      String name,color,model;
      double price;
      int capacity;
     public Car1(String name,String color)//constructor
     {
    	 this.name=name;
    	 this.color=color;
     }
     public Car1(String name,String color,double price)
     {
    	 this.name=name;
    	 this.color=color;
    	 this.price=price;
     }
     public Car1(String name,String color,double price,int capacity,String model)
     {
    	 this.name=name;
    	 this.color=color;
    	 this.price=price;
    	 this.capacity=capacity;
    	 this.model=model;
     }
     public static void main(String args[])
     {
    	 Car1 c1=new Car1("Audi","Black");
    	 Car1 c2=new Car1("Benz","White",6000000);
    	 Car1 c3=new Car1("Benz","Black",4600000,6,"Y3");
    	 System.out.println(c1.name+" "+c1.color);
    	 System.out.println(c2.name+" "+c2.color+" "+c2.price);
    	 System.out.println(c3.name+" "+c3.color+" "+c3.price+" Capacity:"+c3.capacity+" Model:"+c3.model);

     }
}
