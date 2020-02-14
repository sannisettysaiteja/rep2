

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nooflinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver sai1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		sai1 =new ChromeDriver();
		sai1.get("http://demowebshop.tricentis.com/books");
		sai1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//this is applicable to every subsequent line of code in this program
		//and this is going to work like exist of UFT that means whenever it is required then
		//consume the complete given time but by any chance if the web element present in
		//a lesser time it will continue moving further without making  much delay
		WebDriverWait wait1=new WebDriverWait(sai1,60);//60 seconds
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
		sai1.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> t_links=sai1.findElements(By.tagName("a"));
		int n_links=t_links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
		String l_link_name=t_links.get(i).getText();
		System.out.println("The " +i +"th "+ "link is: "+l_link_name);
		}
		
		
		
		
		

	}

}
