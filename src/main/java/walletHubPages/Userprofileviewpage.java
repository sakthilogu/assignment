package walletHubPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Userprofileviewpage extends Welcomepage {
	public Userprofileviewpage openingurl() throws FileNotFoundException, IOException  {
		loadObjects();
		driver.navigate().to("https://wallethub.com/profile/test_insurance_company/");
		//Thread.sleep(800);
		
		
		return this;
	}
	
	public Userprofileviewpage Userloginchk() throws FileNotFoundException, IOException, InterruptedException {
		
		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		
		clickbyActions(prop.getProperty("loginbut.xpath"));
		Thread.sleep(800);
		enterbyXPath(prop.getProperty("email.add"), prop.getProperty("email.value"));
		enterbyXPath(prop.getProperty("password"), prop.getProperty("pwd.value"));
		clickByXpath(prop.getProperty("login.button3"));
		
		//String profile_user=driver.findElement(By.xpath(prop.getProperty("username.xpath"))).getText();
		//String actual_user=prop.getProperty("username");
//		if(profile_user.equalsIgnoreCase(actual_user))
//		{
//			System.out.println(profile_user +"Logged in successfully");
//		}
//		else
//		{
//			System.out.println(profile_user +"failed to login");
//		}
		
		
		
		return this;
	}
	public WriteReviewpage clickonFourthStar() throws FileNotFoundException, IOException, InterruptedException {
		

		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		WebElement element1 = driver.findElement(By.xpath(prop.getProperty("enable.review")));
		mousehoverByxpath(prop.getProperty("enable.review"));
		mousehoverByxpath(prop.getProperty("star1.xpath"));
		 mousehoverByxpath(prop.getProperty("star2.xpath"));
		mousehoverByxpath(prop.getProperty("star3.xpath"));
		mousehoverByxpath(prop.getProperty("star4.xpath"));
		mousehoverByxpath(prop.getProperty("star5.xpath"));
		clickbyActions(prop.getProperty("star5.xpath"));

		//WebElement element1 = driver.findElement(By.xpath(prop.getProperty("enable.review")));

//		String strJavaScript = "var element = arguments[0];"
//				+ "var mouseEventObj = document.createEvent('MouseEvents');"
//				+ "mouseEventObj.initEvent( 'mouseover', true, true );" + "element.dispatchEvent(mouseEventObj);";
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript(strJavaScript, element1);
		// WebElement element =
		// driver.findElement(By.xpath(prop.getProperty("star3.xpath")));
		// executor1.executeScript(strJavaScript, element);
//		Thread.sleep(800);
//		WebElement firstStar = driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[2]"));
//		executor.executeScript(strJavaScript, firstStar);
//		Thread.sleep(800);
//		WebElement twoStar = driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[3]"));
//		executor.executeScript(strJavaScript, twoStar);
//		Thread.sleep(800);
//		WebElement thirdStar = driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[4]"));
//		executor.executeScript(strJavaScript, thirdStar);
//		Thread.sleep(1000);
//		WebElement fourthStar = driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[5]"));
//		executor.executeScript(strJavaScript, fourthStar);
//		Thread.sleep(1000);
		//executor.executeScript("arguments[0].click();", fourthStar);
		return new WriteReviewpage();
	}

	public WriteReviewpage clickonlink() {
		driver.navigate().back();
		clickByXpath(prop.getProperty("review.button"));

		return new WriteReviewpage();
	}
}
