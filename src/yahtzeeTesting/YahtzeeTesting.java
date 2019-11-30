package yahtzeeTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YahtzeeTesting {
	@Test
	private void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bitcoinoptimist.herokuapp.com/");

		driver.close();

	}
}
