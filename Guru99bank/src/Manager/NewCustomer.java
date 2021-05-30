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

  @Test
  public void NC10() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("city")).sendKeys("City!@#");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message4']")).getText();
	  System.out.println("NC10 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Special characters are not allowed");
}
  @Test
  public void NC11() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("city")).sendKeys(" ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message4']")).getText();
	  System.out.println("NC11 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
}
  //@Test
  public void NC12() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("state")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message5']")).getText();
	  System.out.println("NC12 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "State must not be blank");
}
  @Test
  public void NC13() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("state")).sendKeys("state123");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message5']")).getText();
	  System.out.println("NC13 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Numbers are not allowed");
}
  @Test
  public void NC14() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("state")).sendKeys("State!@#");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message5']")).getText();
	  System.out.println("NC14 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Special characters are not allowed");
}
  @Test
  public void NC15() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("state")).sendKeys("  ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message5']")).getText();
	  System.out.println("NC15 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
  }
  
  @Test
  public void NC16() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys("1234PIN");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC16 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Characters are not allowed");
  }
  @Test
  public void NC17() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC17 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "PIN code must not be blank");
  }
  @Test
  public void NC18() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys("123");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC18 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "PIN Code must have 6 Digits");
  }
  @Test
  public void NC19() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys("123!@#");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC19 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Special characters are not allowed");
  }
  @Test
  public void NC20() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys("  ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC20 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
  }
  @Test
  public void NC21() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("pinno")).sendKeys(" ");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message6']")).getText();
	  System.out.println("NC21 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "PIN cannot have space");
  }
  @Test
  public void NC22() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("telephoneno")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
	  System.out.println("NC22 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Telephone no must not be blank");
  }
  @Test
  public void NC23() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("telephoneno")).sendKeys(" 12345");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
	  System.out.println("NC23 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "First character cannot be space");
  }
  @Test
  public void NC24() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("telephoneno")).sendKeys("123 123");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
	  System.out.println("NC24 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Telephone cannot have be space");
  }
  @Test
  public void NC25() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("telephoneno")).sendKeys("886636!@12");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
	  System.out.println("NC25 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Special characters are not allowed");
  }
  @Test
  public void NC26() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("emailid")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message9']")).getText();
	  System.out.println("NC26 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Email ID must not be blank");
  }
  @Test
  public void NC27() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("emailid")).sendKeys("guru99@gmail");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message9']")).getText();
	  System.out.println("NC27 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Email-ID is not valid");
  }
  
  @Test
  public void NC29() {
	  act = new Actions(driver);
	  driver.findElement(By.linkText("New Customer")).click();
	  driver.findElement(By.name("emailid")).sendKeys("");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String textfrompage = driver.findElement(By.xpath("//label[@id='message9']")).getText();
	  System.out.println("NC29 Actual result:" +textfrompage);
	  assertEquals(textfrompage, "Email-ID is not valid");
  }
}
 
