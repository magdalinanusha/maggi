package Sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sign_up_ng {
	

WebDriver driver;

@BeforeClass
public void launch_browser()
{

System.setProperty ("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com/signup/");
driver.manage().window().maximize();
}
	
	@Test
	public void Enter_details()
	{
	driver.findElement(By.name("firstname")).sendKeys("maggi");
	driver.findElement(By.name("lastname")).sendKeys("miracle");
	driver.findElement(By.name("reg_email__")).sendKeys("miraclemaggi26@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("24423516");
	}

	@Test
	public void Select_details()
	{
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByIndex(26);
	Select month = new Select(driver.findElement(By.name("birthday_month")));
	month.selectByValue("3");
	Select year = new Select(driver.findElement(By.name("birthday_year")));
	year.selectByVisibleText("1993");
	}

	@Test
	public void Choose_details()
	{
	  driver.findElement(By.xpath("//input[@value = '2']")).click();
	}

	@AfterClass
	public void close()
	{
	  driver.findElement(By.name("websubmit")).click();
	  driver.quit();
	}
	}


