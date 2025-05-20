package Abcd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void verifyTitle() {

		Assert.assertEquals("Yahoo","Yahoo");
	}
	@Test
	public void abcd() {

		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test
	public void abc() {

		Assert.assertEquals(10, 1);


}
}
