package com.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
  @Test(groups= {"a"})
  public void test() {
	  	WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origin=*");
	  	WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String pagetitle=driver.getTitle();
		String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		Assert.assertEquals(pagetitle, expectedtitle);
		String pageurl=driver.getCurrentUrl();
		String expectedurl="https://www.godaddy.com/en-in";
		Assert.assertEquals(pageurl, expectedurl);

  }
  @Test(groups= {"b"})
  public void test2() throws InterruptedException {
	  	WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origin=*");
	  	WebDriver driver=new ChromeDriver(co);
	  	driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		WebElement dom=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
		dom.click();
		Thread.sleep(1000);
		WebElement dns=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
		dns.click();	
  }
  
  @Test(groups= {"c"})
  public void test3() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--remote-allow-origin=*");
	  	WebDriver driver=new ChromeDriver(co);
	  	driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		WebElement dom=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
		dom.click();
		Thread.sleep(1000);
		WebElement dns=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
		dns.click();
		String title=driver.getTitle();
		System.out.print(title);
		String exptitle="GoDaddy Domain Search - Buy and Register Available Domain Names";
		Assert.assertEquals(title, exptitle);
		
		
		
  }
  
}
