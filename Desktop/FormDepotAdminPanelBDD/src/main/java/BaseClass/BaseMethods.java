package BaseClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BaseMethods {

public static WebDriver driver ;
	
	
	//@BeforeAll
	public static void setup() {

		//System.setProperty("webdriver.gecko.driver", "/Users/mohammadakram.saiyed/Desktop/geckodriver22");
			System.setProperty("webdriver.chrome.driver", "/Users/mohammadakram.saiyed/git/Formdepotjava/Desktop/FormDepotAdminPanelBDD/src/main/resources/drivers/chromedriver");
		//driver = new FirefoxDriver();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	}
	
	
//	public static void setup(String browser) {
//
//		if(browser.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/mohammadakram.saiyed/eclipse-workspace/FormDepotAdminPanel/src/main/resources/drivers/chromedriver");
//			driver = new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/mohammadakram.saiyed/eclipse-workspace/FormDepotAdminPanel/src/main/resources/drivers/chromedriver");
//			driver = new ChromeDriver();
//		}
//		else {
//			System.setProperty("webdriver.chrome.driver", "/Users/mohammadakram.saiyed/eclipse-workspace/FormDepotAdminPanel/src/main/resources/drivers/chromedriver");
//			driver = new ChromeDriver();
//		}
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}

	@org.junit.jupiter.api.AfterAll
	public void teardown() throws IOException {
		driver.quit();
	}

	public void refresh() {
		driver.navigate().refresh();
	}
	//navigate
	public  void go(String url) {
		driver.get(url);
	}

	//println method
	public void print(String string) {
		System.out.println(string);
	}

	//find method
	public WebElement find(String locator) {
		return driver.findElement(By.xpath(locator));
	}

	//click method
	public void click(String locator) {
		find(locator).click();
	}

	//typing method
	public void type(String locator,String string) {
		find(locator).sendKeys(string);
	}
	
	public void clear(WebElement string) {
		string.clear();
	}
	

	
	
	public String xpath(String string) throws IOException {
		FileReader xpathreader=new FileReader("/Users/mohammadakram.saiyed/git/Formdepotjava/Desktop/FormDepotAdminPanelBDD/src/test/resources/Properties/xpath.properties");
		Properties props=new Properties();
		props.load(xpathreader);
		return props.getProperty(string);
	}
	

	
	public static void printCurrentUrl() {
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
	}
	

	public static void verifyPageUrl(String expectedUrl) {
        String currentUrl= driver.getCurrentUrl();
		if (currentUrl.equals(expectedUrl)) {
        	
      
            System.out.println("URLs match! Current URL: " + currentUrl);
        } else {
            System.out.println("URLs do not match! Expected URL: " + expectedUrl + ", Current URL: " + currentUrl);
        }
    }
	//get property for data input
	public String data(String string) throws IOException {
		FileReader datareader=new FileReader("/Users/mohammadakram.saiyed/git/Formdepotjava/Desktop/FormDepotAdminPanelBDD/src/test/resources/Properties/data.properties");
		Properties props=new Properties();
		props.load(datareader);
		return props.getProperty(string);
	}
//
//	//get property for element xpath
//	public String xpath(String string) throws IOException {
//		FileReader xpathreader=new FileReader("C:\\Users\\deep.mangi\\eclipse-workspace\\LambdaTest_Playground\\src\\test\\resources\\xpath.properties");
//		Properties props=new Properties();
//		props.load(xpathreader);
//		return props.getProperty(string);
//	}

	//hover
	public void hover(String string) {
		Actions action = new Actions(driver);
		action.moveToElement(find(string)).perform();
	}

	//Thread Sleep
	public void sleep(int duration_in_ms) throws InterruptedException {
		Thread.sleep(duration_in_ms);
	}

	//screenshot for failed tests
	public static String screenshot(WebDriver driver,String ScreenshotName) throws IOException {
		String datename = new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Destination = System.getProperty("user.dir")+"/FailedTestScreenShots/"+ScreenshotName+datename+".png";
		File fileDestination = new File(Destination);
		//FileUtils.copyFile(source, fileDestination);
		return Destination;
	}
}











