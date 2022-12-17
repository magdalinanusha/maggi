package Anusha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("maggi");
		//driver.findElement(By.name("lastname")).sendKeys("miracle");
		//driver.findElement(By.name("reg_email_")).sendKeys("9944665189");
		//driver.findElement(By.name("reg_passwd_")).sendKeys("pass@123456");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByValue("26");
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(3);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1993");
		driver.findElement(By.xpath("//input[@value='2']")).click();	
	}

}
