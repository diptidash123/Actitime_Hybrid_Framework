package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class ActitimeLogin implements Autoconstant
{
	@FindBy(id="user")
	 private WebElement usernameTextfield;
	 
	 @FindBy(name="pwd")
	 private WebElement passwordTextfield;
	 
	 @FindBy(id="keepLoggedInLabel")
	 private WebElement keepmeloggedinCheckbox;
	 
	 @FindBy(id="loginButton")
	 private WebElement loginButton;
	 
	 @FindBy(xpath="//a[.='Forgot your password?']")
	 private WebElement forgotyourpasswordLink;
	 
	 @FindBy(xpath="//a[.='actiTIME Inc.']")
	 private WebElement actitimeIncLink;
	 
	 
	 public ActitimeLogin (WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 
	 public void loginMethod() throws IOException, InterruptedException
	 {
		 usernameTextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,0));
		 Thread.sleep(3000);
		 passwordTextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,1));
		 Thread.sleep(3000);
		 keepmeloggedinCheckbox.click();
		 loginButton.click();
	 }
	 
	 public void forgotyourpasswordMethod()
	 {
		 forgotyourpasswordLink.click();
	 }
	 
	 public void actimeIncMethod()
	 {
		 actitimeIncLink.click();
	 }
}
