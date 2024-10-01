package org.selenium.ginandjuice.factory.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Waits extends BrowserService {

    public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitElementVisibility(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitElementClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitElementInvisibility(By by){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

}
