import org.testng.annotations.Test;

public class Testngdemo1 {
  @Test(priority=3)
  public void login() 
  {
	 System.out.println("code for registration"); 
	  
  }
  @Test(priority=1 )
  
  public void registration() 
  {
	 System.out.println("code for registration"); 
	  
  }
  @Test(priority=2)
  public void logout() 
  {
	 System.out.println("code for registration"); 
	  
  }
  
  
  
}
