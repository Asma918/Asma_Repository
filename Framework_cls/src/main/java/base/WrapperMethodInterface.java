package base;



import org.openqa.selenium.WebElement;

public interface WrapperMethodInterface {

	
	/**
	     * This method will launch the given browser and maximise the browser and set the
		 * wait for 30 seconds and load the url
		 * @author Asma
		 * @param browser - The browser of the application to be launched
		 * @param url - The url with http or https
	*/
	public void invokeAppFirefox(String url);
    
	public void invokeAppChrome(String url);
	
   /**
        * This method is used to locate an element using the 8 locators available in selenium
        * @param locatorType - one of the locators --> 'id','name','className','tagName',
        * 'linkText','partialLinkText,'xpath','cssSelector'
        * @param locatorValue - the inspected value corresponding to the locator
        * @author Asma
        * @return  returns a webelement to the findElement method in enterData
    */  
	public WebElement locateElement(String locatorType,String locatorValue);

	
	
	/**
		 * This method will display the text from a particular filed
		 * @param locatorType - one of the locators --> 'id','name','className','tagName',
         * 'linkText','partialLinkText,'xpath','cssSelector'
         * @param locatorValue - the inspected value corresponding to the locator
         * @author Asma
         * @return  returns a webelement to the findElement method in enterData
	*/
	public String get_Text(WebElement field);
	
	public WebElement getAttribute();
	
	
	/**
		 * This method will verify the given text with partial match
		 *  @param locatorType - one of the locators --> 'id','name','className','tagName',
         * 'linkText','partialLinkText,'xpath','cssSelector'
         *  @param locatorValue - the inspected value corresponding to the locator
         *  @param text  - The text to be verified
         * @author Asma
	 */
	public boolean verifyText(WebElement field,String textValue);
	
	/**
	     * This method will enter the value to the text field using id attribute to locate
		 * @param field - the webelement from which the data will be fetched
		 * @param data - The data to be sent to the webelement
		 * @author Asma
	 */
	public void enterData(WebElement field, String data);
	
	
	/**
	 * This method will click the element using the given webelement
	 * @param field - the webelement  which to be clicked
	 * @author Asma
	 */
	public void click(WebElement field);
	
	/**
	 * This method will clear the value for the given webelement
	 * @param field - the webelement  from which the data will be erased
	 * @author Asma
	 */
	public void clear(WebElement element);
	
	/**
	 * This method will select the drop down visible text using the given webelement obtained from locateElement method
	 * @param field - The webelement of the down element which will be passed to the Select class
	 * @param dropdownText The value to be selected (visibletext) from the dropdown 
	 * @author Asma
	 */
	public void selectVisibleText(WebElement field, String dropdownText);
	
	/**
	 * This method will select the drop down text with index  using the given webelement obtained from locateElement method
	 * @param field - The webelement of the down element which will be passed to the Select class
	 * @param indexNum The index number to be selected from the dropdown 
	 * @author Asma
	 */
	public void selectIndex(WebElement field, int indexNum);
	
	/**
	 * This method will select the drop down text with value using the given webelement obtained from locateElement method
	 * @param field - The webelement of the down element which will be passed to the Select class
	 * @param indexNum The value to be selected from the dropdown 
	 * @author Asma
	 */
	public void selectValue(WebElement field, String value);
	
	/**
	 * This method will take snapshot of the browser
	 * @author Asma
	 */
	public void takeSnap();
	
	/**
	 * This method will move the control to different windows opened currently using the index value. 
	 * 0- 1st windw, 1- 2nd window, so on
	 * @param windarg - window number to which the control should go
	 * @author Asma
	 */
	public void switchWindow(int windarg);
	
	/**
	 * This method will move the control to different frames in a page.
	 * @param element - webelement of the frame to be opened
	 * @author Asma
	 */
	public void switchFrame(WebElement element);
	
	/**
	 * This method will accept the alert opened
	 * @author Asma
	 */
	public void alertAccept();
	
	/**
	 * This method will dismiss the alert opened
	 * @author Asma
	 */
	public void alertDismiss();
	
	/**
	 * This method will return the text of the alert
	 * @author Asma
	 */
	public String getAlertText();
	
	/**
	 * This method will verify the title of the browser 
	 * @param titl - The expected title of the browser
	 * @author Asma
	 * @return returns boolean true if title matches; otherwise false
	 */
	public boolean verifyTitle(String titl);
	
	
	/**
	 * This method will close the active browser
	 * @author Asma
	 */
	public void closeApp();
	
	/**
	 * This method will close all the browsers
	 * @author Asma
	 */
	public void closeAllBrowsers();

}
