package ddt2;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_driven_Generic2 {
	
	static String path="C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx";
	static String value=null;
	
	
	public static String data_given2(String sheet, int row, int cell)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			value=book.getSheet(sheet).getRow(row).getCell(cell).toString();
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
		
	}

}
