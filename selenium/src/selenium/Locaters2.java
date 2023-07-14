package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locaters2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anude/OneDrive/Desktop/chromedriver_win32/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       String passwordArray2 = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("anudeep");
        driver.findElement(By.name("inputPassword")).sendKeys(passwordArray2);
        driver.findElement(By.className("signInBtn")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       System.out.println( driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in." );
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    driver.close();
}
	public static String getPassword( WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
       String[] passwordArray = passwordtext.split("");
        String passwordArray2 = passwordArray[1].split("")[0];
//        return password;
		return passwordArray2;
	}
	
}
