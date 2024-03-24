package testngpackage;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnatotionClass1 {
	
	WebDriver driver=new ChromeDriver();
	
	@BeforeSuite
	 public void setUp()
    {
    System.setProperty("webdriver.chrome.driver", "path to chrome driver");
    driver=new ChromeDriver();
    }
	
	@BeforeClass
	public void appSetup()
    {
        driver.get("www.google.com");
    }
	
	@BeforeMethod
	public void checkLogin()
    {
          driver.get("https://accounts.lambdatest.com/login");
          driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sadhvisingh24@gmail.com");
          driver.findElement(By.xpath("//input[@name='password']")).sendKeys("XXXXX");
          driver.findElement(By.xpath("//*[@id='app']/section/form/div/div/button")).click();
        
    }
	
	@BeforeTest
	public void profileSetup()
    {
        driver.manage().window().maximize();
    }
	
	@Test(description = "test")
	public void testCurrentUrl() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[4]/a")).click();
        String currentUrl= driver.getCurrentUrl();
        assertEquals(currentUrl, "https://automation.lambdatest.com/timeline/?viewType=build&page=1", "url did not matched");
    }
	
	@AfterTest
	 public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }
	
	@AfterMethod
	public void screenShot() throws IOException
    {
        TakesScreenshot scr= ((TakesScreenshot)driver);
        File file1= scr.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file1, new File("C:\\Users\\navyug\\workspace\\QAPractise\\test-output\\test1.PNG"));
       
    }
	
	@AfterClass
	public void closeUp()
    {
        driver.close();
    }
	
	@AfterSuite
	public void cleanUp()
    {
        System.out.println("All close up activities completed");
        driver.quit();
    }
	
	
	
	
	
}
