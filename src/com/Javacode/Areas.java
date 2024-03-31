package com.Javacode;
// wap user-define method to find areas
/*  public class Areas 
{
	public static void  arear() {
         int r=4;
         float arear=3.4f*r*r;   //pie*r*r,pie value=3.4
         System.out.println("area of circle : "+arear);
	}
	public static void areasq()
	{
         int s=4;
         int areasq=s*s;  //A=a*a
         System.out.println("area of square : "+areasq);    
	}
public static void areatri() {
	int b=4,h=5;
	float areatri=0.5f*b*h;  //1/2*b*h
	System.out.println("area of triangle : "+areatri);
}
public static void main(String args[]) {
	arear();
	areasq();
	areatri();
	
	
}
}  */   
import java.util.Scanner;

public class Areas
{
	public static void main(String args[])
	{
		  try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter R value"); 
			int r=s.nextInt();
			System.out.println("Enter A value");
			int a=s.nextInt();
			System.out.println("Enter Base and height values");
			int b= s.nextInt();
			int h= s.nextInt();
			double f=3.14*r*r;                                      //Area of circle
			System.out.println("Area of Circle :"+f);
			int i=a*a;
			System.out.println("Area of Square :"+i);
			float T=0.5f*b*h;
			System.out.println("Area of Triangle :"+T);
		}
		
		
	}
}

