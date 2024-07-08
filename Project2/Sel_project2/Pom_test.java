package Sel_project2;

import org.testng.annotations.BeforeTest;

public class Pom_test {

	WebDriver driver;
	automationexercise objectrepro;

	@BeforeTest

public void beforetest() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	driver.get("https://automationexercise.com/test_cases");
}
	@Test
	public void Register_User() {
	automationexercise obj=new automationexercise(driver);
		obj.register("valid details");		
	}
	@Test
	public void Login_User_with_correct_email_and_password() {
		objectrepro =new automationexercise(driver);
		objectrepro.Register_correct_creditionals();		
	}
	@Test
	public void Loginuser_with_incorrect_email_and_passwor() {
		objectrepro =new automationexercise(driver);
		objectrepro.Register_incorrect_creditionals();		
	}
	@Test
	public void LogoutUser() {
		objectrepro =new automationexercise(driver);
		objectrepro.Click_Logout();		
	}
	@Test
	public void Register_User_with_existing_emai() {
		objectrepro =new automationexercise(driver);
		objectrepro.Register_exixting_creditionals();		
	}
	@Test
	public void Contact_Us_Form() {
		objectrepro =new automationexercise(driver);
		objectrepro.check_contact_option();		
	}
	@Test
	public void VerifyTest_Cases_Page() {
		objectrepro =new automationexercise(driver);
		objectrepro.verify_test_cases();		
	}
	@Test
	public void VerifyAllProductsandproductdetailpage() {
		objectrepro =new automationexercise(driver);
		objectrepro.verify_product&productdetails();		
	}
	@Test
	public void Search_Product() {
		objectrepro =new automationexercise(driver);
		objectrepro.Search_product();		
	}
	@Test
	public void Verify_Subscription_in_home_page() {
		objectrepro =new automationexercise(driver);
		objectrepro.Verify_Homepage();		
	}
	@Test
	public void AddProductsinCart() {
		objectrepro =new automationexercise(driver);
		objectrepro.Addproducts();		
	}
	@Test
	public void VerifyProductquantityinCart() {
		objectrepro =new automationexercise(driver);
		objectrepro.Check_productquantity();		
	}
	@Test
	public void PlaceOrderRegisterwhilecheckout() {
		objectrepro =new automationexercise(driver);
		objectrepro.RegisterWhileCheckout();		
	}
	@Test
	public void PlaceOrderRegisterbeforeCheckout() {
		objectrepro =new automationexercise(driver);
		objectrepro.RegisterBeforeCheckout();		
	}
	@Test
	public void PlaceOrderLogin before Checkout() {
		objectrepro =new automationexercise(driver);
		objectrepro.Place_Order();		
	}
	@Test
	public void RemoveProductsFromCart() {
		objectrepro =new automationexercise(driver);
		objectrepro.Remove_Products();		
	}
	@Test
	public void ViewCategoryProducts() {
		objectrepro =new automationexercise(driver);
		objectrepro.ViewCategoryProducts();		
	}
	@Test
	public void View&CartBrandProducts() {
		objectrepro =new automationexercise(driver);
		objectrepro.ViewItems();		
	}
	@Test
	public void SearchProductsandVerifyCartAfterLogin() {
		objectrepro =new automationexercise(driver);
		objectrepro.Verify_Cart();		
	}
	@Test
	public void Addreviewonproduct() {
		objectrepro =new automationexercise(driver);
		objectrepro.Review_Product();		
	}
	@Test
	public void AddtocartfromRecommendeditems() {
		objectrepro =new automationexercise(driver);
		objectrepro.SelectItemsToCart();		
	}
	@Test
	public void Verifyaddressdetailsincheckoutpage() {
		objectrepro =new automationexercise(driver);
		objectrepro.Check_ADDRESS();		
	}
	@Test
	public void DownloadInvoiceafterpurchaseorder() {
		objectrepro =new automationexercise(driver);
		objectrepro.verifyInvoice();		
	}
	@Test
	public void VerifyScrollUpusingArrowbuttonandScrollDownfunctionality() {
		objectrepro =new automationexercise(driver);
		objectrepro.CheckScrollUp_ScrollDown()();		
	}
	@Test
	public void VerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality() {
		objectrepro =new automationexercise(driver);
		objectrepro.CheckScrollUp_ScrollDown();		
	}
}
