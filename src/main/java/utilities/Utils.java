package utilities;

import java.util.Date;

public class Utils {
	
	

		public static String emailWithDateTimeStamp() {
		
			Date date = new Date();
			String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
			System.out.println(dateTimeStamp); //Tue_Aug_13_20_09_14_EDT_2024
			                                   //Tue_Aug_13_20_09_48_EDT_2024
			
			return "seleniumpanda" + dateTimeStamp + "@gmail.com";
			
		}

}
