package com.team2.pages;

import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelRoomAdminLoginPage {
    public void login(){
        userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        passwordNameTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        loginButonu.click();

    }
    public HotelRoomAdminLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="UserName")
    public WebElement userNameTextBox;
    @FindBy(id="Password")
    public WebElement passwordNameTextBox;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButonu;



}
