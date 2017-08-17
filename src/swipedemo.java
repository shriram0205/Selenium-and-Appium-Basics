import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipedemo extends BaseTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("Demo Appium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Views']").click();
		driver.findElementByXPath("//android.widget.Textview[@text='Date widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		//xpath doesnt recognize special characters. * here specifies take any tagname with the specified attribute and value within[]
		//we cannot go with xpath when we have special characters
		driver.findElementByXPath("//*[content-desc='9']").click();
		TouchAction t = new TouchAction(driver);
		//swiping using touch action
		t.press(driver.findElementByXPath("//*[content-desc='15']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[content-desc='45']")).release().perform();
	}

}
