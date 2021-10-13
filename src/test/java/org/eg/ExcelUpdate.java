package org.eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) throws IOException {
        //locate
		File f = new File("C:\\Users\\PREETHA\\eclipse-workspace\\TestProject\\target\\ExcelData\\TestFile.xlsx");
		
		//read data from the excel
		FileInputStream fin = new FileInputStream(f);
		
		//type of workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//get the sheet
		Sheet s = w.getSheet("File");
		
		Row row = s.getRow(3);
		
		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		if (value.equals("uma")) {
			
			cell.setCellValue("swetha");
			
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
			
			System.out.println("Success");
			
		}

}
}