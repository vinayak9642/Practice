package AutoBots.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public ArrayList<String> getdata(String sheetname,String columnname,String celltext ) throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream("D://DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		ArrayList<String> a = new ArrayList<String> ();
		int sheets =  workBook.getNumberOfSheets();
		  
		System.out.println(sheets);
		
		for(int i=0;i<sheets;i++) {
			 
			if(workBook.getSheetName(i).equalsIgnoreCase(sheetname)) {
				
				XSSFSheet sheet = workBook.getSheetAt(i);
			Iterator <Row> row  = sheet.rowIterator();
			
			 Row firstrow = row.next();
				Iterator <Cell> ce =firstrow.cellIterator();
				
				int k = 0;
				int coloum = 0;
				
					
				while (ce.hasNext()) {
					
					Cell value = ce.next();
					
				if(value.getStringCellValue().equalsIgnoreCase(columnname)) {
					coloum= k;
					
					
				}
					
					k++;
				}
			System.out.println(coloum);
			
			while (row.hasNext()) {
				
				Row rv = row.next();
				
				if (rv.getCell(coloum).getStringCellValue().equalsIgnoreCase(celltext)) {
					
					Iterator<Cell> cv = rv.cellIterator();
					while (cv.hasNext()) {
						
						Cell c = cv.next();
						a.add(c.getStringCellValue());
						
//						if(c.getCellType()==CellType.STRING) {
//							a.add(c.getStringCellValue());
//						}else {
//							a.add(NumberToTextConverter.toText(c.getNumericCellValue())); 
//							
						
						  
						
					}
				}
				
			}
			}
			
			
			
		}
		
		return a;
		
	}
	
	
	
	
	
	
	
}
