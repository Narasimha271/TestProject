//Scenario:
//Open a Browser (write the generic code such that by changing the parameter browser can be changed.)
//Navigate to https://Amazon.co.uk website.
//Write a method to find the count (number of) links on the homepage of Amazon.
//Write another method to print link text and URLs of all the links on the page of Amazon.

package amazon_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Amazon_ {
	ChromeDriver driver;
    String url = "https://www.amazon.co.uk/";
    
    public void opnbwr() {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinna\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
    }
    public int linkcount() {
    	
   List<WebElement> alllinks = driver.findElements(By.tagName("a"));
   return alllinks.size();
   }
    
    public void urloflink(String linktext) 
    {
    	WebElement desiredlink = driver.findElement(By.linkText(linktext));
    	String desiredurl = desiredlink.getAttribute("href");
    	System.out.println(desiredurl);
    	
    }
    public void alllinksandtext() {
    	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
    	for (WebElement link:alllinks)
    	{
    		System.out.println("link text is " + link.getText()+ "the url of the text is " +link.getAttribute("href"));
    		System.out.println("-----------------------------------------------------"	);
    	}
    }
    
    public static void main(String[] args) {
    	Amazon_ allinks = new Amazon_();
    	allinks.opnbwr();
    	int at = allinks.linkcount();
    	 System.out.println(at);
    	 allinks.urloflink("Books");
    	 allinks.alllinksandtext(); 
    	
	}
}
	
	

