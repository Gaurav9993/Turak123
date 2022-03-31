package actitimePOMClasseswithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePagePF {

	// Declaration 
	@FindBy(xpath ="//img[@height='61']")
	private WebElement logo;
	
	@FindBy(xpath ="//a[@id='logoutLink']")
	private WebElement logout;
	WebDriver driver;

	// Initialization
	public ActitimeHomePagePF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Usage

	public void verifyActitimeLogo() {
		boolean res = logo.isDisplayed();
		if (res=true) {
			System.out.println("Test Scenario is Passed and Logo Verified "+res);
		}
	}
	public void verifyActitimelogout() {
		logout.click();
	}

	
	
}
