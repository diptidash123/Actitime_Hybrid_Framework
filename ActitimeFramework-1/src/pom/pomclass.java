package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Excellibrary;

public class pomclass implements Autoconstant
{
	@FindBy(xpath="//input[@id='username']")
	 private WebElement usernametetxfield;
	 
	 @FindBy(xpath="//input[@name='pwd']")
	 private WebElement passwordtextfield;
	 
	 @FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	 private WebElement checkboxbutton;
	 
	 @FindBy(xpath="//a[@id='loginButton']")
	 private WebElement loginbutton;
	 
	 @FindBy(xpath="//a[.='Forgot your password?']")
	 private WebElement forgetlink;
	 
	 @FindBy(xpath="//a[.='actiTIME Inc.']")
	 private WebElement actitimeinclink;

	 public pomclass(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void logindetails() throws IOException
	 {
		 usernametetxfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,0));
		 passwordtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 1));
		 checkboxbutton.click();
		 loginbutton.click();
	 }
	 
	 public void link()
	 {
		 forgetlink.click();
		 actitimeinclink.click();
	 }
}