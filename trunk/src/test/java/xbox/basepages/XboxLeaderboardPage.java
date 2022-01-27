package xbox.basepages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import google.basepages.GoogleHomePage;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;


public class XboxLeaderboardPage extends Page {
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	public WebElement home;
	
	@FindBy(linkText = "English")
	public WebElement english;
	
	
	
	public XboxLeaderboardPage open() throws Exception {
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("xboxLeaderboard.url");
		TestCaseBase.threadDriver.get().navigate().to(URL);
		if ( FunctionUtil.isExist(english) ) {
			if (TestCaseBase.browserFlag.equals("ie")) {
				english.sendKeys("\n");
				english.click();
			}
			else{
			english.click();
			}
		}
		//return this means browser stays on GoogleHomePage
		return this;
	}
	
	public XboxLeaderboardPage waitPageLoad() throws InterruptedException {
		Thread.sleep(1500);
		Waiting.until(home);
		//Waiting.until(loginLink);
		return this;
	}
	
}