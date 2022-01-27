package xbox.basepages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxHomePage extends Page {
	
	public static String TITLE = "Xbox Gamertag";
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	public WebElement home;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	public WebElement leaderboards;
	
	public XboxHomePage clickLeaderboardsLink() throws Exception {
		
		if(TestCaseBase.browserFlag.equals("ie")) {
			leaderboards.sendKeys("\n");
		} else {
			leaderboards.click();
		}
		
		return new XboxHomePage();
	}
	
	
	
}