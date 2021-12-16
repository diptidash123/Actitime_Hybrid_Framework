package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeLogin
{
 @FindBy(id="username")
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
 
 
 public POMActitimeLogin(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 
 public void loginMethod()
 {
	 usernameTextfield.sendKeys("admin");
	 passwordTextfield.sendKeys("manager");
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
