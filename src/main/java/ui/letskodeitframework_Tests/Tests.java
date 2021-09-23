package ui.letskodeitframework_Tests;


import org.junit.Test;

import ui.letskodeitframework.BaseTest;




public class Tests extends BaseTest  {
	
	/*
	 * @Test public void Login () {
	 * 
	 * Assert.assertTrue(homePage.CheckIfHeaderIsDisplayed());
	 * homePage.ClickLoginLink();
	 * Assert.assertTrue(loginPage.CheckIfLoginHeaderIsDisplayed());
	 * loginPage.TypeEmail(null); loginPage.TypePassword(null);
	 * 
	 * 
	 * }
	 */
	@Test 
	public void InteractWithRadioButtons() {
		
		homePage.ClickBmwRadioButton();
		homePage.ClickBenzRadioButton();
		homePage.ClickHondaRadioButton();
		
	}
	
	@Test 
	public void InteractWithDropDowns() {
		homePage.SelectBmwFromDropDown();
		homePage.SelectBenzFromDropDown();
		homePage.SelectHondaFromDropDown();
		homePage.SelecAppleFromList();
		homePage.SelecOrangeFromList();
		homePage.SelecPeachFromList();
		
	}
	
	
	

		

		
	

}
