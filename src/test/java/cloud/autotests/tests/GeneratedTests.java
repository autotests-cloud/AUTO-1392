package cloud.autotests.tests;

import cloud.autotests.helpers.DriverSettings;
import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    MiroSteps miroSteps = new MiroSteps();


    @Test
    @DisplayName("miro-e2e-tests")
    void choosingLanguage() {
        step("Open 'https://miro.com'", () -> {
            open("/");
        });

        step("Choose English", () -> {
            $("header [data-testid='SwitcherButton']").click();
            $("div ul a[data-locale='en']").click();
        });
        step("English is selected on the page", () -> {
            $("header [href='/login/']").shouldHave(text("Login"));
            $("header [href='/signup/']").shouldHave(text("Sign up free"));
        });

    }

    @ValueSource(strings = {"QA", "Java"})
    @DisplayName("Career search results are not empty")
    @ParameterizedTest(name = "The search results contain data about QA, Java")
    void searchSpecializations(String testData) {
        miroSteps.openCareerUrl()
                .searchInput(testData)
                .searchResultIsNotEmpty();

    }

    @CsvFileSource(resources = "/testData.csv")
    @ParameterizedTest(name = "texts changes depending on the selected box")
    void correctContentAboutUs(String testData, String expectedResult) {
        miroSteps.openAboutUrl()
                .clickOnCountry(testData)
                .selectedCountryEqualResult(expectedResult);

    }

    @Test
    void chekAmountOfUsers() {
        step("Check for text 35M", () -> {
            String s = "Trusted by 35M+ users";
            choosingLanguage();
            $(".com-sec-slider-3 .com-el-content").shouldHave(text(s));
        });
    }

//    @Test
//    @DisplayName("Page title should have header text")
//    void titleTest() {
//        step("Open url 'https://miro.com'", () ->{
//
//                open("https://miro.com")});
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
}

//
//    @Test
//    @DisplayName("Page console log should not have errors")
//    void consoleShouldNotHaveErrorsTest() {
//        step("Open url 'https://miro.com'", () ->
//                open("https://miro.com"));
//
//        step("Console logs should not contain text 'SEVERE'", () -> {
//            String consoleLogs = DriverUtils.getConsoleLogs();
//            String errorText = "SEVERE";
//
//            assertThat(consoleLogs).doesNotContain(errorText);
//        });
//    }

