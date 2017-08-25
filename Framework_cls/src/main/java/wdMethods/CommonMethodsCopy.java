package wdMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethodsCopy {
	
	WebDriver driver;
	public static WebElement ele;
	String url;
	Select sObj;
	WebElement field=null;
	
   public void invokeAppFirefox(String url)
     {
	   this.url=url;
	   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
       driver = new FirefoxDriver();
	   driver.get(url);
   }
   
   public void invokeAppChrome(String url)
   {
	   this.url=url;
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
     driver = new ChromeDriver();
	   driver.get(url);
 }
   
	public WebElement locateElement(String locatorType,String locatorValue)
	{
		switch(locatorType)
		{
		case "id":
			ele=driver.findElement(By.id(locatorValue));
		break;
		case "name":
			ele=driver.findElement(By.name(locatorValue));
		break;
		case "className":
			ele=driver.findElement(By.className(locatorValue));
			break;
		case "tagName":
			ele=driver.findElement(By.tagName(locatorValue));
			break;
		case "linkText":
			ele=driver.findElement(By.linkText(locatorValue));
			break;
		case "partialLinkText":
			ele=driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "xpath":
			ele=driver.findElement(By.xpath(locatorValue));
			break;
		case "cssSelector":
			ele=driver.findElement(By.cssSelector(locatorValue));
			break;
		}
		return ele;
	}
	
	
	public String get_Text(String locatorType, String locatorValue)
	{
		field = locateElement(locatorType,locatorValue);
		String text = field.getText();
		return text;
	}
	
	public WebElement getAttribute()
	{
	 WebElement elemnt = null;
	return elemnt;	
	}
	public boolean verifyText(String locatorType, String locatorValue,String textValue)
	{
		String targetString=get_Text(locatorType,locatorValue );
		
		if (targetString.equals(textValue))
	
		return true;
		
		else 
			
		return false;
	}
	
	public void enterData(String locatorType, String locatorValue, String data)
	{
		field = locateElement(locatorType,locatorValue);
		field.sendKeys(data);
	}
	
	public void click(String locatorType, String locatorValue)
	{
		field = locateElement(locatorType,locatorValue);
		field.click();
		
	}
	public void clear(WebElement element)
	{
		element.clear();
	}
	
	public void selectVisibleText(String locatorType, String locatorValue, String dropdownText)
	{
		field = locateElement(locatorType,locatorValue);
		sObj = new Select(field);
		sObj.selectByVisibleText(dropdownText);
	}
	
	public void selectIndex(String locatorType, String locatorValue, int indexNum)
	{
		field = locateElement(locatorType,locatorValue);
		sObj = new Select(field);
		sObj.selectByIndex(indexNum);
	}
	
	public void selectValue(String locatorType, String locatorValue, String value)
	{

		field = locateElement(locatorType,locatorValue);
		sObj = new Select(field);
		sObj.selectByValue(value);
	}
	
	public void takeSnap()
	{
		
	}
	
	public void switchWindow(int windarg)
	{
		//String winhandle=driver.getWindowHandle();
		Set<String> winhandles = driver.getWindowHandles();
		List<String> windList = new ArrayList();
		winhandles.addAll(windList);
        driver.switchTo().window(windList.get(windarg));
  
		/*for (String han: driver.getWindowHandles())
		{
			
			driver.switchTo().window(han);
			
		}*/
	}
	
	public void switchFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void alertAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String alertGetText()
	{
		String alertMsg = driver.switchTo().alert().getText();
		return alertMsg;
	}

	public void closeApp()
	   {
	   driver.close();
	   }

}
