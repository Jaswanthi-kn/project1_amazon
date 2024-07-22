package package1_practice_amazon.amazon_system_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4_ProfilePage {
@Test
	public void Amazon_manageprofile() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Amazon_Valid_Login_Page A2= new Amazon_Valid_Login_Page(driver);
		A2.mono();
		A2.conti();
		A2.password();
		A2.sign_in();
		
		Amazon_Profile_Page A4=new Amazon_Profile_Page(driver);  //testcase ---4
		A4.Account_Lists(driver);
		A4.Manage_profiles();
		A4.view_profile();
		A4.prefered_department();
		A4.prefered_dpt_add();
		A4.women_button();
		A4.save_button();
		//A4.Height_Weight();
		//A4.Add_heightandweight_button();
		//A4.Height_ft_option();
		//A4.Height_ft_option_value();
		//A4.Height_in_option_value();
		//A4.weight_lbs_option();
		//A4.weight_lbs_option_value();
		//A4.weight_kg_option();
		//A4.weight_kg_option_value();
		//A4.heightWeight_save_button();
		A4.Age_Group();
		A4.Age_Group_add();
		
		
		
		
		
		
		
		
		
		
		
		
}
}