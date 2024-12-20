package ddt1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_insert_in_excell_DDT1 {
	//static String value=null;
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		FileInputStream fis =new FileInputStream("C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		book.createSheet("practice2").createRow(0).createCell(0).setCellValue("Hello");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\chatt\\OneDrive\\Desktop\\DDT_use.xlsx");
		book.write(fos);

	}

}
