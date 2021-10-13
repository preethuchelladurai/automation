package org.eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		//locate
		File f = new File("C:\\Users\\PREETHA\\eclipse-workspace\\TestProject\\target\\ExcelData\\Preethu.xlsx");
		
		//read the data from the excel
		FileInputStream fin = new FileInputStream(f);
		
		//type of workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//get the sheet
		Sheet s = w.getSheet("Preethu");
		
		//iterate all the values in the sheet
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
		  for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell cell = r.getCell(j);
			
			//1--string
			//0--date or numbers

			int cellType=cell.getCellType();
			if(cellType==1)
			{
			String value=cell.getStringCellValue();
			System.out.println(value);
			} else if(cellType==0)
			{
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date d=cell.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
					String value=sim.format(d);
					System.out.println(value);
				}
				else {
					double d=cell.getNumericCellValue();
					//typecasting syn
					//newDataType ref=(newDataType)oldvariable
					long l=(long)d;
					String value=String.valueOf(l);
					System.out.println(value);
				}
			}
			}
		  }
			
		}
		

}