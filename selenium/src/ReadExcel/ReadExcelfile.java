package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {
	
public static void main(String[] args) throws IOException{
		
		//fetch the file
		File file=new File("D:\\software testing\\ReadExcelFile.xlsx");
		
		//read the excel file
		FileInputStream io=new FileInputStream(file);
		
		//fetch the workbook
		XSSFWorkbook wb=new XSSFWorkbook(io);
		
		//for sheet filename
		XSSFSheet sheet=wb.getSheet("demo");
		
		//FORINDEX
		//XSSFSheet sheet.wb.getSheetAt(0);
		
		//Row 0 Cell 0
		XSSFRow row0=sheet.getRow(0);
		XSSFCell cell00=row0.getCell(0);
		String id=cell00.getStringCellValue();
		
		//System.out.println(id);
		
		//Row 0 Cell 1
		XSSFRow row01=sheet.getRow(0);
		XSSFCell cell01=row0.getCell(0);
		String name=cell01.getStringCellValue();
		System.out.println(id+"||"+name);
		
		//Row 1 Cell 0
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cell10=row1.getCell(0);
		double id1=cell10.getNumericCellValue();
		
		//Row 1 Cell 1
		XSSFCell cell11=row1.getCell(1);
		String name1=cell11.getStringCellValue();
		System.out.println(id1+"||"+name1);
}
}

		
		
		

		
		
		
		
		
	
	
		
	


