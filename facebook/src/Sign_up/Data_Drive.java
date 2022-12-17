package Sign_up;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel_utility01.Excel_utility01;

public class Data_Drive
{
	WebDriver driver;

	@BeforeClass
	public void launch_browser()
	{
	System.setProperty ("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("https://www.instagram.com/");
	//driver.get("https://www.saucedemo.com/");
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	}
@Test(dataProvider="logindata")
public void details(String user, String pass)
{
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement email=driver.findElement(By.name("username"));instagram
	//WebElement email=driver.findElement(By.name("user-name"));  //Saucedemo
	WebElement email=driver.findElement(By.name("email"));//facebook
	
	email.sendKeys(user);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//WebElement pwd=driver.findElement(By.name("password"));instagram
	//WebElement pwd=driver.findElement(By.name("password")); //Saucedemo
	WebElement pwd=driver.findElement(By.id("pass"));//facebook
	
	pwd.sendKeys(pass);
	//driver.findElement(By.name("login-button")).click(); //saucedemo
	driver.findElement(By.name("login")).click(); //facebook
	

	//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
	//*[@id="loginForm"]/div/div[3]/button/div
	
	
}

@DataProvider(name="logindata")
      public String[][] getdata() throws IOException
      {
	/*String logindata[][]={{"666666666","qeqejgf"},
			{"666666667","admin@111"}
	
	};*/
	    String path ="D:\\excel\\maggi01.xlsx";
	    Excel_utility01 utility= new  Excel_utility01(path);
	    int totalrows=utility.getRowCount("FB");
	    int totalcols=utility.getCellCount("FB",1);
	    String loginData[][]=new String[totalrows][totalcols];
	    for(int i=1;i<=totalrows;i++)
	    {
	    for(int j=0;j<totalcols;j++)
	    {
	    loginData[i-1][j]=utility.getCellData("FB", i, j);
	    }
	    }
	    return loginData;
	    }
}