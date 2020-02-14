package demoJava;

import org.testng.annotations.Test;

public class NewTest5555 {
  @Test(priority=2,dependsOnMethods="m1")
  public void flipkart() {
	  
	  System.out.println("code for the login of the flipkart");
  }
  @Test
  public void m1() {
	  int a=10;
	  int b=20;
	  int c=a/b;
	  System.out.println("the final values is :"+c);
  }
}