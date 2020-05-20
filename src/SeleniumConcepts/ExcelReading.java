package SeleniumConcepts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Test Excel File.xlsx");
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Number of rows in Sheet1 are: "+rowCount);
		
		int colCount = sh.getRow(2).getPhysicalNumberOfCells();
		System.out.println("Number of columns in Sheet1 are: "+colCount);
		
		for(int i=0; i<rowCount; i++)
		{
			String colData1 = sh.getRow(i).getCell(0).getStringCellValue();
			String colData2 = sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(colData1+" "+colData2);
		}
		
		System.out.println("*******************SHEET 2*********************");
		
		XSSFSheet sh2 = wb.getSheet("Sheet2");
		
		int rc = sh2.getPhysicalNumberOfRows();
		System.out.println("Number of rows in Sheet2 are: "+rc);
		
		int cc = sh2.getRow(2).getPhysicalNumberOfCells();
		System.out.println("Number of columns in Sheet2 are: "+cc);
		
		for(int i=0; i<rc; i++)
		{
			for(int j=0; j<cc; j++)
			{
				String CellData = sh2.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(CellData+"----");
			}
			System.out.println();
		}
		

		
	}

}
