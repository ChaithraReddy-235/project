package temp.luma.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LumaSearchPage {
	WebDriver driver;
	
	//the search reffering to the driver so other page reffering to this driver.
public	LumaSearchPage(WebDriver driver) {
	this.driver=driver;
}

  By SearchBox=By.xpath("//input[@name='q']");
  By ClickBtn=By.xpath("//div[@class='page-title-wrapper'][1]");
  By Whatnew =By.xpath("//a[@id='ui-id-3']");
  By Women=By.xpath("//a[@class['level-top ui-corner-all']");
  By Men=By.xpath("//a[@class['level-top ui-corner-all']");
  By Gear=By.xpath("//a[@class['level-top ui-corner-all']");
  By Trainings=By.xpath("//a[@id='ui-id-7']");
  By Sale=By.xpath("//a[@id='ui-id-8']");
  By Cart=ByXPath("//a[@class='action showcart']");
By Sortby=By.xpath("//div[@class='toolbar-sorter sorter']");
  By Create_New_Customer=By.xpath("//div[@class=\"page-title-wrapper\"]");
  By clickOnCreateanAccount=By.xpath("");
  By CustomerLogin=By.xpath("//li[@class='authorization-link']");
  By  MyAccount=By.xpath("//h1[@class='base']");
  By MyOrders=By.xpath("//h1[@class='page-title']");
  By MyDownloadableProducts=By.xpath("h1[@class='page-title']");
  By MyWishList=By.xpath("//li[@class='nav item']");
  By AddNewAddress=By.xpath("//h1[@class='page-title']");
  By AccountInformation=By.xpath("//h1[@class='page-title']");
  By StoredPaymentMethods=By.xpath("//h1[@class='page-title']");
  By MyProductReviews=By.xpath("//h1[@class='page-title']");

public void searchluma(String  Searchinput) {

	try {
		driver.findElement(SearchBox).sendKeys(Searchinput);
		driver.findElement(ClickBtn).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
}
private By ByXPath(String string) {
	// TODO Auto-generated method stub
	return null;
}

public void ClickBtn1() {
try {
	driver.findElement(ClickBtn).click();
	}catch(Exception e)
	{
		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	}
}
public void ClickWomen() {
	try {
		driver.findElement(Women).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
}
	
public void ClickMen() {
	try {
		driver.findElement(Men).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}	
}

public void ClickWhatsnew() {
	try {
		driver.findElement(Whatnew).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void ClickCart() {
	try {
		driver.findElement(Cart).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void Gear() 
{
try {
	driver.findElement(Gear).click();
	}catch(Exception e)
	{
		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	}
}
public void Trainings() 
{
try {
	driver.findElement(Trainings).click();
	}catch(Exception e)
	{
		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	}
}
public void Sale() 
{
try {
	driver.findElement(Sale).click();
	}catch(Exception e)
	{
		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	}
}
public void CheckSortby() {
	{
		try {
			driver.findElement(Sortby).click();
			}catch(Exception e)
			{
				System.out.println("EXCEPTION CAUGHT" + e.getMessage());
			}
		}
	

	
}
public void clickOnCreateanAccount() {
	{
		try {
			driver.findElement(clickOnCreateanAccount).click();
			}catch(Exception e)
			{
				System.out.println("EXCEPTION CAUGHT" + e.getMessage());
			}
		}
	
}
public void CustomerLogin() {
	try {
		driver.findElement(CustomerLogin).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	}
public void MyAccount() {
	
	try {
		driver.findElement(MyAccount).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	}
public void MyOrders() {
	try {
		driver.findElement(MyOrders).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
	
}
public void MyDownloadableProducts() {
	try {
		driver.findElement(MyDownloadableProducts).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void MyWishList() {
	try {
		driver.findElement(MyWishList).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void AddNewAddress() {
	try {
		driver.findElement(AddNewAddress).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void AccountInformation() {
	try {
		driver.findElement(AccountInformation).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
}
public void StoredPaymentMethods() {
	try {
		driver.findElement(StoredPaymentMethods).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
	
	
}
public void MyProductReviews() {
	try {
		driver.findElement(MyProductReviews).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
}
public void ClickBtn() {
	try {
		driver.findElement(ClickBtn).click();
		}catch(Exception e)
		{
			System.out.println("EXCEPTION CAUGHT" + e.getMessage());
		}
}
}
	

