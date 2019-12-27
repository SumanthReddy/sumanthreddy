package demo_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
		
		public WebDriver WebDriverLoad(){
	String absolutepath = System.getProperty("user.dir");
	//String filepath = absolutepath+"\\chromedriver.exe";
	String filepath = absolutepath+"\\Drivers"+"\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", filepath);
	driver = new ChromeDriver();
	return driver;
}
		//@DataProvider(name = "Login")
		public Object[][] getDataFromDataprovider() {

			return new Object[][] {

					{ "testing", "testing" }, { "dixit", "dixit" }, { "testabhi", "testabhi" } };

}
}
