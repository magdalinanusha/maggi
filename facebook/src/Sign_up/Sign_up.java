package Sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_up {

	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("abcdef");
		driver.findElement(By.name("lastname")).sendKeys("ghija");
		driver.findElement(By.name("reg_email__")).sendKeys("7856784568");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass@1234");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(10);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("9");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		driver.findElement(By.name("websubmit")).click();



	}

}
