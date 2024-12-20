package ddt2;

public class Data_insert_Runner1 {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		Data_insert_Generic1.Insert1("practice2", 2, 0);

	}

}
