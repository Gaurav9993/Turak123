package actitimePOMClasseswithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPagePF {

	// Declaration + Early Initialization
	
		@FindBy(xpath ="//input[@id='username']")
		private WebElement un;
		
		@FindBy(xpath ="//input[@name='pwd']")
		private WebElement pwd;
		
		@FindBy(xpath ="//a[@id='loginButton']")
		private WebElement loginbutton;
		WebDriver driver;

		// Initialization
		public ActitimeLoginPagePF(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		// Usage
		
		public void setActitimeUsername() {
			un.sendKeys("admin");
		}
		public void setActitimePassword() {
			pwd.sendKeys("manager");
		}
		public void verifyActitimeLoginButton() {
			loginbutton.click();
		}

	
	
	
	
}
