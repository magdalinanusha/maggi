package Anusha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Anusha01 
{
WebDriver driver;

@BeforeClass
public void launchBrowser()
{
 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.findElement(By.linkText("Create New Account")).click();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void Enterdetials(){	
	driver.findElement(By.name("firstname")).sendKeys("maggi");
	driver.findElement(By.name("lastname")).sendKeys("miracle");
	driver.findElement(By.name("reg_email__")).sendKeys("9944665189");
	driver.findElement(By.name("reg_passwd__")).sendKeys("pass@123456");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Select day= new Select(driver.findElement(By.id("day")));
	day.selectByValue("26");
	Select month=new Select(driver.findElement(By.name("birthday_month")));
	month.selectByIndex(3);
	Select year=new Select(driver.findElement(By.id("year")));
	year.selectByValue("1993");
}
@AfterClass
public void close() {
	driver.quit();
}
}