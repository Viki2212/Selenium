package learnSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		driver.findElementById("fullName").sendKeys("Vignesh Sekar");
		
		driver.findElementById("join").sendKeys(" Person", Keys.TAB);
		
		String gt = driver.findElementById("getMe").getAttribute("value");
		System.out.println(gt);
		
		driver.findElementById("clearMe").clear();
		
		boolean isEdit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isEdit);
		
		String rd = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(rd);
		
		//driver.quit();

	}

}
