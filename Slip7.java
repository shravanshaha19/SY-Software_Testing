package ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("Shravan");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Shaha");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_day")).sendKeys("19");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year")).sendKeys("2005");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("shravanshaha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("shravanshaha@1925");
		Thread.sleep(9000);
		driver.quit();
	}

}
