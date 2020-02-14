
package demoJava;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class NewTest222 {
	@Parameters({"tester","location"})
  @Test
  public void primeMembership(String name,String location) {
	  
	  System.out.println("code for primeMembership");
	  System.out.println("its executed by :"+name);
	  System.out.println("its executed from :"+location);
	  
  }
  @Test
  public void renewal()
  {
	  System.out.println("code for renewal");
  }
  @Parameters({"tester","location"})
  @Test
  public void termination(String name,String location) {
	  System.out.println("code for termination");
	  System.out.println("its executed by :"+name);
	  System.out.println("its executed from :"+location);
  }
  
}
