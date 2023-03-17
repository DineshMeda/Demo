package xyz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTestNg {
	
	@BeforeTest
	
	public void openbrowser() {
		
		System.out.println();
	}
   
	@Test
	public void login() {
		System.out.println();
		
	}
	
	@AfterTest
	public void close() {
		System.out.println();
	}
}
