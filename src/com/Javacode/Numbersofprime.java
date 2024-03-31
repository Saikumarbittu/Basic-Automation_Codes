package com.Javacode;

public class Numbersofprime {

	public static void main(String[] args) {
		 
//		 for (int num =2;num<=100;num++) {
	
		int num=7,count=0;
		 
		 for(int i=1;i<=num;i++) {
			 if (num%i==0)
				 count++;
		 }
		 if(count==2) {
			 System.out.println(num+"; Prime Number");
		 }
		 else {
			 System.out.println(num+": Not Prime Number");
		 }
		
	}
	

}
