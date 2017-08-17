

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver =new ChromeDriver();
		
		//driver.get("http://www.qaclickacademy.com");
		//driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
		driver.get("http://www.google.com/gmail");
		
		//driver.findElement(By.id("email")).sendKeys("shriram0205@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Surimala1!");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		//driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("shriram0205@gmail.com");
        driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        Thread.sleep(3000L);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sfwf");
        driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();
        //driver.close();
	}

}
