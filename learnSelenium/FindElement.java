package learnSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		 int x = driver.findElementById("position").getLocation().getX();
		 int y = driver.findElementById("position").getLocation().getY();
		 System.out.println(x + "  "+ y);
		 
		 WebElement ele = driver.findElementById("position");
		 Point point = ele.getLocation();
		 int x1 = point.getX();
		 int y1 = point.getY();
		 System.out.println(x1 + "  "+ y1);
		 
		 int high = driver.findElementById("property").getRect().getDimension().getHeight();
		 int widt = driver.findElementById("property").getRect().getDimension().getWidth();
		 System.out.println(high + " " + widt);
		 
		 WebElement get = driver.findElementById("property");
		 Rectangle rect = get.getRect();
		 Dimension dime = rect.getDimension();
		 int height = dime.getHeight();
		 int Width = dime.getWidth();
		 System.out.println(height + "  "+ Width);
		 
		 boolean dis = driver.findElementById("isDisabled").isEnabled();
		 System.out.println(dis);
		 
		 
		 driver.quit();
	}
}
