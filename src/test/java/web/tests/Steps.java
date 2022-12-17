package web.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static web.tests.TextData.*;

public class Steps {
TextData textData = new TextData();
    public Steps openCareerUrl() {
        open(textData.getCareersPageUrl());
        return this;
    }

    public Steps searchInput(String value) {
        $("#filter [type='text']").setValue(value);
        return this;
    }

    public void searchResultIsNotEmpty() {
        $$("[data-name='Engineering']").shouldBe(CollectionCondition.sizeGreaterThan(0));
    }

    public Steps openAboutUrl() {
        open(textData.getAboutPageUrl());
        return this;
    }

    public Steps clickOnCountry(String value) {
        $("a[href*='" + value + "'").click();
        return this;
    }

    public void selectedCountryEqualResult(String value) {
        $(".js-filter-location-wrap div").shouldHave(text(value));
    }

    public Steps clickSwitcherLanguageButton (){
        $("header [data-testid='SwitcherButton']").click();
        return this;
    }
    public void choiceLanguage(String language){
        $("div ul a[data-locale='" + language + "']").click();
    }
    public Steps comparisoNameLoginButton(){
        $("header [href='/login/']").shouldHave(text(textData.getLoginButtonText()));
        return this;
    }
    public void comparisoNameSignUpButton(){
        $("header [href='/signup/']").shouldHave(text(textData.getSignUpButtonText()));
    }
    public static void checkingPresenceOfTheLogo(){
        $("header span.eLNXYm").shouldBe(Condition.appear);
    }
    public void compareTextOnMainPage(){
        $(".com-sec-slider-3 .com-el-content").shouldHave(Condition.text(textData.getNegativTextMainPage()));

    }

}
