package parallel_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners_in_TestNG.MyListeners;

@Listeners({MyListeners.class})

public class LoginTest {
	
SoftAssert softassert = new SoftAssert();
	
	public WebDriver driver;
	
	@BeforeMethod
	
		public void setup() throws InterruptedException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until((ExpectedConditions.elementToBeClickable(By.linkText("Login")))).click();
			//driver.findElement(By.linkText("Login")).click();
			
		}
		
		@Test(priority=1, dataProvider = "getTestData", dataProviderClass = Data.class, enabled=false)
		public void loginWithValidCredentials(String email, String password) {
			driver.findElement(By.id("input-email")).sendKeys(email);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed(), "Logout link is not getting displayed");
			softassert.assertAll();
		}
		
		@Test(priority=2)
		public void loginWithNoCredentials() {
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
			softassert.assertAll();
		}
		
		
		
		@Test(priority=3)
		public void loginWithInvalidCredentials() {
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
			softassert.assertAll();
		}
		
		@Test(priority=4)
		public void loginWithValidEmailInvalidPassword() {
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
			softassert.assertAll();
			
		}

		@Test(priority=5)
		public void loginWithInvalidEmailValidPassword() {
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
			softassert.assertAll();
		}
		
	
		@AfterMethod
		public void tearDown() {
		driver.quit();	
		}
	}

