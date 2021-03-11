package basePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	
public static WebDriver browser() {
	

	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://techfios.com/test/101/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}

public  void tearDown() throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
}
}