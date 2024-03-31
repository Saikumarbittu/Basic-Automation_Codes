package com.Javacode;

public class Encapsulation {

	private	String un,pwd;
	public void setun(String un){
		this.un=un;
	}
    public void setpwd(String pwd)
    {
    	this.pwd=pwd;
    }
    public String getun()
    {
     if(un=="saikumar")
    	 return "Valid User";
     else
    	return "Invalid User";
    }
    public String getpwd()
    {
     if(pwd=="saikumar143")
    	 return "Valid password";
     else
    	return "Invalid password";
    }
  public class user
  {
	  public static void main(String args[])
	  {
		  Encapsulation e = new Encapsulation();
		  e.setun("saikumar");
		  System.out.println(e.getun());
		  e.setpwd("saikumar143");
		  System.out.println(e.getpwd());
	  }
  }
	}


