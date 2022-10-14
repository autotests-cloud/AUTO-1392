package web.tests;

public class TextData {
    private String amountUsers = "Trusted by 40M+ users";
    private String mainPageUrl = "https://miro.com";
    private static String careersPageUrl = "/careers/";
    private static String aboutPageUrl = "/about/";
    private static String loginButtonText = "Login";
    private static String signUpButtonText = "Sign up free";
    private static String negativTextMainPage = "20 M";

    public static String getLoginButtonText() {
        return loginButtonText;
    }

    public static String getSignUpButtonText() {
        return signUpButtonText;
    }

    public static String getAboutPageUrl() {
        return aboutPageUrl;
    }

    public static String getCareersPageUrl() {
        return careersPageUrl;
    }

    public String getAmountUsers() {
        return amountUsers;
    }

    public String getMainPageUrl() {
        return mainPageUrl;
    }

    public static String getNegativTextMainPage() {
        return negativTextMainPage;
    }

}
