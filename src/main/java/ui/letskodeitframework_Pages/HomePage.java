package ui.letskodeitframework_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.letskodeitframework.Utilities;

public class HomePage extends Utilities {
	
	
	@FindBy (css= "header[class=v1-header]")
	private WebElement HomePageHeader;
	
	@FindBy (css= "a[href=\'/sign_in\']")
	private WebElement loginLinkl;
	
	@FindBy (css= "#bmwradio")
	private WebElement bmwRadioButton;
	
	@FindBy (css= "#benzradio")
	private WebElement benzRadioButton;
	
	@FindBy (css= "#hondaradio")
	private WebElement hondaRadioButton;
	
	@FindBy (css= "#carselect")
	private WebElement carSelectDropDown;
	
	@FindBy(css= "#multiple-select-example")
	private WebElement FruitrSelectOption;

	
	Utilities util = new Utilities();
	public void SelectBmwFromDropDown() {
		util.SelectByValue(carSelectDropDown, "bmw");
	}
	
	public void SelectBenzFromDropDown() {
		util.SelectByValue(carSelectDropDown, "benz");
	}
	
	public void SelectHondaFromDropDown() {
		util.SelectByValue(carSelectDropDown, "honda");
	}
	
	public void SelecAppleFromList() {
		util.SelectByValue(FruitrSelectOption, "apple");
	}
	
	public void SelecOrangeFromList() {
		util.SelectByValue(FruitrSelectOption, "orange");
	}
	
	public void SelecPeachFromList() {
		util.SelectByValue(FruitrSelectOption, "peach");
	}
	
	
	public boolean CheckIfHeaderIsDisplayed() {
		return HomePageHeader.isDisplayed();
			
	}
	
	public void ClickLoginLink() {
		loginLinkl.click();
	}
	
	public void ClickBmwRadioButton() {
		bmwRadioButton.click();
	}
	
	public void ClickBenzRadioButton() {
		benzRadioButton.click();
	}
	
	public void ClickHondaRadioButton() {
		hondaRadioButton.click();
	}
	
	
	

}
