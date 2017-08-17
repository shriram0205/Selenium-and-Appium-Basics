import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		Actions a = new Actions(driver);
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//we are holding the key down
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		//we can perform composite actions using build and perform

	}

}
