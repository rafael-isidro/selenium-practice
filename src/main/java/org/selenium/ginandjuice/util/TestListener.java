package org.selenium.ginandjuice.util;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

import static org.selenium.ginandjuice.factory.selenium.BrowserService.driver;

public class TestListener implements TestWatcher, BeforeEachCallback {

    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        Allure.step("Iniciando teste", (step) -> {
            step.name(extensionContext.getDisplayName());
        });

    }

    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.step("Teste falhou", (step) -> {
            step.name(cause.getMessage());
            Allure.addAttachment("Screenshot", "image/png", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)), "png");
        });

        driver.quit();
    }

    public void testSuccessful(ExtensionContext context) {
        Allure.step("Teste passou", (step) -> {
            step.name("Teste executou com sucesso");
        });
        driver.quit();
    }
}