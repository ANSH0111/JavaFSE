# SELENIUM AUTOMATION:

###### **Intro to Browser Automation:**

Controlling a web browser using code.

Same tests need to be run many times. It helps save time.

Using Selenium we can do browser automation.



###### **SELENIUM:**

Open-source tool and works only on web browsers.

Features:

1. Supports multiple programming languages.
2. Supports multiple browsers.
3. Supports different O.S like Windows,Linux.

Founded by Jason Huggins in 2004.



###### Components of Selenium:

SELENIUM RC - Slow and complex

SELENIUM IDE - For beginners
SELENIUM WEB DRIVER - Main tool used in real projects

SELENIUM GRID - Multi-tasking and help in parallel execution

**Advantages and Limitations:**

Open source, cross platform , CI/CD

**SELENIUM WEBDRIVER IS A JAVA INTERFACE.**

It connects java with our browser. It has only rules.

**Standard API Methods:** Used to communicate with the browser.



###### **SELENIUM WEB DRIVER ARCHITECTURE:**



Test Script

Web Driver(Interface/Api)

Remote Web Driver (Actual Implementation) implements web driver interface

Browser Driver (e.g-ChromeDriver,FirefoxDriver,EdgeDriver) extends remote web driver

Browser(Chrome,Edge etc.)



###### **Application Under Test(AUT):**

Website or the application that we have to test. e.g - Google login page.

GUI elements - Things we see and interact with.



###### Locators - Open chrome, right click element, click inspect and code highlighted.

Before finding elements, selenium needs to open a browser.

e.g - Webdriver driver = new ChromeDriver();



###### **Different locators:**

1. Find element by Id:

Unique id's for different elements

driver.findElement(By.id("username"));

Best,fastest,unique locator



2\) Find element by Name:

May or may not be unique.

driver.findElement(By.name("submit"));



3\) Find element by Link Text:

Selenium uses link text to find a link on the page

A- Scan whole page, find anchor tags, read visible text.

B- Compare with "Input text". If match then return element.



Note- We can also use partialLinkText if we do not know the full link text. e.g - Click Me works with Click and Me not with "lick".



4\) Find element by Class Name:

A label given to an HTML element used to group similar elements together.



5\) By css selector:

Pattern used to locate or selects elements based on attributes like id,class,tagName. Used when id or name not available. Widely used in real-time automation.

driver.findElement(By.cssSelector("#username"));



###### RELATIVE LOCATORS:

Used to find element based on another element's position. e.g - above, below, toLeftOf, toRightOf, Near.

SYNTAX:

driver.findElement(RelativeLocator.with(By.tagName("input")).above("password"));



###### Chained Locators:

Locate elements inside another element.

SYNTAX:
driver.findElement(By.id("parent")).findElement(By.id("child"));



###### **LOCATING BY XPATH:**

Path to locate element in HTML.

Types:

1. Absolute XPath(/): Full path from root.

