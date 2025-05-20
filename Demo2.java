package Abcd;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeMethod

	public void login() {
		System.out.println("Login Successfully");
		}

	@AfterMethod
	public void logout() {
		System.out.println("Logout Successfully");
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
