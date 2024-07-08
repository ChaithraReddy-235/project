package Sel_project2;

import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

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
	//@Test
	//public void Login_User_with_correct_email_and_password() {
		//objectrepro =new automationexercise(driver);
		//objectrepro.Click_Login();		
	//}
}
