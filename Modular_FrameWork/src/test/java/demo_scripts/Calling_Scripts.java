package demo_scripts;

import org.testng.annotations.Test;

import demo_package.FlightReservation_Main_Page;

public class Calling_Scripts {
	FlightReservation_Main_Page CallMainPage = new FlightReservation_Main_Page();
	
	@Test
	public void Call_All_Scripts(){
		
		CallMainPage.Login();
		CallMainPage.bookticket();
		CallMainPage.closeBrowser();
	}

}
