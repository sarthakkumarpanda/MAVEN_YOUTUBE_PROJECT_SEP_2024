package parallel_execution;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider(name = "getTestData")
	public static Object[][] dataSupplier() {
		Object[][] getdata = {{ "seleniumpanda@gmail.com" , "Selenium@123" },
				              { "seleniumpanda1@gmail.com" , "Selenium@123" },
				              { "seleniumpanda2@gmail.com" , "Selenium@123" },
				              { "seleniumpanda3@gmail.com" , "Selenium@123" },
				              { "seleniumpanda4@gmail.com" , "Selenium@123" },
				              { "seleniumpanda5@gmail.com" , "Selenium@123" },
				              { "seleniumpanda6@gmail.com" , "Selenium@123" },
				              { "seleniumpanda7@gmail.com" , "Selenium@123" },
				              { "seleniumpanda8@gmail.com" , "Selenium@123" }};
		return getdata;
		
		}
	}
