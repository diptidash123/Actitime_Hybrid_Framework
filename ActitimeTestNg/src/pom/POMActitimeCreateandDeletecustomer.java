package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCreateandDeletecustomer
{
	public WebDriver driver;
	
 @FindBy(xpath="//div[@id='container_tasks']")
 private WebElement TaskButton;
 
 @FindBy(xpath="//div[.='Add New']")
 private WebElement dropdownmenuAddnew;
 
 @FindBy(xpath="//div[@class='item createNewCustomer']")
 private WebElement Newcustomer;
 
 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
 private WebElement entercustomernameTextfield;
 
 @FindBy(xpath="//div[.='Create Customer']")
 private WebElement createcustomerbutton;
 
 @FindBy(xpath="(//div[.='Cancel'])[27]")
 private WebElement cancelButton;
 
 @FindBy(xpath="(//div[@class='editButton'])[1]")
 private WebElement customersetting;
 
 @FindBy(xpath="(//div[.='ACTIONS'])[1]")
 private WebElement Actiondropdown;
 
 @FindBy(xpath="(//div[.='Delete'])[2]")
 private WebElement deletebutton;
 
 @FindBy(xpath="//span[.='Delete permanently']")
 private WebElement deletetextfield;

public POMActitimeCreateandDeletecustomer (WebDriver driver)
{
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
}

public void customerMethod()
{
	TaskButton.click();
	dropdownmenuAddnew.click();
	Newcustomer.click();
	entercustomernameTextfield.sendKeys("bahubali");
	
}

public void createcustomerMethod()
{
	createcustomerbutton.click();
}
public void cancelcustomer()
{
	cancelButton.click();
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}

public void deletecustomer() throws InterruptedException
{
	 Thread.sleep(5000);
	 customersetting.click();
	 Thread.sleep(5000);
	 Actiondropdown.click();
	 Thread.sleep(5000);
	 deletebutton.click();
	 deletetextfield.click();
	 
	 
	
}
}