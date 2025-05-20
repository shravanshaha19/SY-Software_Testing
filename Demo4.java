package Abcd;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {
	@BeforeTest
	  public void login() {
	  System.out.println("Test Login successfully");
	  }
	  @AfterTest
	  public void logout() {
	  System.out.println("Test Logout successfully");
	  }
	  @Test(priority=2)
	  public void verifyTitle() {
	  System.out.println("Verify Title method");
	  }

	  @Test(priority=1)
	  public void abcd() {
	  System.out.println("abcd method"); 
	  }
	  @Test(priority=3)
	  public void abc() {
	  System.out.println("abc method");
	  }
}
