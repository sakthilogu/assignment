package facebooklogin;

import java.io.FileNotFoundException;
import java.io.IOException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import facebookloginPages.LoginPage;
import facebookloginPages.Nextpage;

public class FacebookloginStepdef extends Nextpage {

	@Given("^Open facebook Url$")
	public void launchlogin() throws FileNotFoundException, IOException {
		launchBrowserr();

	}

	@when("^Url opened enter username and password proceed to login$")
	public void logintoapplication() {
		try {
			login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^Enter facebook status and click logout$")
	public void logoutapp() {
		try {
			 enterStatus();
			 Thread.sleep(10000);
			logout();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^finally close the browser$")
	public void closebrowser() {
		driver.quit();
	}
}
