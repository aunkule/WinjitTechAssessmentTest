package com.globalsqa.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.globalsqa.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	static ChromeOptions options;
	public static WebDriverWait wait;
	public static JavascriptExecutor js ;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("E:/Aditya Eclipse Workspace/WinjitTechAssessmentTest"
					+ "/src/main/java/com/globalsqa/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
			options= new ChromeOptions();
			options.addArguments("--disable-notofications");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("firefox")) {
			// System.setProperty("webdriver.gecko.driver", "<path for GeckoDriver>");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestUtil.implicit_load_timeout));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtil.page_load_timeout));
		wait= new WebDriverWait(driver, Duration.ofSeconds(TestUtil.webdriver_wait_load_timeout));
		js= (JavascriptExecutor) driver;
		driver.get(prop.getProperty("url"));

	}

}
