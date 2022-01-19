package com.aimprosoft;

import org.openqa.selenium.WebDriver;

import static com.aimprosoft.Locators.*;


public class LoginPage extends BasePage {


    public  LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.get(CHAT_URL);}

    public void logInWithData(String emailAddress, String password) {
        writeText(LOGIN_FIELD, emailAddress);
        writeText(PASSWORD_FIELD, password);
        click(SIGNIN_BUTTON);
    }

    public boolean isWelcomeTextVisible() {
        return driver.findElement(GENERAL_ROOM_LOGO).isDisplayed();
    }
    public boolean isErrorMessageVisible() {
        return driver.findElement(ERROR_MESSAGE).isDisplayed();
    }


}



