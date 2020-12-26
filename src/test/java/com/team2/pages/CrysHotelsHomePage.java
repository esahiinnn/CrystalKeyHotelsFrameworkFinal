package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrysHotelsHomePage {
    public CrysHotelsHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(linkText = "Log in")
    public WebElement girislogin;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement hataMesaji;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement logut;

    @FindBy(xpath = "//a[@href='/Admin/Account/Logoff']")
    public WebElement logutTikle;





}
