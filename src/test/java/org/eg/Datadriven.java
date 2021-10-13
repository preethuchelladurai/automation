package org.eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	
	public static void main(String[] args) throws IOException {
		//locate
		File f = new File("C:\\Users\\PREETHA\\eclipse-workspace\\TestProject\\target\\ExcelData\\Preethu.xlsx");
		
		//read the data from the excel
		FileInputStream fin = new FileInputStream(f);
		
		//type of workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//get the sheet
		Sheet s = w.getSheet("Student");
		
		//get the row
		Row r = s.getRow(0);  
		
		// get the cell
		Cell cl = r.getCell(1); 
		System.out.println(cl);
		
		//find the physical number of rows
		int pr=s.getPhysicalNumberOfRows();
		System.out.println("physicalrows:"+pr);
		
	    //find the physical number of cells
		int pc=r.getPhysicalNumberOfCells();
		System.out.println("physcialcells:"+pc);
	}
	

}
