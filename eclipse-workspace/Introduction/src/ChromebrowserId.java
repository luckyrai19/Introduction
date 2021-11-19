import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserId {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://login.salesforce.com/");
//				driver.findElement(By.id("email")).sendKeys("Hello moto");
//				driver.findElement(By.name("pass")).sendKeys("1234567890");
//				driver.findElement(By.linkText("English (UK)")).click();
				
//				driver.findElement(By.cssSelector("#username")).sendKeys("hello");
				//or
				driver.findElement(By.cssSelector("input#username")).sendKeys("hello");
				driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1111111");
				driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
				System.out.println(driver.findElement(By.cssSelector("#error")).getText());
//				driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
			
				
				
}
	
	
}