package temp.luma.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import temp.luma.poc.LumaSearchPage;

public class TestMethod_LumaSearch {
	
	
	WebDriver driver;
	LumaSearchPage objectrepro;

	@BeforeTest

public void beforetest() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("https://magento.softwaretestingboard.com/");
}


@Test
public void SearchOperation() throws InterruptedException {
	LumaSearchPage page = new LumaSearchPage(driver);
	page.searchluma("shirts");	
}

@Test
public void ClickBtn() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.ClickBtn();	
}

@Test
public void Whatnew() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.ClickWhatsnew();
}

@Test
public void Women() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.ClickWomen();
}

@Test
public void Men() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.ClickMen();
}

@Test
public void Cart() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.ClickCart();
}

@Test
public void Sortby() throws InterruptedException {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.CheckSortby();
}

@Test
public void CreateNewCustomerAccount () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.CheckSortby();
}
@Test
public void clickOnCreateanAccount () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.clickOnCreateanAccount();
}
@Test
public void CustomerLogin () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.CustomerLogin();
}
@Test
public void MyAccount () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.MyAccount();
}

@Test
public void MyOrders () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.MyOrders();
}

@Test
public void MyDownloadableProducts () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.MyDownloadableProducts();
}

@Test
public void MyWishList() {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.MyWishList();
}

@Test
public void AddNewAddress () {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.AddNewAddress();
}

@Test
public void AccountInformation() {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.AccountInformation();
}

@Test
public void StoredPaymentMethods() {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.StoredPaymentMethods();
}

@Test
public void MyProductReviews() {
	objectrepro = new LumaSearchPage(driver);
	objectrepro.MyProductReviews();
}

@AfterTest


public void aftertest() {
	driver.quit();
}
}
