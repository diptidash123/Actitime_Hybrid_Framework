package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeCreateandDeleteWork;
import pom.POMActitimeLogin;

public class TestActitimeCreateDeletework
{
 @Test
 
 public void work()
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		POMActitimeLogin login=new POMActitimeLogin(driver);
		login.loginMethod();
		
		POMActitimeCreateandDeleteWork work=new POMActitimeCreateandDeleteWork(driver);
		work.createtypeofworkworkMethod();
		work.deleteMethod();
 }
}
