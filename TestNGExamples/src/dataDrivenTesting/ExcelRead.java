package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheeet;
		XSSFCell Cell;
		
		String path ="C:\\Users\\kmohd\\Downloads\\Book 2.ods";
		String SheetName ="Sheet1";
		
		try {
			FileInputStream ExcelFile =new FileInputStream(path);
			ExcelWBook =new XSSFWorkbook(ExcelFile);
			ExcelWSheeet = ExcelWBook.getSheet(SheetName);
			
			Cell =ExcelWSheeet.getRow(0).getCell(0);
			String CellData =Cell.getStringCellValue();
			System.out.println("Cell data is "+ CellData);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
