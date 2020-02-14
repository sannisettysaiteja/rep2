package demoJava;

import org.testng.annotations.Test;

public class testng {
  @Test(groups= {"sanity","regression"})
  public void login() {
	  
	  
	  System.out.println("code for login");
  }
  @Test(groups= {"regression"})
  public void registration() {
	  System.out.println("code for registration");
  }
  @Test(groups= {"sanity"})
  public void logout() {
	  System.out.println("code for logout");
  }
  
}
