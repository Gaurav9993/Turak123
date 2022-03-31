package actitimePOMClasseswithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPagePF {

	//Declaration + Early Initialization 
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement un;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement pass;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;
	
	WebDriver driver;
	
	//Initialization
	
	public FlipkartLoginPagePF (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//usage
	
	public void setFlipkartUsername(){ 
		un.sendKeys("8806818283");
	}
	public void setFlipkartPassword() {
		pass.sendKeys("Mahindra575$");
	}
	public void verifyFlipkarLoginButton() {
		loginbutton.click();
	}
	
	
	
	
}
