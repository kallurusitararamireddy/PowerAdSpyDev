package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;


public class Verify_Facebook_SortBy_TestScript extends TestBase {
	@Test
	public void Verify_Facebook_SortBy_TestScript () throws Exception {
		
		Facebook_Pages sortBy = new Facebook_Pages(getDriver());		
		
		sortBy.FacebookpageSortBy();    			//Facebook page
		
		sortBy.Facebook_SortBy_Newest();    		//Newest
		sortBy.Facebook_SortBy_LastSeen();			//Last Seen
		sortBy.Facebook_SortBy_RunningLongest();	//Running Longest
		sortBy.SortBy_Domain_Registration_Date();	//Domain Registration
}
}