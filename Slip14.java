package ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='I am a new customer']")).click();
		Thread.sleep(1000);
	}

}
