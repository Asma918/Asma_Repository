package base;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ErrorHandler.UnknownServerException;
import org.openqa.selenium.safari.ConnectionClosedException;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WdEventListener implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("The popup alert ");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("The value before editing at the located element" +arg0.toString().substring(67,80)+ 
				" in " +arg1.toString().substring(0, arg1.toString().indexOf(':'))+ " and the value is " +arg2.toString());
		
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		
		System.out.println("The element "+arg0.toString().substring(arg0.toString().indexOf('>'), 80)+ "is clicked and now it is in" +arg1);
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("The element is identified by locator" +arg0+ "using the web element" +arg1+ "and the value is" +arg2);
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		
		System.out.println("The page is navigated back to the prevoius window" +arg0);
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		
		System.out.println("The page is navigated to the next window" +arg0);
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		System.out.println("The page" +arg0+ "is refreshed");
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {

		System.out.println("The driver " +arg1.toString().substring(0, arg1.toString().indexOf(':'))+" is launched with url " +arg0);
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
		System.out.println("After Script" +arg0+ "   "+arg1);
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		
		System.out.println("Before accepting alert" +arg0);
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		
		System.out.println("After accepting alert" +arg0);
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("The value before editing at the located element" +arg0.toString().substring(67,80)+ 
				" in " +arg1.toString().substring(0, arg1.toString().indexOf(':'))+ " and the value is " +arg2.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		
		System.out.println("The element " +arg0+ "before clicking"+arg1);
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("The driver "+arg1.toString().substring(0, arg1.toString().indexOf(':'))+" ");
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwble, WebDriver arg1) {
		/*switch(throwble)
		{
		
		}*/
		if(throwble instanceof NoSuchElementException)
		{
			System.out.println("The element could not be found"+throwble.getMessage().substring(5, throwble.getMessage().indexOf('}')+1));
			//System.out.println("The element could not be found"+arg0.getMessage());
		}
		else if(throwble instanceof NoSuchWindowException)
		{
			System.out.println("The window could not be found"+throwble.getMessage().substring(5, throwble.getMessage().indexOf('}')+1));
		}
		else if(throwble instanceof UnhandledAlertException)
		{
			System.out.println("The window could not be found"+throwble.getMessage().substring(5, throwble.getMessage().indexOf('}')+1));
		}
		else if(throwble instanceof NoAlertPresentException)
		{
			System.out.println("The window could not be found"+throwble.getMessage().substring(5, throwble.getMessage().indexOf('}')+1));
		}
		else if(throwble instanceof NoSuchFrameException)
		{
			System.out.println("The window could not be found"+throwble.getMessage().substring(5, throwble.getMessage().indexOf('}')+1));
		}
		else if(throwble instanceof ConnectionClosedException)
		{
			System.out.println("the browser connection is closed " +throwble.getMessage());
		}
		else if(throwble instanceof TimeoutException)
		{
			System.out.println("The session is timedout " +throwble.getMessage());
		}
		else if(throwble instanceof UnknownServerException)
		{
			System.out.println("The server is not valid " +throwble.getMessage());
		}
		throw new RuntimeException();
	}

}
