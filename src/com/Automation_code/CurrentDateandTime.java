package com.Automation_code;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDateandTime {

	public static void main(String[] args) {
		 
		
		System.out.println(Calendar.getInstance().getTime());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy:dd:mm HH:mm:ss");
		String st =sf.format(Calendar.getInstance().getTime());  
		  //or else
		 System.out.println(st);
		
			String timeStamp = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().getTime());
		     System.out.println(timeStamp);
               
	}

}
