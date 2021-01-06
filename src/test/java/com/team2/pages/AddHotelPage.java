package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddHotelPage {
    public AddHotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText="Log in")
    public WebElement loginSignin;
    @FindBy(id = "UserName")
    public WebElement usernameTextBox;
    @FindBy(id = "Password")
    public WebElement passwordTextBox;
    @FindBy(id = "btnSubmit")
    public WebElement loginHome;
    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;
    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelList;
    @FindBy(xpath = "//*[text()='Add Hotel ']")
    public WebElement addHotel;
    @FindBy(id = "Code")
    public WebElement codeTextBox;
    @FindBy(id="Name")
    public WebElement nameTextBox;
    @FindBy(id="Address")
    public WebElement adresTextBox;
    @FindBy(id="Phone")
    public WebElement phoneTextBox;
    @FindBy(id="Email")
    public WebElement emailTextBox;
    @FindBy(id = "IDGroup")
    public WebElement dropdownIDGroup;
    @FindBy(id = "btnSubmit")
    public  WebElement save;
    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement addHotelMessage;


}
