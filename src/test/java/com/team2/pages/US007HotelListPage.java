package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US007HotelListPage {

    public US007HotelListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="UserName")
    public WebElement userNameTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;

    @FindBy(xpath ="//*[text()='Hotel Management']" )
    public WebElement hotelManagementButonu;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListButonu;

    @FindBy(xpath = "//*[text()='Add Hotel ']")
    public WebElement addButonu;

    @FindBy(id="Code")
    public WebElement codeTextBox;

    @FindBy(id="Name")
    public WebElement nameTextBox;

    @FindBy(id="Address")
    public WebElement adresTextBox;

    @FindBy(id="Phone")
    public WebElement phoneTextBox;

    @FindBy(id="Email")
    public WebElement emailTextBox;

    @FindBy(id="IDGroup")
    public WebElement idGroupDropDown;

    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement hotelOlusturulduYazisi;



}
