package actiTimeTest;
import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeHomePagePO;
import actiTimePO.ActiTimeLoginPagePO;

public class ActiTimeHomeTest extends BaseTest {
	
	@Test
	public void testLogout() {
		driver.get(TEST_URL);
		ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
		loginPO.login("skswati26", "TUPybE5U");	
		ActiTimeHomePagePO homePO=new ActiTimeHomePagePO(driver);
		homePO.checkWebElement(homePO.logoutBtn());
		homePO.logout();
	}

}
