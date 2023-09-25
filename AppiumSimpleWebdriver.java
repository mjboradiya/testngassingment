package assignmentframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppiumSimpleWebdriver {
public static void main(String[] args) {

	System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.facebook.com/ ");
	
	driver.manage().window().maximize();
}
}
