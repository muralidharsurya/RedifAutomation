import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import static java.lang.Thread.sleep;

public class RedifAutomation {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\RedifAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.rediff.com/");
		//System.out.println(driver);
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@name='name8878d8f2']")).sendKeys("surya");
		driver.findElement(By.xpath("// input[@name='named3fbadec']")).sendKeys("SURYA");

		
		

	}

}
