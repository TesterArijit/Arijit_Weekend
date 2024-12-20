package ddt2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_insert_Generic1 {
	
	static String path="C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx";
	static double value=0.0;
	
	
	public static double Insert1(String sheet, int row, int cell)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			book.getSheet(sheet).createRow(row).createCell(cell).setCellValue(18.57);
			FileOutputStream fos =new FileOutputStream(path);
			book.write(fos);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
		
	}
		
}
