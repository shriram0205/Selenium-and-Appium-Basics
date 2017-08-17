import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatortest extends AppiumTest1 {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver = Capabilities("Demo Appium");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			//validate clickable features for all options
			//driver.findElementByAndroidUIAutomator("new UiSelector.property(value)")
			driver.findElementByAndroidUIAutomator("new UiSelector.clickable(true)").getSize();

}
}