package jpetStore;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import POM_JpetStore.user_Info;

public class ExcelRead {
	 String Excelpath="C:\\Users\\shoai\\OneDrive\\Desktop\\ReadFile.xlsx";
	   public String[] readExcel() throws IOException
	{
		   String[]data=new String[5];
		
		FileInputStream fis=new FileInputStream(Excelpath);
		//read the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String userId=cell.getStringCellValue();
		Cell cell1=row.getCell(1);
		String newpassword=cell.getStringCellValue();
		Cell cell2=row.getCell(2);
		String repeatpassword=cell.getStringCellValue();
		data[0]=userId;
		data[1]=newpassword;
		data[2]=repeatpassword;
		return data;
		
		
		
		
	}
}
