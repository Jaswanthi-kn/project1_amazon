package package1_practice_amazon.amazon_system_practice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Screenshot_Listener.class)
public class Class2_InvalidLogin extends Screenshot_Listener{
@Test
	public void Invalid_login() throws InterruptedException
	{
		 driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*Amazon_CreateAccount_page A1=new Amazon_CreateAccount_page(driver);
		A1.createaccount();
		Thread.sleep(1000);
		A1.createaccount_con();
		A1.yourname();
		A1.mobileno();
		A1.pwd();
		A1.verifynumber();*/
		
		/* Amazon_Valid_Login_Page A2= new Amazon_Valid_Login_Page(driver);
		A2.mono();
		A2.conti();
		A2.password();
		A2.sign_in();  */
		
		Amazon_Invalid_Login_Page A3=new Amazon_Invalid_Login_Page(driver);
		A3.mono();
		A3.conti();
		A3.password();
		A3.sign_in();
		
		
}
}