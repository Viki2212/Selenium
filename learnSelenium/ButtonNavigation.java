package learnSelenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		driver.findElementById("home").click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://letcode.in/");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		nav.forward();
		nav.to("https://letcode.in/");
		nav.refresh();
		

	}

}
