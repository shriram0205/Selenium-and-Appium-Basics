import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class BaseTest {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException{
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		//File fs = new File(f,"Raaga.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equals("emulator")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoAppium");
		}
		else{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoAppium");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
