package com.Javacode;

public class Fibonocci {

	public static void main(String[] args) {
        int i,f1=0,f2=1,f3;
       System.out.println(f1+"   "+f2);
        for(i=1;i<=7;i++)
        {
        	f3=f1+f2;
        	System.out.println(f3);
            f1=f2;
        	f2=f3;
	}	
	}
	
	}


