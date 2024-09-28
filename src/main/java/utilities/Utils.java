package utilities;

import java.util.Date;

public class Utils {
	
	public static void main(String[] args) {
		emailWithDateTimeStamp();
	}

	
	
	public static String emailWithDateTimeStamp() {
		
		Date date = new Date();
		System.out.println(date); 
		String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dateTimeStamp);
		
		return "seleniumpanda" + dateTimeStamp + "@gmail.com";
		
		
	}


}
