import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("shriram");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("shriram");
		//#id will also work for cssSelectors
		//.classname also works
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
