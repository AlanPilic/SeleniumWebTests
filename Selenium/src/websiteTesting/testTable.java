package websiteTesting;

// testing a table for the correct input

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class testTable {
	
	
	
	

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Alan/Desktop/workspace/chromeDriver/chromeDriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.iamalan.x10host.com/gpu.php");
		
		WebElement nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[1]"));
		
		String row2column1 = nameOfTableEntry.getText();
		
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[2]"));
		
		String row2column2 = nameOfTableEntry.getText();
		
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[3]"));
		
		String row2column3 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[4]"));
		
		String row2column4 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[5]"));
		
		String row2column5 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[6]"));
		
		String row2column6 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[7]"));
		
		String row2column7 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[8]"));
		
		String row2column8 = nameOfTableEntry.getText();
		
		nameOfTableEntry = driver.findElement(By.xpath("//div[2]/div[1]/table/tbody/tr[2]/td[9]"));
		
		String row2column9 = nameOfTableEntry.getText();
		
		
		driver.close();
		
		
		
		assertEquals(row2column1, "ASUS STRIX GTX 970 DC20C4GD5");
		
		assertEquals(row2column2, "STRIX");
		
		assertEquals(row2column3, "GeForce GTX 970");
		
		assertEquals(row2column4, "4 GB");
		
		assertEquals(row2column5, "1.11 Ghz");
		
		assertEquals(row2column6, "9");
		
		assertEquals(row2column7, "269.99");
		
		assertEquals(row2column8, "8534");
		
		assertEquals(row2column9, "31.61");
		
		
	}
	

}
