package com.Javacode;

public class Pattern1 {

	public static void main(String[] args) {
		
			
		//Nested for loop
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2!=0)
				System.out.print("*");
				else
				System.out.print("+");
			}
			System.out.println();
		}
		}
	}


