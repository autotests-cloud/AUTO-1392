package web.helpers;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

    public static void configure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        String browserName = System.getProperty("browser_name", "chrome");
        String browserVersion = System.getProperty("browser_version", "100.0");
        String browserSize = System.getProperty("browser_size", "1920x1080");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (System.getProperty("remoteUrl") != null) {
            Configuration.remote = System.getProperty("remoteUrl");
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        }

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = "https://miro.com";
        Configuration.browser = browserName;
        Configuration.browserSize = browserSize;
        Configuration.browserVersion = browserVersion;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
