import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello moto");
		driver.findElement(By.name("pw")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.quit();
}
}
