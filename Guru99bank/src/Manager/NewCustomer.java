package Manager;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewCustomer {
	
ChromeDriver driver;
Actions act= new Actions(driver);
String url ="http://demo.guru99.com/V1/";
@BeforeClass
public void openbrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinna\\eclipse-workspace\\libs\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(url);
driver.findElement(By.name("uid")).sendKeys("mngr325982");
driver.findElement(By.name("password")).sendKeys("gYsymYv");
driver.findElement(By.name("btnLogin")).click();
}
@AfterClass
public void closebrowser(){
	driver.close();
	
}
@Parameters({"textdata","expecteddata"})
  @Test(enabled = true)
  public void NC1(String data, String expected) 
  {
	
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("name")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	 System.out.println("NC1 Actual result:" +textfrompage);
	 assertEquals(expected ,textfrompage);
  }
@Parameters({"textdata5","expecteddata5"})
  @Test
  public void NC5(String data, String expected) {
	  
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("addr")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message']")).getText();
	  System.out.println("NC5 Actual result:" +textfrompage);
	  assertEquals(expected,textfrompage);
  }
  
@Parameters({"textdata8","expecteddata8"})
  @Test
  public void NC8(String data, String expected) {
	 
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("city")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message4']")).getText();
	  System.out.println("NC8 Actual result:" +textfrompage);
	  assertEquals(expected, textfrompage);
  }
@Parameters({"textdata12","expecteddata12"})
  @Test
  public void NC12(String data, String expected) {
	
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("state")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message5']")).getText();
	  System.out.println("NC12 Actual result:" +textfrompage);
	  assertEquals(expected, textfrompage);
}
 
  @Parameters({"textdata16","expecteddata16"})
  @Test
  public void NC16(String data, String expected) {
	  
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC16 Actual result:" +textfrompage);
	  assertEquals(expected, textfrompage);
  }
 
  @Parameters({"textdata22","expecteddata22"})
  @Test
  public void NC22(String data, String expected) {
	 
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("telephoneno")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
	  System.out.println("NC22 Actual result:" +textfrompage);
	  assertEquals(expected, textfrompage);
  }
  
  @Parameters({"textdata26","expecteddata26"})
  @Test
  public void NC26(String data, String expected) {
	
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("emailid")).sendKeys(data);
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message9']")).getText();
	  System.out.println("NC26 Actual result:" +textfrompage);
	  assertEquals(expected, textfrompage);
}  
  @Test(priority = -100)
  public void NC29() {
	  SoftAssert sA = new SoftAssert();
	  
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("emailid")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message9']")).getText();
	  System.out.println("NC29 Actual result:" +textfrompage);
	  //assertEquals(textfrompage, "Email-ID is not valid");
	  sA.assertEquals(textfrompage, "Email-ID is not valid");
	  System.out.println("fasfadfa");
	  sA.assertEquals(textfrompage, "Email-ID must not be blank");
	  sA.assertAll();
	  
	 
  }
}
 
