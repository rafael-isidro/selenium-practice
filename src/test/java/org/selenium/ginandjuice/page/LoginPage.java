package org.selenium.ginandjuice.page;

import org.openqa.selenium.By;
import org.selenium.ginandjuice.dto.LoginDto;
import org.selenium.ginandjuice.factory.selenium.Interactions;

public class LoginPage extends Interactions {

    private static final By usernameField = By.cssSelector("input[name=\"username\"]");
    private static final By passwordField = By.cssSelector("input[name=\"password\"]");
    private static final By btnLogin = By.cssSelector("body > div:nth-child(2) > section > div > section > form > button");
    private static final By titleMyAccount = By.cssSelector("body > div:nth-child(2) > section > div > h1");
    private static final By invalidUsernamePasswordMsg = By.cssSelector("body > div:nth-child(2) > section > div > section > form > p");

    private static final HomePage homePage = new HomePage();

    public String loginSucesso(LoginDto user) {
        homePage.clickAccount();
        sendKeys(usernameField, user.getUsername());
        click(btnLogin);
        sendKeys(passwordField, user.getPassword());
        click(btnLogin);

        return readText(titleMyAccount);
    }

    public String loginUsernameInvalido(LoginDto user) {
        homePage.clickAccount();
        sendKeys(usernameField, user.getUsername());
        click(btnLogin);
        sendKeys(passwordField, user.getPassword());
        click(btnLogin);

        return readText(invalidUsernamePasswordMsg);
    }
}
