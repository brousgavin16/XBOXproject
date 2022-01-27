package xbox.testcases;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;
import xbox.basepages.XboxHomePage;
import xbox.basepages.XboxLeaderboardPage;

public class GameListTest extends TestCaseBase {
	
	@Test(groups = {"ChromeWin32"})
	public void testGamerscores() throws Exception {
		XboxLeaderboardPage XboxLeaderboard = new XboxLeaderboardPage();
		XboxLeaderboard.open();
		XboxLeaderboard.waitPageLoad();
		
		Assert.assertTrue(XboxLeaderboard.titleIs(XboxHomePage.TITLE));
	}
}