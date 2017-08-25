package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass extends CommonMethods{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In Before Test");
	}
	
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("In Before Groups");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		String appurl="http://leaftaps.com/opentaps";
		System.out.println("In Before Method");
		invokeAppChrome(appurl);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In After Method");
		closeApp();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("In After Class");
	}
	
	@AfterGroups
	public void afterFroups()
	{
		System.out.println("In After Groups");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In After Suite");
	}
}
