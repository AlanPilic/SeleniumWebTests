package websiteTesting;

// inputting a set of values to see if they post

import org.junit.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testInput {

	@Test
	public void test() {
System.setProperty("webdriver.chrome.driver", "C:/Users/Alan/Desktop/workspace/chromeDriver/chromeDriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.iamalan.x10host.com/gpu.php");
		
		
		
		WebElement nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/div/input"));
		
		nameInput.sendKeys("Sapphire 11260-02");
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[2]/div/input"));
		
		nameInput.sendKeys("NITRO+ 4G");
		
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/input"));
		
		nameInput.sendKeys("Radeon RX 480");
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div/input"));
		
		nameInput.sendKeys("4GB");
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[5]/div/input"));
		
		
		nameInput.sendKeys("1.21Ghz");
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[6]/div/input"));
		
		nameInput.sendKeys("8");
		
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[7]/div/input"));
		
		nameInput.sendKeys("229.99");
		
		
		nameInput = driver.findElement(By.xpath("/html/body/div[1]/form/div[8]/div/input"));
		
		nameInput.sendKeys("8000");
		
		
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[1]/form/div[9]/div/button"));
		
		
		submitButton.click();
		
		
		
		driver.close();
		
		
	}

}
