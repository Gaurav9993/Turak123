package testNGgrouping;

import org.testng.annotations.Test;

public class TestNGMetaGrouping {

	
	@Test(groups = {"Sanity"})
	public void w11() {
		System.out.println("W11 is Running");
	}

	@Test(groups = {"Sanity", "smoke"})
	public void w12() {
		System.out.println("W12 is Running");
	//	Assert.fail();
	}
	@Test(groups = {"regression"})
	public void w13() {
		System.out.println("W13 is Running");
		//Assert.fail();
	}
	@Test(groups = {"Sanity", "regression"})
	public void w14() {
		System.out.println("W14 is Running");
	}
	@Test(groups = {"smoke"})
	public void w15() {
		System.out.println("W15 is Running");
	}

}
