import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		s.selectByIndex(6);
		s.selectByVisibleText("6");
		s.selectByValue("6");
		//dynamic dropdown
		driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//wrap up the xpath so that the second value is selected
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//checkbox 
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).isSelected());
		
	}

}
