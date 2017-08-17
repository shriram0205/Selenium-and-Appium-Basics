import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it = ids.iterator();
		String parentid=it.next();
		System.out.println(driver.getTitle());
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

}
