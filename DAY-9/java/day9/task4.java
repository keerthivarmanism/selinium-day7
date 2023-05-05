package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  Thread.sleep(4000);
		  WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		  user.sendKeys("Admin");
		  WebElement pass=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		  pass.sendKeys("admin123");
		  WebElement sub=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  sub.click();
	  }
	  @Parameters({"browser"})
	  @BeforeMethod
	  public void beforeMethod(String browser1) {
		  if(browser1.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origin=*");
		  driver=new ChromeDriver(co);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  }
	  }
}
