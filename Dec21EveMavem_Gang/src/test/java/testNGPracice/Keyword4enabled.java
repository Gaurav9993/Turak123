package testNGPracice;

import org.testng.annotations.Test;

public class Keyword4enabled {
	
	@Test
	public void pu1() {
		System.out.println("Pu1 Is Running");
		
	}
	
	@Test(enabled =false)
	public void pu2() {
		System.out.println("pu2 Is Running");
		
	}
	
	@Test
	public void pu3() {
		System.out.println("pu3 Is Running");
		
	}
	
	@Test
	public void pu4() {
		System.out.println("pu4 Is Running");
		
	}
	
	@Test
	public void pu5() {
		System.out.println("pu5 Is Running");
		
	}
	
	
	

}
