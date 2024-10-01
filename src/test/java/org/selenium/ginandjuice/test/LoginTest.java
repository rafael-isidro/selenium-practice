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
        LoginDto user = LoginData.validoLogin();

        String message = loginPage.loginSucesso(user);
        validation.validateText("MY ACCOUNT", message);
    }

    @Test
    public void testTentarRealizarLoginComUsernameInvalido() {
        LoginDto user = LoginData.invalidoUsernameLogin();

        String message = loginPage.loginUsernameInvalido(user);
        validation.validateText("Invalid username or password.", message);
    }

    @Test
    public void testTentarRealizarLoginComSenhaInvalida() {
        LoginDto user = LoginData.invalidoSenhaLogin();

        String message = loginPage.loginUsernameInvalido(user);
        validation.validateText("Invalid username or password.", message);
    }
}
