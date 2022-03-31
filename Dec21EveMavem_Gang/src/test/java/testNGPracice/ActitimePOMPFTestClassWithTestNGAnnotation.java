package testNGPracice;

import org.testng.annotations.Test;

import actitimePOMClasseswithPF.ActitimeHomePagePF;
import actitimePOMClasseswithPF.ActitimeLoginPagePF;
import actitimePOMClasseswithPF.ActitimeTaskWebPagePF;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ActitimePOMPFTestClassWithTestNGAnnotation {
	
	WebDriver driver;
	ActitimeLoginPagePF a;
	ActitimeHomePagePF b;
	ActitimeTaskWebPagePF c;
	
	
	
  @Test
  public void avrifyLogo() {
	  System.out.println("Test Senario 1 is  executing For Logo verification ");
	  b.verifyActitimeLogo();
	  System.out.println("Test Senario 1 is Exicuted Suscsfully  For Logo verification ");
	   
  }
  @Test
  public void bclickTask()   {
	  System.out.println("Test Senario 2 is  Click On Task Tab And Fill Information ");
	  c.verifyactitimeActitimeTask();
	  c.setactitimeActitimeTaskName();
	  //Thread.sleep(3000);
	  c.verifyactitimeActitimeTaskApplyFilter();
	  System.out.println("Test Senario 1 is Exicuted Suscsfully  And Task Is Filled ");
	   
  }
  
  @BeforeMethod
  public void logineActitime() {
	  System.out.println("Login Into Application");
	  a.setActitimeUsername();
	  a.setActitimePassword();
	  a.verifyActitimeLoginButton();
  }

  @AfterMethod
  public void logoutActitimepage() {
	  System.out.println("Login Into Application");
	  b.verifyActitimelogout();
  }

  @BeforeClass
  public void openBrowser() {
	  System.out.println("Open Suscecsefully");
	  System.setProperty("webdriver.chrome.driver", "E:\\Velocity Training\\Setups\\ChromeDriver98_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		a = new ActitimeLoginPagePF(driver);
		b = new ActitimeHomePagePF(driver);
		c = new ActitimeTaskWebPagePF(driver);
		
		
  }

  @AfterClass
  public void closeBrowser() {
	  System.out.println("Close Browser");
	  driver.quit();
  }

}
