import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class parameterization {
  @Test(dataProvider = "credentials")
  public void login(String name, String password) {
	  System.out.println("the username this time is : " +name);
	  System.out.println("the Paswrd this time is : "+ password);
	  
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		WebElement cd=driver.findElement(By.linkText("SignUp"));
		cd.click();
	  driver.findElement(By.xpath("//input[@id='userName'] ")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	  WebElement ef=driver.findElement(By.linkText("Login"));
	  ef.click();
	  //driver
	  String E_title="Home";
	  String A_title=driver.getTitle();
	  Assert.assertEquals(A_title,E_title);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "lalitha", "password123" },
      new Object[] { "Swagatika", "Password13b" },
    };
  }
}
