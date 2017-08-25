package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.WdEventListener;
import base.WrapperMethodInterface;

public class CommonMethods extends WdEventListener implements WrapperMethodInterface{
	
	WebDriver driver;
	public static WebElement ele;
	String url;
	Select sObj;
	WebElement field=null;
	public static EventFiringWebDriver eventdriver; // to access outside this package ie in AbstarctPAge
	
   public void invokeAppFirefox(String url)
     {
	   this.url=url;
	   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
       driver = new FirefoxDriver();
	   driver.get(url);
	   eventdriver = new EventFiringWebDriver(driver);
	   WdEventListener event = new WdEventListener();
	   eventdriver.register(event);
	   
   }
   
   public void invokeAppChrome(String url)
   {
	   this.url=url;
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
       driver = new ChromeDriver();
	   eventdriver = new EventFiringWebDriver(driver);
	   WdEventListener eventclassobj = new WdEventListener();
	   eventdriver.register(eventclassobj);
	   eventdriver.get(url);
 }
   
	public WebElement locateElement(String locatorType,String locatorValue)
	{
		switch(locatorType)
		{
		case "id":
			ele=eventdriver.findElement(By.id(locatorValue));
		break;
		case "name":
			ele=eventdriver.findElement(By.name(locatorValue));
		break;
		case "className":
			ele=eventdriver.findElement(By.className(locatorValue));
			break;
		case "tagName":
			ele=eventdriver.findElement(By.tagName(locatorValue));
			break;
		case "linkText":
			ele=eventdriver.findElement(By.linkText(locatorValue));
			break;
		case "partialLinkText":
			ele=eventdriver.findElement(By.partialLinkText(locatorValue));
			break;
		case "xpath":
			ele=eventdriver.findElement(By.xpath(locatorValue));
			break;
		case "cssSelector":
			ele=eventdriver.findElement(By.cssSelector(locatorValue));
			break;
		case "type":
			ele=eventdriver.findElement(By.xpath("*//*[@type='"+locatorValue+"']'"));
			break;
		case "value":
			ele=eventdriver.findElement(By.xpath("*//*[@value='"+locatorValue+"']'"));
			break;
		case "href":
			ele=eventdriver.findElement(By.xpath("*//*[@href='"+locatorValue+"']'"));
			break;
		}
		
		return ele;
	}
	
	
	public String get_Text(WebElement field )
	{
		//field = locateElement(locatorType,locatorValue);
		String text = field.getText();
		return text;
	}
	
	public WebElement getAttribute()
	{
	 WebElement elemnt = null;
	return elemnt;	
	}
	public boolean verifyText(WebElement field,String textValue)
	{
		String targetString=get_Text(field);
		
		if (targetString.equals(textValue))
	
		return true;
		
		else 
			
		return false;
	}
	
	public void enterData(WebElement field, String data)
	{
		field.sendKeys(data);
	}
	
	public void click(WebElement field)
	{
				field.click();
		
	}
	public void clear(WebElement element)
	{
		element.clear();
	}
	
	public void selectVisibleText(WebElement field, String dropdownText)
	{
		
		sObj = new Select(field);
		sObj.selectByVisibleText(dropdownText);
	}
	
	public void selectIndex(WebElement field, int indexNum)
	{
		
		sObj = new Select(field);
		sObj.selectByIndex(indexNum);
	}
	
	public void selectValue(WebElement field, String value)
	{

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
		eventdriver.switchTo().frame(element);
	}
	
	public void alertAccept()
	{
		eventdriver.switchTo().alert().accept();
	}
	
	public void alertDismiss()
	{
		eventdriver.switchTo().alert().dismiss();
	}
	
	public String alertGetText()
	{
		String alertMsg = eventdriver.switchTo().alert().getText();
		return alertMsg;
	}
	
	public boolean verifyTitle(String titl)
	{
		String title = eventdriver.getTitle();
		System.out.println("title = " +title);
		if(title.equals(titl))
		{
			return true;
		}
		else
			return false;
	}

	public void closeApp()
	   {
		eventdriver.close();
	   }

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAllBrowsers() {
		eventdriver.quit();
		
	}

}
