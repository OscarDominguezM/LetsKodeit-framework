package ui.letskodeitframework_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private String emailUser = "test@testing1.com";
	private String password = "test1234";
	
	
	@FindBy (css= "h3[class='heading3 text-center-xs']")
	private WebElement loginHeader;
	
	@FindBy (css= "#email")
	private WebElement emailTextBox;
	
	@FindBy (css= "#password")
	private WebElement passwordTextBox;
	
	@FindBy (css= "input[type='submit']")
	private WebElement loginButton;
	
	
	
	public boolean CheckIfLoginHeaderIsDisplayed() {
		return loginHeader.isDisplayed();
	}
	
	public void TypeEmail(String emailUser) {
		emailTextBox.sendKeys(this.emailUser);
	}
	
	public void TypePassword(String password) {
		passwordTextBox.sendKeys(this.password);
	}
	
	public void ClickLoginButton() {
		loginButton.click();
	}
	
	
	
	
	
	
}