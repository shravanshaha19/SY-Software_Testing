package ST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement>abc=driver.findElements(By.tagName("a"));
		int num=abc.size();
		System.out.println("Count in:"+num);
		for(int i=0;i<=num-1;i++)
		{
			String c=abc.get(i).getText();
			Thread.sleep(2000);
			System.out.println(c);
		}
		
	}

}
