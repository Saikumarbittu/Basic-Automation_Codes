package com.Javacode;

public class Pattern01 {

	public static void main(String[] args) {
		int star=1,space=7;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star+2;
			space=space-1;
			System.out.println();
		}
	}
	}