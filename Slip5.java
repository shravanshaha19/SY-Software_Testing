package ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("abcd");
		driver.findElement(By.name("q")).sendKeys("abc");
		//driver.navigate().back();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Store")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
	}

}
