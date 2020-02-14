import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver Sai;
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
      Sai = new ChromeDriver();
      Sai.get("http://www.google.com");
      Dimension d=new Dimension(300,200);
      Sai.manage().window().setSize(d);
      Thread.sleep(3000);
      Point p=new Point(300,700);
      Sai.manage().window().setPosition(p);
      Thread.sleep(3000);
    		  
      
     String E_title="Google";
    // Sai.manage().window().maximize();
     
   
     
     String A_title=Sai.getTitle();
     if(A_title.equals(E_title))
     {
    	 System.out.println("page opened");
    	 
    	 
     }
     else
     {
    	 System.out.println("page not opened");
     }
		
	
Sai.close();
Sai.quit();

	
	}
}

