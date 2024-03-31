package com.Automation_code;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ascii {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C://Users//SAIKUMAR//OneDrive//Documents//Book1.xlsx");
		XSSFWorkbook xls = new XSSFWorkbook(fis);
		int sheets = xls.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (xls.getSheetName(i).equalsIgnoreCase("Login")) {
                 XSSFSheet  sheet=  xls.getSheetAt(i);
			}
    
		}

	}

}
