package com.Javacode;

   abstract class Car
	{
		abstract public void accelerate();
		abstract public void brakes();
	}
   abstract class nano extends Car
   {
	   public void accelerate()
	   {
		   System.out.println("Accelerate the car"); 
	   }
	   public void brakes()
	   {
		   System.out.println("Apply brakes");
	   }
	   abstract public void comfort();
  	  }
   class tata extends nano
   {
	   @Override
	public void comfort() {
        System.out.println("comfort");		
	}

	
	
	
   }
		  public class Abstract
		  {
			  public static void main(String args[])
			  {
     nano c1=new tata();
     c1.accelerate();
     c1.brakes();
     c1.comfort();
     
				  
				  
			  }
			  
		  }
	   
	   


