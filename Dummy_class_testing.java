package package1_practice_amazon.amazon_system_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy_class_testing {
	public class Class1_CreateAccount extends Screenshot_Listener{
		@Test
		public void Amazon_creataccount() throws InterruptedException
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

			//testcase 2 - it is working
			Amazon_Valid_Login_Page A2= new Amazon_Valid_Login_Page(driver);
			A2.mono();
			A2.conti();
			A2.password();
			A2.sign_in(); 

			/* //testcase 3 - it is working

			Amazon_Invalid_Login_Page A3= new Amazon_Invalid_Login_Page(driver);
				A3.mono();
				A3.conti();
				A3.password();
				A3.sign_in();  */

			//testcase 5 - it is working
			Amazon_Home_Page A4=new Amazon_Home_Page(driver);
			A4.searchfield();
			A4.s_button();

			//testcase 6 -it is not working - having doubts
			/* Amazon_Product_Page A5=new Amazon_Product_Page(driver);
			A5.category();
			A5.cat_shoes();
			 */

			/*//testcase 7 -

			Amazon_SearchResult_Page s=new Amazon_SearchResult_Page(driver);
			s.firstProduct();
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> s2=s1.iterator();
		String parent=s2.next();
		String child=s2.next();
		driver.switchTo().window(child);
		// s.pro_rating();
		// s.cus_review();
		 Amazon_Product_Page A7=new Amazon_Product_Page(driver);

		 //A7.ratings();
		 //A7.pricing(); */

		/*	//testcase 8

			Amazon_Product_Page A8=new Amazon_Product_Page(driver);
			A8.womensshoes();
			System.out.println("getting womens running shoes");
			A8.sortby_featured_LH();
			System.out.println("getting low to high price shoes");
			A8.sortby_featured_HL();
			System.out.println("getting high to low price shoes");
			A8.avg_rivews();
			System.out.println("getting the avg reivews"); */
			
		//testcase 9	- it is working 
			
			Amazon_Cart_Page A9=new Amazon_Cart_Page(driver);
			A9.First_Product();

			Set<String> s1=driver.getWindowHandles();
			Iterator<String> s2=s1.iterator();
			String parent=s2.next();
			String child=s2.next();
			driver.switchTo().window(child);
			A9.Add_To_Cart();
			A9.Go_cart();      // testcase 10 
			//A9.update_option();
			//A9.box_qa();
			//A9.qty3();
			//A9.item_remove();  //not removing item
			
			Amazon_Address_Page A11=new Amazon_Address_Page(driver);   //testcase 11
			A11.procced_To_Buy();
			//A11.country_region();
			A11.first_last_name();
			A11.mobile_number();
			A11.PIN_code();
			A11.House_address();
			A11.Area_address();
			A11.nearBy_landmark();
			A11.city_town();
			A11.state_s();
			A11.use_address(); // getting error as element not intractble exception
			
			Amazon_PaymentMethods_Page A12=new Amazon_PaymentMethods_Page(driver);  //test case --12
			A12.paymentmethod();
			A12.apply_promotion();
			A12.c_d_card();
			A12.card_details();
			A12.cardnumber();
			A12.Net_Banking();
			A12.other_upi_apps();
			A12.EMI_payment();
			A12.cash_on_delivery();
			

			
		}
	}
}