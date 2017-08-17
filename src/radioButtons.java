import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		int count= driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<count;i++){
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		
		if(text.equals("cheese")){
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
			
		}
}
}
