package actitimePOMClasseswithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTaskWebPagePF {

	
	 
	// Declaration  + Early Initialization

		@FindBy(xpath ="//div[text()='Tasks']")
		private WebElement task;

		@FindBy(xpath ="//input[@name='visiableFilterString']")
		private WebElement name;

		@FindBy(xpath ="//input[@id='tasksFilterSubmitButton']")
		private WebElement applyFilter;

		WebDriver driver;

		// Initialization
		public ActitimeTaskWebPagePF(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void verifyactitimeActitimeTask() {
			task.click();
		}
		public void setactitimeActitimeTaskName() {
			name.sendKeys("Annotation");
		}
		
		public void verifyactitimeActitimeTaskApplyFilter() {
			applyFilter.click();
		}

	
}
