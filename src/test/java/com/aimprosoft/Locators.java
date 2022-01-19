package com.aimprosoft;

import org.openqa.selenium.By;


public class Locators {

    public static final By LOGIN_FIELD = By.xpath ("//input[@id='outlined-helperText']");
    public static final By PASSWORD_FIELD = By.xpath ("//input[@id='outlined-adornment-password']");
    public static final By SIGNIN_BUTTON = By.xpath ("//span[@class='MuiButton-label']");
    public static final By GENERAL_ROOM_LOGO = By.xpath ("//div[@class='room-header-avatar-wrapper']");
    public static final By ERROR_MESSAGE = By.xpath("//div[.='Your Login or Password is incorrect, please try again']");
    public static final String CHAT_URL =  "https://chat-demo.aimprosoft.com/loginPage/index.html#/";

}
