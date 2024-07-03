package AutoBots.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
 
 
public class DataDrivens {

	
	public Object[][] getdata() throws IOException {
	int i ;
	int j ;

		
		FileInputStream fis= new FileInputStream("C://Users//vinay//OneDrive//Desktop//ExcelDD.xlsx");
		XSSFWorkbook workbook=new 	XSSFWorkbook(fis);
		
		XSSFSheet sheets = workbook.getSheet("Sheet1");
		int numofrows = sheets.getPhysicalNumberOfRows();
		System.out.println(numofrows);
		
		XSSFRow firstrow = sheets.getRow(0);
		int numofcolumns = firstrow.getLastCellNum();
		System.out.println(numofcolumns);
		
		Object [][] data = new Object[numofrows][numofcolumns];
		
		for(i=0;i<numofrows;i++) {
			firstrow = sheets.getRow(i);
			for(j=0;j<numofcolumns;j++) {
				data[i][j] = firstrow.getCell(j);
				
				
			}
			
			
		}
		System.out.println(data[0][1]);
				
	
		return data ; 
		
	}
}
 