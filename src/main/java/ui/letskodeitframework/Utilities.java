package ui.letskodeitframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
 
	
	public void SelectByValue(WebElement locator,String value) {
		Select objSelect = new Select(locator);
		objSelect.selectByValue(value);

	}
	
	

}
