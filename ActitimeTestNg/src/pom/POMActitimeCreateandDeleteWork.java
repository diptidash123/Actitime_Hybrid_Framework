package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMActitimeCreateandDeleteWork
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	 private WebElement settingsButton;
	 
	 @FindBy(xpath="//a[.='Types of Work']")
	 private WebElement dropdownmenuTypesofWork;
	 
	 @FindBy(xpath="//span[.='Create Type of Work']")
	 private WebElement CreatetypeofworkButton;
	 
	 @FindBy(xpath="//input[@id='name']")
	 private WebElement nameTextfield;
	 
	 @FindBy(xpath="//select[@name='active']")
	 private WebElement statusdropdownlist;
	 
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement createbutton;
	 
	 @FindBy(xpath="//a[.='bahubali']/../..//a[contains(text(),'delete')]")
	 private WebElement deleteButton;

	 
	 public POMActitimeCreateandDeleteWork (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void createtypeofworkworkMethod()
	 {
		 settingsButton.click();
		 dropdownmenuTypesofWork.click();
		 CreatetypeofworkButton.click();
		 nameTextfield.sendKeys("bahubali");
		 Select sel=new Select(statusdropdownlist);
		 sel.selectByVisibleText("archived");
		 createbutton.click();
	 }
	 public void deleteMethod()
	 {
		 deleteButton.click();
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
	 }
}