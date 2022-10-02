package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alert1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		driver.findElementByXPath("//button[starts-with(@id,'prompt')]").click();
		Alert promt = driver.switchTo().alert();
		promt.sendKeys("Vignesh Sekar");
		promt.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver1.switchTo().frame("iframeResult");
		driver1.findElementByXPath("//button[.='Try it']").click();
		Alert ale = driver1.switchTo().alert();
		ale.sendKeys("Vignesh Sekar");
		ale.accept();
		String txt = driver1.findElementById("demo").getText();
		System.out.println(txt);
		
		File src = driver1.findElementByXPath("//body[@contenteditable='false']").getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img2.png");
		FileHandler.copy(src, dest);
		

	}

}
