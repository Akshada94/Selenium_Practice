package Practice_Sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExel {

	public static void main(String[] args) throws IOException
	{
		File file=new File("C://Users//Suraj Enterpries//Documents//Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(0);
	String value=cell.getStringCellValue();
	System.out.println(value);
	}

}
