import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class form {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.findElement(By.name("firstname")).sendKeys("Shalin");
		driver.findElement(By.name("lastname")).sendKeys("Shah");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='Male']")).click();
		driver.findElement(By.xpath("//input[@name='exp' and @value='5']")).click();
		
		driver.findElement(By.xpath("//strong[contains(text(),'Date')]//..//following-sibling::td//child::input")).sendKeys("2022-05-24");
		
		driver.findElement(By.xpath("//input[@name='profession' and @value='Manual Tester']")).click();
		driver.findElement(By.xpath("//input[@name='profession' and @value='Automation Tester']")).click();
		
		driver.findElement(By.xpath("//input[@name='tool' and @value='RC']")).click();
		driver.findElement(By.xpath("//input[@name='tool' and @value='Selenium IDE']")).click();
		driver.findElement(By.xpath("//input[@name='tool' and @value='Selenium Webdriver']")).click();
		
		WebElement continent = driver.findElement(By.xpath("//select[@name='continents']"));
		Select select = new Select(continent);
		select.selectByVisibleText("North America");
		
		driver.findElement(By.xpath("//option[contains(text(),'Browser Commands')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Navigation Commands')]")).click();
		
		driver.findElement(By.name("submit")).click();
		
		driver.quit();

	}

}
