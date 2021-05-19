package Practice_Sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataEx {

	public static String getexceldata(String sheetName,int rowNo,int cellNo) throws IOException
	{
		File file=new File("C://Users//Suraj Enterpries//Documents//Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);
	    XSSFRow row=sheet.getRow(rowNo);
	    XSSFCell cell=row.getCell(cellNo);
	    String data=cell.getStringCellValue();
	    return data;
	    
	}
	public static void main(String[] args) throws IOException
	{
		getexceldata("Sheet1",1,0);
		getexceldata("Sheet1",1,1);
		
		String name=getexceldata("Sheet1",1,1);
		System.out.println("Desired Data is..."+name);

	}

}
