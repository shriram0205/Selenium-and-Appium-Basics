import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridApps {

	public static void main(String[] args) throws MalformedURLException {
	
		File f = new File("src");
		File fs = new File(f,"testApp.apk");
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "MobilePlatform.ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		By.
		
		//next go to UIAutomator viewer
		//we have testing on the real device
		driver.getContext();
		driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("http://www.google.com");
		driver.findElement(By.id("com.example.testapp:id/goButton")).click();
		// this will tell how many views are present for the app
		Set<String> s=driver.getContextHandles();
		for(String handle:s){
			System.out.println(handle);
		}
		driver.context("WEBVIEW_com.example.testapp");
		//set webcontentdebuggingenabled in webview class if its not enabled. should be done by developer
		driver.findElement(By.name("q")).sendKeys("Handling Hybrid App");
		//here we are switching from the native to web view
		
		
	}

}
