package web.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import web.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static web.tests.Steps.*;

public class MiroTest extends TestBase {
    Steps steps = new Steps();

    @Test
    @DisplayName("miro-e2e-tests")
    void choosingLanguage() {
        step("Open 'https://miro.com'", () -> {
            open("https://miro.com");
        });

        step("Choose English", () -> {
            steps.clickSwitcherLanguageButton()
                    .choiceLanguage("en");
        });
        step("English is selected on the page", () -> {
            steps.comparisoNameLoginButton()
                    .comparisoNameSignUpButton();
        });

    }

    @ValueSource(strings = {"QA", "Java"})
    @DisplayName("Career search results are not empty")
    @ParameterizedTest(name = "The search results contain data about QA, Java")
    void searchSpecializations(String testData) {
        steps.openCareerUrl()
                .searchInput(testData)
                .searchResultIsNotEmpty();

    }

    @CsvFileSource(resources = "/testData.csv")
    @ParameterizedTest(name = "texts changes depending on the selected box")
    void correctContentAboutUs(String testData, String expectedResult) {
        steps.openAboutUrl()
                .clickOnCountry(testData)
                .selectedCountryEqualResult(expectedResult);

    }

    @Test
    void checkAmountOfUsers() {
        step("When changing the language, the logo is visible", () -> {
            choosingLanguage();
            checkingPresenceOfTheLogo();
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'The Visual Collaboration Platform for Every Team | Miro'", () -> {
            choosingLanguage();
            String expectedTitle = "The Visual Collaboration Platform for Every Team | Miro";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://miro.com'", () ->
                open("https://miro.com"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
