package com.Javacode;

import java.util.ArrayList;
import java.util.Collections;

public class Arr_string {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Sai");
		l.add("mahesh");
		l.add("suresh");
		l.add("ramesh");
        System.out.println("Before Reversing: "+l.toString());
        Collections.reverse(l);
        System.out.println("After Reversing :"+l);

	}

}
