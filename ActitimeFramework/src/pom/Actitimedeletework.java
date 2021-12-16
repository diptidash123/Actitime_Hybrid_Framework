package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimedeletework
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	 private WebElement settingsButton;
	 
	 @FindBy(xpath="//a[.='Types of Work']")
	 private WebElement dropdownmenuTypesofWork;
	 
	 @FindBy(xpath="//a[.='bahubali']/../..//a[contains(text(),'delete')]")
	 private WebElement deleteButton;

	 public Actitimedeletework (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void deleteMethod() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 settingsButton.click();
		 Thread.sleep(5000);
		 dropdownmenuTypesofWork.click();
		 deleteButton.click();
		 Thread.sleep(5000);
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(5000);
		 alt.accept();
	 }
}
	 
	 
