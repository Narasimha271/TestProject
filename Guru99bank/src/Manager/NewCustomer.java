package Manager;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewCustomer {
	
ChromeDriver driver;
Actions act;
String url ="http://demo.guru99.com/V1/";
@BeforeMethod
public void deviopenbrs() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinna\\eclipse-workspace\\libs\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(url);
driver.findElement(By.name("uid")).sendKeys("mngr325982");
driver.findElement(By.name("password")).sendKeys("gYsymYv");
driver.findElement(By.name("btnLogin")).click();
}
@AfterMethod
public void closebrowser(){
	driver.close();
	
}
  @Test
  public void NC1() 
  {
	 act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("name")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	 System.out.println("NC1 Actual result:" +textfrompage);
	 assertEquals(textfrompage, "Customer name must not be blank");
  }
  @Test
  public void NC2() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("name")).sendKeys("1234");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC2 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Numbers are not allowed");
  }
  @Test
  public void NC3() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("name")).sendKeys("name!@#");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC3 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Special characters are not allowed");
  }
  
  @Test
  public void NC4() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("name")).sendKeys("   ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC4 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
  }
  @Test
  public void NC5() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("addr")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC5 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "ADDRESS cannot be empty");
  }
  
  @Test
  public void NC6() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("addr")).sendKeys("  ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC6 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
  }
  @Test
  public void NC8() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("city")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message4']")).getText();
	  System.out.println("NC8 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "City Field must be not blank");
  }
  @Test
  public void NC9() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("city")).sendKeys("1234");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message4']")).getText();
	  System.out.println("NC9 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Numbers are not allowed");
}
  
}
