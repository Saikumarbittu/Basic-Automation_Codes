package com.Javacode;

//write sum of even digits from given input
public class Sum_ofeven {
	

	public static void main(String[] args) 
	{
		
			int s = 10,count=0;
			for (int i = 0; i <= s; i++) {
	            if (i%2==0) {
	  
	            	System.out.println(i);
	            	count= count+i;
	            }}
			 System.out.println("Total Count:"+count);
		}
}