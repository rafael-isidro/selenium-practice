package org.selenium.ginandjuice.page;

import org.openqa.selenium.By;
import org.selenium.ginandjuice.factory.selenium.Interactions;

public class HomePage extends Interactions {

    private static final By accountButton = By.cssSelector(".navigation-header-links.secondary-links > li:nth-child(1) > a");

    public void clickAccount() {
        click(accountButton);
    }
}
