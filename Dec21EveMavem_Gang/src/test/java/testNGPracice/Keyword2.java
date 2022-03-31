package testNGPracice;

import org.testng.annotations.Test;

public class Keyword2 {
	
	@Test(priority =3)
	public void abc() {
		System.out.println("abc Is Running");
		
	}
	
	@Test(priority =2)
	public void xyz() {
		System.out.println("xyz Is Running");
		
	}
	
	@Test
	public void pqr() {
		System.out.println("pqr Is Running");
		
	}
	
	@Test(priority =0)
	public void mno() {
		System.out.println("mno Is Running");
		
	}
	
	@Test(priority =4)
	public void def() {
		System.out.println("def Is Running");
		
	}
	
	
	

}
