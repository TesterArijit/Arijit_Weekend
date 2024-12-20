package ddt1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_ddt1 {
	
	static String path= "C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx";
	static String value=null;
	
	public static String DDT1(String sheet,int row, int cell)
	{
		try {
			
			FileInputStream f= new FileInputStream (path);
			Workbook w = WorkbookFactory.create(f);
			value=w.getSheet(sheet).getRow(row).getCell(cell).toString();
						
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return value;
	}

}
