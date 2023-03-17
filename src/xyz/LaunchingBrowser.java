package xyz;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchingBrowser {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Kareclouds\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.google.com");
		//WebDriverWait wait = new WebDriverWait(driver, 4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='dropdown-toggle todoicon']"))).click();
		
		//screenshot for page
		File done = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(done, new File("./Drivers/login.png"));
		
		//screenshot for element
		File nine =  driver.findElement(By.xpath("//a[@class='dropdown-toggle todoicon']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(nine, new File("./drivers/login.png"));
	
		
		

	}

}
