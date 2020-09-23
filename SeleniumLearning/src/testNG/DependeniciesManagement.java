package testNG;

import org.testng.annotations.Test;

public class DependeniciesManagement {

	@Test(enabled=true)
	public void highschool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods="highschool")
	public void highsecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "highsecondary")
	public void engineering() {
		System.out.println("Engineering College");
	}
}
