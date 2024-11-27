package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassA {

	public static void main(String[] args) throws IOException,FileNotFoundException{

//		File ExcelLoc=new File("‪C:\\Users\\franc\\eclipse-workspace\\Workspace\\data\\Book1.xlsx");
		File ExcelLoc = new File("C:/Users/franc/eclipse-workspace/Workspace/data/Book1.xlsx");

		FileInputStream stream=new FileInputStream(ExcelLoc);
		XSSFWorkbook book=new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet("Data");
		
		for(int i=0;i<10;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		

	}
}
