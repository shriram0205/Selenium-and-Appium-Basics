import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscellaneous extends BaseTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("Android Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println(driver.currentActivity());
		//this gives whether we are in hybrid, native or web-view
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		//driver.hideKeyboard();
		//how to come back to previous page by clicking on back button
		//driver.pressKeyCode(AndroidKeyCode.BACK);

	}

}
