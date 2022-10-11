package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @DisplayName("miro-e2e-tests")
    void generatedTest() {
        step("Open 'https://miro.com'", () -> {
            open("https://miro.com");
        });

        step("Click button login", () -> {
            $("[data-place='Header'] [href=\"/login/\"]");
        });

//        step("Checking logo miro is visible", () -> {
//            step("// todo: just add selenium action");
//        });
//
//        step("Click the product button", () -> {
//            step("// todo: just add selenium action");
//        });
//
//        step("Click on the product overview block", () -> {
//            step("// todo: just add selenium action");
//        });
//
//        step("Check for text 40M", () -> {
//            step("// todo: just add selenium action");
//        });
//    }
//
//    @Test
//    @DisplayName("Page title should have header text")
//    void titleTest() {
//        step("Open url 'https://miro.com'", () ->
//            open("https://miro.com"));
//
//        step("Page title should have text 'The Visual Collaboration Platform for Every Team | Miro'", () -> {
//            String expectedTitle = "The Visual Collaboration Platform for Every Team | Miro";
//            String actualTitle = title();
//
//            assertThat(actualTitle).isEqualTo(expectedTitle);
//        });
//    }
//
//    @Test
//    @DisplayName("Page console log should not have errors")
//    void consoleShouldNotHaveErrorsTest() {
//        step("Open url 'https://miro.com'", () ->
//            open("https://miro.com"));
//
//        step("Console logs should not contain text 'SEVERE'", () -> {
//            String consoleLogs = DriverUtils.getConsoleLogs();
//            String errorText = "SEVERE";
//
//            assertThat(consoleLogs).doesNotContain(errorText);
//        });
//    }
}