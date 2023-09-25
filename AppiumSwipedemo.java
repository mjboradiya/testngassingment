package assignmentframework;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;

public class AppiumSwipedemo extends BaseTest {
 
	@Test
	  public void SwipeDemoTest() throws MalformedURLException, InterruptedException
		{
		  driver.findElement(AppiumBy.accessibilityId("Views")).click();
		  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		  WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		  Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		  swipeAction(firstImage,"left");	
		  Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");	
		}	
}
