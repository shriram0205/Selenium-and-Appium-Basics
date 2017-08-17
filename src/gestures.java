import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends BaseTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities("Demo Appium");
		driver.findElementByXPath("//android.widget.Textview[@text='Views']").click();
		//tap concept
		//this is a class for mobile gestures
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.Textview[@text='Expandable Lists']")).perform();
		driver.findElementByXPath("//android.widget.Textview[@text='1. Custom Adapter']").click();
      t.press(driver.findElementByXPath("//android.widget.Textview[@text='People Names']")).waitAction(3000).release().perform();
       driver.findElementById("android:id/alertTitle").getText();
	}
//core mobile gestures tap, press and release, drag and drop, scroll, swipe
	
}
