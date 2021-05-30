package Ebayproject;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class ebaysearch {
	
	
	ChromeDriver driver;
    String url = "https://www.ebay.co.uk/";
    
    public void opnbwr() {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinna\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
    }
    
    public void search() {
    	driver.findElement(By.name("_nkw")).sendKeys("iphones");
    	WebElement select = driver.findElement(By.xpath("//select[@name='_sacat']"));
    	Select type = new Select(select);
    	type.selectByValue("15032");
    	driver.findElement(By.id("gh-btn")).click();  	
    	String results= driver.findElement(By.xpath("//h1[contains(text(),'results for')]")).getText();
    	System.out.println(results);
    }
    
    public void nthitem(int bc) {
    	String replacexpath = String.format("//div[@id='srp-river-results']/ul/li[%d]/div/div[2]/a/h3", bc);
    	String textofn = driver.findElement(By.xpath(replacexpath)).getText();
    	System.out.println(textofn);
    	WebElement element =driver.findElement(By.xpath(replacexpath));
    	element.click();
	}
    
    public void printallproduct() {
    	List<WebElement> allproducts = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
    	for (WebElement product:allproducts) {
    		String productname = product.getText();   		
			System.out.println(productname);
			System.out.println("------------------------------------");
		}
    	
    }
    
  public void scrolldownviascrolldown() {
	  
	  Actions scroll = new Actions(driver);
	  List<WebElement> allproducts = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
	  for (WebElement product:allproducts) {
  		scroll.moveToElement(product).build().perform();
  		// here we are using build and perform to methods to perform the task of scrolling down
  		String productname = product.getText();   		
		System.out.println(productname);
		System.out.println("------------------------------------");
		}
  }
    
    public static void main(String[] args) {
    	ebaysearch ep = new ebaysearch();
    	ep.opnbwr();
    	ep.search();
    	ep.nthitem(6);
    	ep.printallproduct();
    	ep.scrolldownviascrolldown();
	}

}
