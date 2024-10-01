package org.selenium.ginandjuice.test;

import org.junit.jupiter.api.Test;
import org.selenium.ginandjuice.dto.LoginDto;
import org.selenium.ginandjuice.factory.data.LoginData;
import org.selenium.ginandjuice.factory.selenium.Validation;
import org.selenium.ginandjuice.page.LoginPage;

public class LoginTest extends BaseTest {

    private static final LoginPage loginPage = new LoginPage();
    private static final Validation validation = new Validation();

    @Test
    public void testValidarLoginDadosValidos() {
        LoginDto user = LoginData.validLogin();

        String message = loginPage.loginAccount(user);
        validation.validateText("MY ACCOUNT", message);
    }
}
