package actitime.ut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XllOperation {

	public static String readData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C://Testdata//userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet(sheetname);
		Row r1 = s1.getRow(row);
		Cell c1 = r1.getCell(cell);
		String s = c1.getStringCellValue();
		return s;
	}
	public static void writeData(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C://Testdata//userdata.xlsx");
	   Workbook w1 = WorkbookFactory.create(fis);
	   w1.getSheet(sheetname).createRow(row).getCell(cell).setCellValue(data);
	   
	   FileOutputStream fos = new FileOutputStream("C://Testdata//userdata.xlsx");
	   w1.write(fos);
	}

}