e.g - driver.findElement(By.xpath("/html/body/../input\[1]));

2\. Relative XPath(//): Can start from any tag directly. Short start point,length,high flexibility and easy maintenance. Mostly used in production.

e.g - driver.findElement(By.xpath("//input\[@id='username']));



Important functions in XPath: Screenshot in FILE EXPLORER.



###### **FIND OPTIONS IN DROPDOWN:**

SELECT class - Helper class provided by Selenium. Only works with <select> tag.

Methods -

selectByVisibleText() - based on visible text in the dropdown

selectByValue() - based on value attribute

selectByIndex() - based on position(index)



###### **Without SELECT class:**



**Method 1- Using list+loop**

List<WebElement> options = driver.findElements("By.xpath(..));

for(WebElement option:options)

{

if(option.getText().equals("India"))

&#x09;option.click();

}



**Method 2- Using Direct xPath**

WebElement elmt = driver.findElement(By.xpath("//li\[text()='India']")).click();



**Method 3- Using contains**

driver.findElement(By.xpath("//li\[contains(text(),'Ind')]")).click();



**Method 4- Using css selector**

CssSelector



**Method 5- Using actions(Hover dropdown)**

Actions action = new Actions(driver);

WebElement menu = driver.findElement(By.id("menu"));

actions.moveToElement(menu).perform();

driver.findElement(By.xpath("//li\[text()='India']")).click();



**LOCATING RADIO BUTTON:**
Radio button is treated as a normal element. Can be used with id,class,loop etc.



**LOCATING BY TAGNAME:**

driver.findElement(By.tagName("<tagname>"));



DESIRED CAPABILITIES:
Settings for browser before starting automation. Helps in configuration of : browser,os,version etc.

Capabilities: browserName,platform,version,acceptInsecureCerts,headless

Screenshot in FILE EXPLORER.

NOTE: Now we use ChromeOptions,FirefoxOptions.



###### **Canvas Elements:**

It is a drawing area. e.g - charts,pads,drawings etc.

Selenium cannot directly interact with canvas.

Screenshot in FILE EXPLORER.



**Initialize actions class,use methods to validate the canvas.**



Actions act = new Actions(driverElement);

act.moveToElement(canvas,50,50).clickAndHold().moveByOffset(100,0).moveByOffset(0,100).release().perform();



###### **JavaScriptExecutor:**

When Selenium cannot interact normally, we use JSE to control the page directly.

//Create JSE object

JavascriptExecutor jse = (JavascriptExecutor) driver;

js.executeScript("JS code");



###### **Used when:**

Normal Selenium fails, Element hidden or not clickable, need to scroll and page is dynamic.



###### **Mouse and keyboard actions in Selenium:**

Handled using Action class: .click(),doubleClick(),moveToElement() etc.

Always use .perform() to perform the action. sendKeys(), keyDown()-> press a key, keyUp()-> release a key.



actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();



###### **Drag and Drop :**

dragAndDrop(source,target).perform();



###### **Handling Windows and frames:**

**Frame - Webpage inside another webpage(like Youtube embedded video).**

By index - driver.switchTo().frame(0);

By name/id - "frameName";

By Web Element - driver.switchTo().frame(frameWebElement);

driver.switchTo().defaultContent() -> Switch back to main page.



**Window/Tab Handling -**

driver.getWindowHandle();  Gives unique id of window

driver.getWindowHandles(); Gives unique id of all windows opened

driver.switchTo().window(id);

Screenshot in Explorer.



###### **ToolTip Hover:**

Small text shown when we mouse hover over an element.



###### **Types of tooltip:**

1. Attribute tooltip- text stored in title attribute(always present)
WebElement element = driver.findElement(By.id("btn"));
element.getAttribute(title);
2. Dynamic tooltip - Need to first hover than perform actions.

&#x20;  Screenshot in EXPLORER.



###### **Handling Cookies:**

Used a lot in login testing. Small text files to store user data.

driver.manage().getCookies();

driver.manage().addCookie(cookie);

driver.manage().deleteAllCookies();

driver.manage().deleteCookieNamed(cookie);



Session cookies - Deleted when browser closes.

Persistent cookies - Stored permanently. Have an expiry date.

getName(),getValue().





###### **Waits in Selenium:**

**To overcome error in case of execution , we use Waits.**

1. Implicit Wait : Global wait. Once set then applies to all elements.

SYNTAX: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

No control for specific elements.



2\. Explicit wait : Wait for specific condition.

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));



3\. Fluent wait : Customized version of Explicitwait.

SCREENSHOT IN FILE EXPLORER.



###### **Identifying ancestors of Web Element: Finding above elements.**

**WebElement element = driver.findElement(By.xpath("//input\[@id='usernmae']/ancestor::form");**



###### **ALERTS in SELENIUM:**

Alerts are popup messages from browser. Used to show message or take input.



###### **Types :**

1. Simple alert
2. Confirmation alert
3. Prompt alert

Syntax: driver.switchTo().alert().accept();



###### **Regex in Selenium:**

Used to verify text, validate data and extract values from UI.

Example patterns in FILE EXPLORER SCREENSHOTS.



###### **Screenshots in Selenium:**

File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

Fileutils.copyFile(src,new File("path"));





Headless: Browser without UI. Browser runs in background but we cannot see it. Faster execution and less resource usage.

SCREENSHOT IN FILE EXPLORER.

