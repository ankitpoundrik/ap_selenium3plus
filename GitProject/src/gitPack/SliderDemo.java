package gitPack;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;


 

public class SliderDemo {
    WebDriver driver;
    @BeforeTest
    public void start() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\myOffDocs\\Acc-Lockdown\\Selenium 3 Plus\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(10000);
    }
    @Test
    public void testMouse() throws InterruptedException
    {
        driver.get("http://jqueryui.com/resources/demos/slider/default.html");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slider']/span")));
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.dragAndDropBy(slider, 200, 0).perform();

    }

}
