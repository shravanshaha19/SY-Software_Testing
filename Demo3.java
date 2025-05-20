package Abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void login() {
		
		System.out.println("Login Successfull");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout Successfull");
	}
	@Test(priority=2)
	public void addProduct() {
		System.out.println("Add Product Successfully");
	}

	@Test(priority=1)
	public void addVendor() {
		System.out.println("Add Vendor Successfully");
	}

	@Test(priority=3)
	public void addCurrencyroduct() {
		System.out.println("Add Currency Successfully");
	}
}
