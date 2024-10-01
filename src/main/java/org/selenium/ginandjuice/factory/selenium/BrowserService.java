package org.selenium.ginandjuice.factory.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserService {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initChromeDriver(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void quit() {
        driver.quit();
    }
}
