package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample {

	String name = "Khabin";

	@Test
	public void check() {
		/*if (name.equals("Khabin")) {
			System.out.println("Name is equal");
		} else {
			System.out.println("Name is NOT equal");
		}
	}*/

	Assert.assertEquals(name, "Khabin");
	}}
