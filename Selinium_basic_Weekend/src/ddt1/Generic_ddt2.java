package ddt1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_ddt2 {
	static String path= "C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx";
	
	public static void DDT_create(String value,int row, int cell,String sheetA) {
		
		try {
			
			FileInputStream f= new FileInputStream (path);
			Workbook w = WorkbookFactory.create(f);
			Sheet sh = w.createSheet(sheetA);
			Row row1 = sh.createRow(row);
			Cell cell2 = row1.createCell(cell);
			cell2.setCellValue(value);
			FileOutputStream fos=new FileOutputStream(path);
			w.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	
	}

}
