import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {

//selenium code-
		
		//create Driver object for chrome Browser
		//we will strictly implemented methods of webdriver.
		
//		System.setProperty("webdriver.gecko.driver","D:\\library\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		
		driver.get("https://google.com"); //hit url on the browser
		System.out.println(driver.getTitle()); //validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
//		System.out.println(driver.getPageSource()); //print page source

		driver.navigate().to("https://fb.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close(); //It closes current window
	driver.quit(); //It closes driver
	}

}
