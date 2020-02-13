package org.ActiTime.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperation 
{
	public static String excelRead(String s1,int r1,int c1) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String s = w1.getSheet(s1).getRow(r1).getCell(c1).getStringCellValue();
		return s;
	}
	public static void excelWrite(String s1,int r1,int c1,String data) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheet(s1).getRow(r1).createCell(c1).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream("C:\\Testdata\\userdata.xlsx");
		w1.write(fos);
		
				
	}
		 
}
