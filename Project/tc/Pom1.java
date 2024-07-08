package Sel_project2;

public class Pom1 {
WebDriver driver;

public TestCase(WebDriver driver)
{
	this.driver=driver;

}

  By Register_User=By.xpath("//div[@class='panel panel-default']");
  By Login_User_with_correct_email_and_password=By.xpath("//div[@class='panel-heading']");
  By Login_User_with_incorrect_email_and_password=By.xpath("//h4[@class='panel-title']");
  By  Logout_User=By.xpath("//h4[@class='panel panel-default']");
  By Register_User_with_existing_email=By.xpath("//h4[@class='panel-title']");
  By Contact_Us_Form=By.xpath("//div[@class='panel panel-default']");
  By Verify_Test_Cases_Page=By.xpath("//h4[@class='panel-title']");
  By Verify_All_Products_and_product_detail_page=By.xpath("//h4[@class='panel-title']");
  By Search_Product=By.xpath("//h4[@class='panel-title']");
  By Verify_Subscription_in_home_page=By.xpath("//div[@class='panel panel-default']");
  By Verify_Subscription_in_Cart_page=By.xpath("//div[@class='panel-collapse collapse']");
  
  
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
