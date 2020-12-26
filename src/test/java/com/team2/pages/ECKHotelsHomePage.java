package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECKHotelsHomePage {

    public ECKHotelsHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement passwordTextBox;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;


}
