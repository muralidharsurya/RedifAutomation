
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StatusOfwebElment  {
    public static void main(String[] args) throws Exception
    {


        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\RedifAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.nopcommerce.com/register");
      driver.findElement(By.xpath("//input[@id='gender-male']")).click();
    //  driver.findElement(By.xpath("//input[@id='gender-female']")).click();
      driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Muralidhar");
      Thread.sleep(2000        );
      driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Surya");

      driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath(" // select[@name='DateOfBirthDay']")).sendKeys("9");
      driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
      driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1997");

       driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("srirackvi@gmail.com");
       driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("bajaj electrical");
       driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("surya123");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("surya123");
       driver.findElement(By.xpath("//button[@id='register-button']")).click();
       //output
        String registerSuccess = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(registerSuccess);
        Assert.assertEquals("Your registration completed",registerSuccess);





     /* //isDiplayed()  , isEnabled()
        WebElement searchStore= driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        System.out.println("dispaly status:"+searchStore.isDisplayed()); // true
        System.out.println("Dispaly status:"+searchStore.isEnabled());// true


         //isSelected()
        WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));

       System.out.println(male.isSelected());
        System.out.println(female.isSelected());

        male.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());*/






    }
}
