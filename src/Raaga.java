import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Raaga extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilitites();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Done']").click();
		driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
		driver.findElementByXPath("//android.widget.Textview[@text='World Music']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"\"))");
		driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		driver.findElementByXPath("//android.widget.Textview[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.Textview[@text='Push Notification']").click();
		Point point=driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
		TouchAction t = new TouchAction(driver);
		//toggle on
		t.tap(point.x+20,point.y+30).perform();
		//toggle off
		t.tap(point.x+100,point.y+30).perform();
	}

}
