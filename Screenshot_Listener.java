package package1_practice_amazon.amazon_system_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Screenshot_Listener implements ITestListener{
	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("this is the create account page");
		TakesScreenshot s1=driver;
		File source=s1.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\Girish Nagaraj\\Desktop\\screenshot\\fail\\"+"fail"+Math.random()+".jpg");
		File destination=new File("C:\\Users\\Girish Nagaraj\\Desktop\\Jassu\\screenshot\\pass\\"+"pass"+Math.random()+".png");
		
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("this is the create account page");
		TakesScreenshot s1=driver;
		File source=s1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Girish Nagaraj\\Desktop\\screenshot\\fail\\"+"fail"+Math.random()+".jpg");
		//File destination=new File("C:\\Users\\Girish Nagaraj\\Desktop\\Jassu\\screenshot\\pass\\"+"pass"+Math.random()+".png");
		
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
