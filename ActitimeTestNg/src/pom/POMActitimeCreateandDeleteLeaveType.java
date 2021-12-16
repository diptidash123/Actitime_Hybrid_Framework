package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCreateandDeleteLeaveType 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	 private WebElement settingsButton;
	 
	 @FindBy(xpath="//a[.='Leave Types']")
	 private WebElement dropdownmenuleavetypes;
	 
	 @FindBy(xpath="//span[.='Create Leave Type']")
	 private WebElement CreateleavetypeButton;
	 
	 @FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	 private WebElement leavetypenameTextfield;
	 
	 @FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	 private WebElement createleavetypebutton;
	 
	 @FindBy(xpath="(//span[.='bahubali'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	 private WebElement deleteButton;

	 public POMActitimeCreateandDeleteLeaveType  (WebDriver driver)
	 {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void leavetypeMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 settingsButton.click();
		 Thread.sleep(3000);
		 dropdownmenuleavetypes.click();
		 Thread.sleep(3000);
		 CreateleavetypeButton.click();
		 Thread.sleep(3000);
		 leavetypenameTextfield.sendKeys("bahubali");
		 Thread.sleep(3000);
		 createleavetypebutton.click();
	 }
	 public void deleteMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 deleteButton.click();
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(5000);
		 alt.accept();
	 }
}
