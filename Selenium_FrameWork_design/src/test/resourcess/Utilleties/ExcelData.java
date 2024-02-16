package Utilleties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
      String Excelpath="C:\\Users\\shoai\\OneDrive\\Desktop\\Excelbook.xlsx";
   public String[] readExcel() throws IOException
{
	   String[]data=new String[5];
	//path of a Excel file
	FileInputStream fis=new FileInputStream(Excelpath);
	//read the excel file
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	XSSFRow row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	String username=cell.getStringCellValue();
	Cell cell1=row.getCell(1);
	String password=cell.getStringCellValue();
	data[0]=username;
	data[1]=password;
	return data;
	
}
}
