import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickevent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tccollege.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.linkText("Departments"));
		Actions a=new Actions(driver);
		a.contextClick(b).build().perform();
		Thread.sleep(3000);
		
		driver.get("https://www.google.co.in");
		WebElement b1=driver.findElement(By.id("APjFqb"));
		Actions a1=new Actions(driver);
		a1.doubleClick(b1).build().perform();
	    Thread.sleep(3000);
		   
	    WebElement b2=driver.findElement(By.linkText("About"));
		Actions a2=new Actions(driver);
		a2.click(b2).build().perform();
		Thread.sleep(2000);
		//driver.navigate().back();
		
		//WebElement element=driver.findElement(By.linkText("Store"));
		//Actions actions=new Actions(driver);
		//actions.moveToElement(element).perform();
		//Thread.sleep(2000);
		
		driver.quit();
	}

}
