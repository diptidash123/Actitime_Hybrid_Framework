package test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeCreateWork;
import pom.ActitimeLogin;
import pom.Actitimedeletework;

public class Actitimeonetestclasstestmethodrunmultitimes
{
	
	public WebDriver driver;
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	}
	 
	@Test(invocationCount=2)
	  public void Login()
	  {
		    ActitimeLogin login=new ActitimeLogin(driver);
			login.loginMethod();
	  }
	  
	  @Test(invocationCount=2)
	  public void creatework()
	  {
			
			ActitimeCreateWork creatework=new ActitimeCreateWork(driver);
	 		creatework.createtypeofworkworkMethod();
	 		
	  }
	  
	  @Test(invocationCount=2)
	  public void deletework() throws InterruptedException
	  {
	 		
	 		ActitimeLogin login=new ActitimeLogin(driver);
			login.loginMethod();
	 		
			Actitimedeletework deletework=new Actitimedeletework(driver);
	 		deletework.deleteMethod();
}
}