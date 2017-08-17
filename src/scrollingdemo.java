import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingdemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilitites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Views']").click();
		//To scroll we need to go with Android API only, Appium doesnt support scrolling
		//if u want to implement features like clickable, scrollable, we use findElementByAndroidUIAutomator
		//and put the android code to scroll inside "" using UiSelector class. The scrollIntoView is a method of UiScrollable class
		//we execute android related code inside findElementByAndroidUIAutomator
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"webView\"))");
	}

}
