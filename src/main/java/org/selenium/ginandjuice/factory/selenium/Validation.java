package org.selenium.ginandjuice.factory.selenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class Validation {

    public void validateText(String expected, String Actual){
        Assertions.assertEquals(expected,Actual);
    }

    public void validateStringInText(String expectd, String toVerify){
        Assertions.assertTrue(toVerify.contains(expectd));
    }

    public void validateNotNull(String test){
        Assertions.assertNotNull(test);
    }

    public static void validatePage(WebElement element) {
        Assertions.assertTrue(element.isDisplayed());
    }

    public static void validateFalse(boolean element) {
        Assertions.assertFalse(element);
    }

    public static void validateMissing(WebElement element) {
        Assertions.assertFalse(element.isDisplayed());
    }

    public static void validatePresence(WebElement element) {
        Assertions.assertNotNull(element);
    }
}
