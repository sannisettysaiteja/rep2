package demoJava;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void login() {
	  
	  System.out.println("some 3 lines of code for login");
  }
  
  @BeforeMethod
  public void launch() {
	  
	  System.out.println("some 3 lines of code for launching");
  }
  @Test
  public void register() {
	  
	  System.out.println("some 20 lines of code for registration");
	  
  }
  @AfterMethod
  public void closing()
  {
	 System.out.println("some 15 lines of code for closing"); 
  }
  @BeforeClass
  public void  deleteCookies()
  {
	 System.out.println("some 23 lines of code for deleteCookies"); 
  }
  @AfterTest
  public void browserConfiguration()
  {
	  System.out.println("some 16 lines -");
  }
  
  
}
