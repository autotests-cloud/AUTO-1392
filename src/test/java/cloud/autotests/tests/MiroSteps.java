package cloud.autotests.tests;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MiroSteps {
    public MiroSteps openCareerUrl() {
        open("/careers/");
        return this;
    }

    public MiroSteps searchInput(String value) {
        $("#filter [type='text']").setValue(value);
        return this;
    }

    public MiroSteps searchResultIsNotEmpty() {
        $$("[data-name='Engineering']").shouldBe(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    public MiroSteps openAboutUrl() {
        open("/about/");
        return this;
    }

    public MiroSteps clickOnCountry(String value) {
        $("a[href*='" + value + "'").click();
        return this;
    }

    public MiroSteps selectedCountryEqualResult(String value) {
        $(".js-filter-location-wrap div").shouldHave(text(value));
        return this;
    }

    public MiroSteps openMainPage() {
        open("/");
        return this;
    }

    public MiroSteps clickSolutionsInWidget() {
        $("[role = 'menu']").find(byText("Solutions")).click();
        return this;
    }

    public MiroSteps selectProductManagement() {
        $("#solutions-navigation a").click();
        return this;
    }

    public MiroSteps clickSolutionName(String value) {
        $("main div ul").find(byText(value)).click();
        return this;
    }

    public MiroSteps textTitleResult(List<String> value) {
        $$(".ksxfRV h3").shouldBe(CollectionCondition.texts(value));
        return this;
    }
}
