package ST;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Slip10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tccollege.org/");
		Thread.sleep(3000);
		//Take a screenshot
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		//define the destination file
		File destFile=new File("D:\\Shravan\\New folder\\Software_Testing/TCcollege.jpg");
		//Copy the screenshot to the destination file
		FileHandler.copy(srcFile,destFile);
		driver.close();
	}

}
