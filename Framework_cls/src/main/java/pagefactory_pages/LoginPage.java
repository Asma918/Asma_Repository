package pagefactory_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAbstractPage {

	public LoginPage(){
	
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement uName;
	public LoginPage enterUsername(String userName)
	{
		enterData(uName, userName);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	public LoginPage enterPassword(String pwd)
	{
		enterData(password, pwd);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	WebElement logitbutton;
	public HomePage clickLoginButton()
	{
		click(logitbutton);
		return new HomePage();
	}
}

