package ST;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/tournaments/champions-trophy-2025");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Selenium provides the javascriptExecution interface to execute
		//JavaScript directly within the browser
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//1.Scroll down by a specific number of pixel (eg,500)
		j.executeScript("window.scrollBy(0,1000);"); 
		Thread.sleep(2000);
		//2.Scroll up by a specific number of pixel
		j.executeScript("window.scrollBy(0,-1000);"); 
		Thread.sleep(3000); 
		//driver.close();
	}
	

}
