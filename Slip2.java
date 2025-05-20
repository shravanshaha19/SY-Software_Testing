package ST;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slip2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tccollege.org/");
		Thread.sleep(5000);
		
		Point p=new Point(400,300);
		driver.manage().window().setPosition(p);
		
		
		Dimension d=new Dimension(400,300);
		driver.manage().window().setSize(d);
		
		//driver.get("http://www.unipune.ac.in/");
		//Thread.sleep(5000);
		
		//driver.close();

	}

}
