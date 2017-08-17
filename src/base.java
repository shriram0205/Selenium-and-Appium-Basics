import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilitites() throws MalformedURLException  {
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		//File fs = new File(f,"Raaga.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoAppium");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		//using the package and the main activity name of the app we can invoke wihtout have the .apk file
		//testing can be performed in appium using this method as well.
		//download a file called apkinfo from playstore
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "MobilePlatform.ANDROID");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		//cap.setCapability(MobileCapabilityType.APP_PACKAGE, "sfwfweg");
		//cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "wegwg");
		
		//to perform it on real device. nagivate to platform tools
		// adb devices
		// adb kill-server; adb start-server
		///cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "MobilePlatform.ANDROID");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); no need of fs and fs absolute path
		// the chrome browser needs to be installed in the emulator. this can be done by downloading the chrome apk file and go the platform tools
		// adb start -server; adb install -path of the apk file-
		//techpatterns.com/forms/about304.html
		//download xml user agent list2.x
		//then change the corresponding web view to mobile view using the installed user agent stylehseet
	}

}
