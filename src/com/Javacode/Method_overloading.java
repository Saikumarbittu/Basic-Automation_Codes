package com.Javacode;

public class Method_overloading {
     public static void payment(String wallettype,int UID)
     {
    	 System.out.println("wallet type :"+wallettype);
    	 System.out.println("UID :"+UID);
	}
     public static void payment(String cardtype,long cardno,int cvvno)
     {
    	 System.out.println("cardtype :"+cardtype);
    	 System.out.println("card number :"+cardno);
    	 System.out.println("CVV :"+cvvno);
     }
     public static void payment(String name,int pwd,long accno)
     {
    	 System.out.println("Name :"+name);
    	 System.out.println("Password :"+pwd);
    	 System.out.println("Account no. :"+accno);
     }
     public static void main(String args[])
     {
    	 payment("Google pay",1221);
    	 payment("Debit card",52122163L,312);
    	 payment("Saikumar",123123,74773474L);
     }
}
