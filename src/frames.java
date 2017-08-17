import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.fantasycricket.dream11.com/IN/");
		//handling auto suggestions using selenium explicit waits
		WebDriverWait wd = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("aa");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m frmRegister']/div[1]/ul")));
		
		int number=findFrameNumber(driver,By.xpath(".//*[@id='recaptcha-anchor]/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor]/div[5]")).click();
		driver.switchTo().defaultContent();
		int number1=findFrameNumber(driver,By.xpath(".//*[@id='recaptcha-verify-button]"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button]")).click();
		}
		catch(Exception e){
			//code to take screenshot whenever script fails
		}
	}
	public static int findFrameNumber(WebDriver driver, By by){
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for( i=0;i<framecount;i++){
		driver.switchTo().frame(i);
		int count =driver.findElements(by).size();
		if(count>0){
			break;
		}
		else{
			System.out.println("cont looping");
		}
	}
		driver.switchTo().defaultContent();
		return i;
	}
	
}
