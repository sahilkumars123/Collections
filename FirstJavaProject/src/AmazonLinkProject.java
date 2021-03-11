import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkProject {

ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahilkumar\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");	
	}
	
	public void getURL()
	{
		String url = driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");
		System.out.println("Url is ::"+url);
	}
	
	public void getAllLinksInAWindow()
	{
	   List<WebElement> listAllElements = driver.findElements(By.tagName("a"));
	   System.out.println("Total number of links are ::"+listAllElements.size());
	}
	
	public void getAllLinksInfo()
	{
	   List<WebElement> listAllElements = driver.findElements(By.tagName("a"));
	   for(WebElement links : listAllElements)
	   {
		   System.out.println("Text of link is :: "+links.getText() + "URL info is "+links.getAttribute("href"));
	   }
	   
	}
	public void closeBrowser()
	{
		driver.close(); //closes the current instance of a browser
		//driver.quit(); //closes all the instance of the browser
	}
}
