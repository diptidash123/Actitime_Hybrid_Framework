package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeCreateandDeleteLeaveType;
import pom.POMActitimeLogin;

public class TestActitimeCreateDeleteLeavetype 
{
 @Test
 
 public void leave() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		 POMActitimeLogin login=new  POMActitimeLogin(driver);
		 login.loginMethod();
		 
		 POMActitimeCreateandDeleteLeaveType  leave=new POMActitimeCreateandDeleteLeaveType  (driver);
		 leave.leavetypeMethod();
		 leave.deleteMethod();
 }
}
