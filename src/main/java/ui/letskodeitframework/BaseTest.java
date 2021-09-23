package ui.letskodeitframework;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import ui.letskodeitframework_Pages.HomePage;
import ui.letskodeitframework_Pages.LoginPage;


public class BaseTest {
	
	protected WebDriver driver;
	
	protected HomePage homePage;
	protected LoginPage loginPage;

	
	@Before
	public void startUp() {
	    String baseUrl = "https://courses.letskodeit.com/practice";
	    WebDriverManager.getInstance(CHROME).setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	    initElements();
	  }
	
	  private void initElements() {
		  
		  homePage = PageFactory.initElements(driver, HomePage.class);
		  loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		  }
	  
	  @After
	  public void tearDown() {
	    if (driver != null) {
	      driver.quit();
	    }
	  }

}