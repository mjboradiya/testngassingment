package assignmentframework;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;

public class AppiumScroll extends BaseTest {
	 @Test
	   public void ScrollDemoTest() throws MalformedURLException, InterruptedException
	   {
		  driver.findElement(AppiumBy.accessibilityId("Views")).click();
				
				// where to scroll is known prior
		  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
				
				// No prior idea
		   scrollToEndAction();		
		}	
}
