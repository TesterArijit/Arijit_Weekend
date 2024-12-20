package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData_From_Excell1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		FileInputStream f= new FileInputStream ("E:\\Excell1\\dataToFetch.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		String data1 = c.getStringCellValue();
		System.out.println(data1);
		

		
	}

}
