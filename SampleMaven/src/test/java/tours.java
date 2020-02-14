import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tours {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver sai1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		sai1 =new ChromeDriver();
		sai1.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		sai1.manage().window().maximize();
		Thread.sleep(5000);
		WebElement cd=sai1.findElement(By.linkText("SignUp"));
		cd.click();
		WebElement ef=sai1.findElement(By.xpath("//label[@id='demo']"));
		Select sai=new Select(ef);
		//Thread.sleep(2000);
		sai.selectByIndex(2);
		
		
		
		
	
	
		
		
		
		
		
		
	}

}
