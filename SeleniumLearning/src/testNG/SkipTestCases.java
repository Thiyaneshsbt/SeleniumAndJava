package testNG;

import org.testng.annotations.Test;

public class SkipTestCases {

	@Test(priority=0)
	public void startthecar() {
		System.out.println("Start the car");
	}
	@Test(priority=5,enabled=false)
	public void turnonmusic() {
		System.out.println("Switch on music");
	}
	@Test(priority=1)
	public void putfirstgear() {
		System.out.println("put First gear");
	}
	@Test(priority=2)
	public void putsecondgear() {
		System.out.println("put second gear");
	}
	@Test(priority=3)
	public void putthirdgear() {
		System.out.println("put third gear");
	}
	@Test(priority=4)
	public void putfourthgear() {
		System.out.println("put fourth gear");
	}
}
