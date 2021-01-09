package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public  RegisterPage () {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ilklogin;
    @FindBy(linkText = "/Account/Register")
    public WebElement createaNewAccount;
    @FindBy(id = "UserName")
    public WebElement userNameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "NameSurname")
    public WebElement fulNameBox;

    @FindBy(id = "PhoneNo")
    public WebElement phoneBox;

    @FindBy(id = "SSN")
    public WebElement ssnBox;

    @FindBy(id = "DrivingLicense")
    public WebElement drivingLicenceBox;

    @FindBy(id = "Address")
    public WebElement adressBox;

    @FindBy(id = "WorkingSector")
    public WebElement workingSecBox;

    @FindBy(id = "IDCountry")
    public WebElement IdCountrydrobdown;

    @FindBy(id = "IDState")
    public WebElement IdStatedrobdown;

    @FindBy(id = "btnSubmit")
    public WebElement saveButon;
}
