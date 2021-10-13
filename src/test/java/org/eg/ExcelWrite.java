package org.eg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
        //locate
		File f = new File("C:\\Users\\PREETHA\\eclipse-workspace\\TestProject\\target\\ExcelData\\Preeth.xlsx");
		
		//create the file
		boolean a = f.createNewFile();
		System.out.println(a);
		
		//type of workbook
		Workbook w = new XSSFWorkbook();
		
		//get the sheet
		Sheet sheet = w.createSheet("Course");
		
		//create the row 
		Row row = sheet.createRow(3);
		
		//create the cell
		Cell cell = row.createCell(2);
		
		//set the value
		cell.setCellValue("abi");
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Success");
		
}

}
