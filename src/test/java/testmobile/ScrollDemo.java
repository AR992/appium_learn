package testmobile;

import java.net.MalformedURLException;

import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
	
	@Test
	public void ScrollDemoTest() throws MalformedURLException, InterruptedException {
		
		//Actual automation
				driver.findElement(AppiumBy.accessibilityId("Views")).click();
				//scroll
				// first option
				// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
				// second option
				scrollToEndAction();		
	}

}
