package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img.png");
		FileHandler.copy(src, dest);
		
		WebElement ele = driver.findElementByXPath("//img[contains(@src,'buymeacoffee')]");
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Snaps/img1.png");
		FileHandler.copy(src1, dest1);		
		
		driver.quit();
		
	}

}
