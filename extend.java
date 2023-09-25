package assignmentframework;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;

public class extend base class AppiumFirst<driver, PropertiesReader, ITestContext> {
	

    @Test(groups = {TestGroups.ANDROID})
    public void testLogText() {
        String logText = new APIDemosHomePage(this.driver)
                .openText()
                .tapOnLogTextBox()
                .tapOnAddButton()
                .getLogText();

        Assert.assertEquals(logText, "This is a test");
    }

    protected AppiumDriver driver;
    protected PropertiesReader reader = new PropertiesReader();

    @BeforeMethod(alwaysRun = true)
    public void setup(ITestContext context) {
        context.setAttribute("target", ((Object) reader).getTarget());

        try {
            Target target = (Target) context.getAttribute("target");
            this.driver = new DriverManager().getInstance(target);
        } catch (IOException | PlatformNotSupportException e) {
            ((Throwable) e).printStackTrace();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }

}
