import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobilemode {
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		File f = new File("src");
		//File fs = new File(f,"ApiDemos-debug.apk");
		//File fs = new File(f,"Raaga.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "MobilePlatform.ANDROID");
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "660");
		
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("http://m.crizbuzz.com/");
		Thread.sleep(9000L);
		driver.findElementByCssSelector("using-fire-bug-from-the-browser").getText();
		//then adb devices to see the connected mobile to the system
		//this is how u rin android browser scripts on appium
		//another test case using Udemy
		System.out.println("navigating to Udemy");
		driver.get("https://udemy.com");
		//once we switch to the mobile web, we start using selenium
		driver.findElement(By.xpath("//*[@id='android-splash]/a")).click();
		//tagname[@attribute='value'];
		driver.findElement(By.xpath("//input[@type='search]")).sendKeys("SOAP UI");
		driver.findElement(By.xpath("//input[@type='search]")).sendKeys(Keys.ENTER);
		driver.getTitle();
		System.out.println(driver.findElement(By.xpath("//*[@id='courses']/li[1]/a/span[2]")).getText());
	}

}
