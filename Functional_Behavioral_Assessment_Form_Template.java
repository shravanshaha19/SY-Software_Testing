import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Functional_Behavioral_Assessment_Form_Template {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webDriver.chrome.driver","D:/Shravan/New folder//Software_Testing/chromedriver-win32/chromedriver-win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://fluentforms.com/forms/functional-behavioral-assessment-form/");
				driver.findElement(By.name("names[first_name]")).sendKeys("Shravan");
				Thread.sleep(1000);
				driver.findElement(By.name("names[last_name]")).sendKeys("Shaha");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value='ABC Logs']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value='Student']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("description_1")).sendKeys("abcd");
				Thread.sleep(1000);
				driver.findElement(By.name("names_1[first_name]")).sendKeys("Swapnil");
				Thread.sleep(1000);
				driver.findElement(By.name("names_1[last_name]")).sendKeys("Shinde");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_6")).sendKeys("a");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_8")).sendKeys("asd");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_9")).sendKeys("as");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text")).sendKeys("as");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_1")).sendKeys("abcd");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_2")).sendKeys("xyz");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_3")).sendKeys("pqr");
				Thread.sleep(1000);
				driver.findElement(By.name("input_text_4")).sendKeys("str");
				Thread.sleep(1000);
				driver.quit();

	}

}
