 package Sel_project2;

public class Pom1 {
WebDriver driver;

public TestCase(WebDriver driver)
{
	this.driver=driver;

}

  ByRegisterUser =By.xpath("//div[@class='panel panel-default']");
  ByLoginUserwithcorrectemailandpassword=By.xpath("//div[@class='panel-heading']");
  ByLoginuser_with_incorrect_email_and_password=By.xpath("//h4[@class='panel-title']");
  ByLogoutUser =By.xpath("//h4[@class='panel panel-default']");
  ByRegister_User_with_existing_email=By.xpath("//h4[@class='panel-title']");
  ByContact_Us_Form=By.xpath("//div[@class='panel panel-default']");
  ByVerifyTest_Cases_Page=By.xpath("//h4[@class='panel-title']");
  ByVerifyAllProductsandproductdetailpage=By.xpath("//h4[@class='panel-title']");
  BySearch_Product=By.xpath("//h4[@class='panel-title']");
  ByVerify_Subscription_in_home_page= By.xpath("//div[@class='panel panel-default']");
  ByVerify_Subscription_in_Cart_page= By.xpath("//div[@class='panel-collapse collapse']");
  ByAddProductsinCart= By.xpath("//div[@class='panel-collapse in']");
  ByVerifyProductquantityinCart= By.xpath("//div[@class='panel-collapse collapse']");
  ByPlaceOrderRegisterwhilecheckout= By.xpath("//div[@class='panel-collapse collapse']");
  ByPlaceOrderRegisterbeforeCheckout= By.xpath("//div[@class='panel-collapse collapse']");
  ByPlaceOrderLogin before Checkout= By.xpath("//div[@class='panel-collapse collapse']");
  ByRemoveProductsFromCart= By.xpath("//div[@class='panel-collapse in']");
  ByViewCategoryProducts= By.xpath("//div[@class='panel-collapse collapse']");
  ByView&CartBrandProducts= By.xpath("//div[@class='panel-collapse collapse']");
  BySearchProductsandVerifyCartAfterLogin= By.xpath("//div[@class='panel-collapse collapse']");
  ByAddreviewonproduct= By.xpath("//div[@class='panel-collapse collapse']");
  ByAddtocartfromRecommendeditems= By.xpath("//div[@class='panel-collapse collapse']");
  ByVerifyaddressdetailsincheckoutpage= By.xpath("//div[@class='panel-collapse collapse']");
  ByDownloadInvoiceafterpurchaseorder= By.xpath("//div[@class='panel-collapse collapse']");
  ByVerifyScrollUpusingArrowbuttonandScrollDownfunctionality= By.xpath("//div[@class='panel-collapse collapse']");
  ByVerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality= By.xpath("//div[@class='panel-collapse in']");
  
  public void Register_User() {
	  try {
	  	driver.findElement(Register_User).click();
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Login_User_with_correct_email_and_password() {
	  try {
	  	driver.findElement(Login_User_with_correct_email_and_password).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  
  public void Loginuser_with_incorrect_email_and_passwor() {
	  try {
	  	driver.findElement(Loginuser_with_incorrect_email_and_passwor).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void LogoutUser() {
	  try {
	  	driver.findElement(LogoutUser).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Register_User_with_existing_emai() {
	  try {
	  	driver.findElement(Register_User_with_existing_emai).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Contact_Us_Form() {
	  try {
	  	driver.findElement(Contact_Us_Form).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void VerifyTest_Cases_Page() {
	  try {
	  	driver.findElement(VerifyTest_Cases_Page).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void VerifyAllProductsandproductdetailpage() {
	  try {
	  	driver.findElement(VerifyAllProductsandproductdetailpage).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Search_Product() {
	  try {
	  	driver.findElement(Search_Product).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  
  public void Verify_Subscription_in_home_page() {
	  try {
	  	driver.findElement(Verify_Subscription_in_home_page).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void AddProductsinCart() {
	  try {
	  	driver.findElement(AddProductsinCart).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void VerifyProductquantityinCart() {
	  try {
	  	driver.findElement(VerifyProductquantityinCart).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void PlaceOrderRegisterwhilecheckout() {
	  try {
	  	driver.findElement(PlaceOrderRegisterwhilecheckout).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void PlaceOrderRegisterbeforeCheckout() {
	  try {
	  	driver.findElement(PlaceOrderRegisterbeforeCheckout).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void RemoveProductsFromCart() {
	  try {
	  	driver.findElement(RemoveProductsFromCart).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void ViewCategoryProducts() {
	  try {
	  	driver.findElement(ViewCategoryProducts).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void View&CartBrandProducts() {
	  try {
	  	driver.findElement(View&CartBrandProducts).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void SearchProductsandVerifyCartAfterLogin() {
	  try {
	  	driver.findElement(SearchProductsandVerifyCartAfterLogin).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Addreviewonproduct() {
	  try {
	  	driver.findElement(Addreviewonproduct).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void AddtocartfromRecommendeditems() {
	  try {
	  	driver.findElement(AddtocartfromRecommendeditems).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void Verifyaddressdetailsincheckoutpage() {
	  try {
	  	driver.findElement(Verifyaddressdetailsincheckoutpage).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void DownloadInvoiceafterpurchaseorder() {
	  try {
	  	driver.findElement(DownloadInvoiceafterpurchaseorder).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  public void VerifyScrollUpusingArrowbuttonandScrollDownfunctionality() {
	  try {
	  	driver.findElement(VerifyScrollUpusingArrowbuttonandScrollDownfunctionality).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }

  public void VerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality() {
	  try {
	  	driver.findElement(VerifyScrollUpwithoutArrowbuttonandScrollDownfunctionality).sendKeys(Send data);
	  	}catch(Exception e)
	  	{
	  		System.out.println("EXCEPTION CAUGHT" + e.getMessage());
	  	}
	  }
  