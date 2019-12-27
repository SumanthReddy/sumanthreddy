package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FlightReservation_Main_Page extends LaunchBrowser {
	WebDriver driver = LaunchURL();
	
	public void Login(){
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
	}

	public void bookticket(){
		WebElement element = driver.findElement(By.linkText("SIGN-OFF"));
		String ActValue = element.getText();
		String ExpValue = "SIGN-OFF";
		System.out.println(ActValue);
		Assert.assertEquals(ActValue, ExpValue);
		
		String ActTitle = driver.getTitle();
		String ExpTitle = "Find a Flight: Mercury Tours:"; 
		System.out.println(ActTitle);
		Assert.assertEquals(ActTitle, ExpTitle);
		
		String ActUrl = driver.getCurrentUrl();
		String ExpUrl = "http://newtours.demoaut.com/mercuryreservation.php";
		System.out.println(ActUrl);
		Assert.assertEquals(ActUrl, ExpUrl);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
}

