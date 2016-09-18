package websiteTesting;

// simple example of login testing to see if you can login and the corresponding profile loads

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
	
	public static WebDriver driver;

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Alan/Desktop/workspace/chromeDriver/chromeDriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("http://www.yourwesbite.com");
		
		WebElement emailLogin = driver.findElement(By.id("Login_1"));
		
		emailLogin.click();
		
		emailLogin = driver.findElement(By.id("Email_1"));
		
		emailLogin.sendKeys("youremaillogingoeshee");
		
		WebElement passwordLogin = driver.findElement(By.id("Password_1"));
		
		passwordLogin.sendKeys("yourpasswordgoeshere");
		
		passwordLogin.sendKeys(Keys.ENTER);
		
		
		WebElement firstNameCorrect = driver.findElement(By.xpath("//*[@id='profileForm']/div[1]/div/div[3]/div[1]/div/h1/span[1]"));
		
		
		String name = firstNameCorrect.getText();
		
		assertEquals(name, "Alan");
		
		
		
	}
	
	@AfterClass
	public static void cleanUp() {
		driver.close();
	}
	

}
