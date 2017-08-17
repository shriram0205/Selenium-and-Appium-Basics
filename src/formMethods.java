import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		System.out.println("clicking on multicity option");
		//isDisplayed is used to check if the element is visible in the web page or not
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[3]/label")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		//size() is used to check if a particular element is present in the code base or not
	   int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
	   if(count==0){
		   System.out.println("verfied");
	   }
	}
	//there is one more method got gettext to text of a web element
	//there is a method called 
	//to check if a web element is visible or not, we can use isDisplayed method
	
	
}
