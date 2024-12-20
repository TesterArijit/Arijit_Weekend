package ddt1;

public class Data_Main_Runner {

	public static void main(String[] args) {
		
		String key ="webdriver.chrome.driver";
		String value ="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		String val1 = Generic_ddt1.DDT1("arijit", 0, 2);
		System.out.println(val1);

	}

}
