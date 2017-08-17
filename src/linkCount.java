import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.ebay.com");
		//count the link in the entire page
        System.out.println(driver.findElements(By.tagName("a")).size());
		//counts of links in the footer section. Now the footer variable acts as a driver object to the page.
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//finding the number of links in a section
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		String beforeClicking=null;
		String afterClicking;
		
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++){
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map")){
				beforeClicking=driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		afterClicking=driver.getTitle();
		if(beforeClicking!=afterClicking){
			//if(driver.getPageSource().contains("View our sitemap")){
				
			//}
			Boolean abc = driver.findElement(By.xpath("")).isDisplayed();
			if(abc==true){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
		}
	}


