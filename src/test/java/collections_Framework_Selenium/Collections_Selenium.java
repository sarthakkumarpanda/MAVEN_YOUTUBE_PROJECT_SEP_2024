package collections_Framework_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Collections_Selenium {
	
	public WebDriver driver;
	
	
	//WindowHandles
	
	@Test
	public void usingCollectionInWindowHandles() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blospot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for(String w: windowhandles) {
			
		}
		
	}

}
