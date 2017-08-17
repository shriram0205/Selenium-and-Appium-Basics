import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver = Capabilitites();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			//xpath syntax:
			//tagName[@attribute='value'] classname is the tag name
			//xpath is an address to identify an address in web or mobile
			driver.findElementByXPath("//android.widget.Textview[@text='Preference']").click();
			driver.findElementByXPath("//android.widget.Textview[@text='3.Preference dependencies']").click();
			driver.findElementById("android:id/checkbox").click();
			driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
			driver.findElementByClassName("android.widget.EditText").sendKeys("shriram");
			driver.findElementsByClassName("android.widget.Button").get(1).click();
	}

}
