package org.selenium.ginandjuice.factory.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Elements extends BrowserService {
    public static WebElement element(By by){
        return driver.findElement(by);
    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static List<WebElement> elements(By by){
        return driver.findElements(by);
    }

    public static void switchFrame() {
        driver.switchTo().defaultContent();
    }

    public static void pressOkAlertFrame() {
        driver.switchTo().alert().accept();
    }
}
