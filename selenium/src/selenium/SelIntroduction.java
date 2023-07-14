package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver 
		//WebDriver close get
		
		//chromedriver.exe-> Chorme browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/anude/OneDrive/Desktop/chromedriver_win32/chromedriver.exe");
		
		//webdriver.chrome.driver->value of the path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/playlist?list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU");
		System.out.println(driver.getTitle());
		
	}
}
