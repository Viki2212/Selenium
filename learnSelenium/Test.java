package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("email").sendKeys("vskviicky@hotmail.com");
		driver.findElementById("pass").sendKeys("Viki1466*");
		driver.findElementByName("login").click();
		
						
	}
}
