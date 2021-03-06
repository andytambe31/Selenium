package scripts;
import java.io.File;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
public class GoogleJunit {
	
	public static WebDriver driver;
	
	@Before
	public void Beforetest1(){
	File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	FirefoxProfile firefoxProfile = new FirefoxProfile();       
	driver = new FirefoxDriver(ffBinary,firefoxProfile);
	driver.get("https://www.wikipedia.org");
	}
	
	@Test
	public void test1(){
	driver.findElement(By.id("js-link-box-en")).click();
	driver.findElement(By.id("searchInput")).sendKeys("Selenium Software");
	driver.findElement(By.id("searchButton")).click();
	driver.findElement(By.linkText("Selenium (software)")).click();
	String a = driver.findElement(By.id("firstHeading")).getText();
	System.out.println(a);
	System.out.println(driver.getTitle());
	}
	
	@After
	public void Aftertest1(){
	driver.close();
	}
	
}
