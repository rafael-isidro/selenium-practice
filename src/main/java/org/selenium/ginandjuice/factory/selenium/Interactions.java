package org.selenium.ginandjuice.factory.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static io.qameta.allure.Allure.step;

public class Interactions extends Elements {

    protected static void click(By by) {
        Waits.waitElement(by);
        element(by).click();
    }

    protected static void sendKeys(By by, String text) {
        Waits.waitElement(by);
        step("Preenchendo o campo " + element(by).getText() + " com o texto " + text, () -> { element(by).sendKeys(text);});
    }

    protected static String readText(By by) {
        Waits.waitElement(by);
        return element(by).getText();
    }

    protected static void sendTab(By by) {
        Waits.waitElement(by);
        element(by).sendKeys("\t");
    }

    protected static List<WebElement> selectByElements(By by) {
        return  driver.findElements(by);
    }

    protected static void refreshPage(){
        driver.navigate().refresh();
    }

    protected static void clear(By by) {
        Waits.waitElement(by);
        element(by).clear();
    }

    protected static void readTitle(){
        getTitle();
    }
}
