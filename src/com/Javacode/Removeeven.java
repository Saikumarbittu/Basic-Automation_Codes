package com.Javacode;

public class Removeeven {

	public static void main(String[] args) {
		//creating array and print statement
		int arr[] = {5,8,10,3,11,15,14,9};
        System.out.print("even numbers: \n");
         
        //Even numbers
        for(int value:arr)
        {
        	if(value%2==0)
        		System.out.println(value);
        }
        System.out.print("Odd numbers: \n");
        for(int value:arr)
        {
        	if(value%2!=0)
        		System.out.println(value);
        }
       
	}}