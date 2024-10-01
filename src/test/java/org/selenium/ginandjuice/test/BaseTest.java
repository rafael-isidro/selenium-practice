package org.selenium.ginandjuice.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.selenium.ginandjuice.factory.selenium.BrowserService;

public class BaseTest extends BrowserService {

    @BeforeEach
    public void abrirNavegador(){
        initChromeDriver("https://ginandjuice.shop/");
    }

    @AfterEach
    public void fecharNavegador(){
        quit();
    }
}