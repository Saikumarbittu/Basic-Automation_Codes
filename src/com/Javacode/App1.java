package com.Javacode;

public class App1 {
	String name,desg;
	int sal,id;
	public App1(String ename,String edesg,int esal,int eid)
	{
		name=ename;
		desg=edesg;
		sal=esal;
		id=eid;
	}
	public void App1()
	{
		System.out.println("......Details.....");
		System.out.println(name);
		System.out.println(desg);
		System.out.println(sal);
		System.out.println(id);

	}
public static void main(String args[])
{
	App1 d1 = new App1("Saikumar","Developer",50000,1221);
	d1.App1();
	App1 d2 = new App1("Anand","Manual testing",45000,1231);
	d2.App1();
	App1 d3 =new App1("Nikil","Commerce",40000,1241);
	d3.App1();
}
}
