package com.team2.pages;

import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class US010RoomOlusturamamaHomePage {
    public US010RoomOlusturamamaHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="UserName")
    public WebElement usernameTextbox;
    @FindBy(id="Password")
    public WebElement passwordTextbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(id="IDHotel")
    public WebElement selectHotelDropdown;
    @FindBy(id = "Code")
    public WebElement codeTextbox;
    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextbox;
    @FindBy(id = "Location")
    public WebElement locationTextbox;
    @FindBy(id = "Price")
    public WebElement priceTextbox;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;
    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCountTextbox;
    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCountTextbox;
    @FindBy(xpath ="//input[@id='IsAvailable']")
    public WebElement approvedKutucugu;
    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement succesYazisi;
    @FindBy(xpath = "//label[@for='IDHotel']")
    public WebElement selectHotelHataYazisi;
    @FindBy(xpath = "//label[@for='Code']")
    public WebElement codeHataYazisi;
    @FindBy(xpath = "//label[@for='Name']")
    public WebElement nameHataYazisi;
    @FindBy(xpath = "//label[@for='Location']")
    public WebElement locationHataYazisi;
    @FindBy(xpath = "//label[@for='Price']")
    public WebElement priceHataYazisi;
    @FindBy(xpath = "//label[@for='IDGroupRoomType']")
    public WebElement roomTypeHataYazisi;
    @FindBy(xpath = "//label[@for='MaxAdultCount']")
    public WebElement maxAdultCountHataYazisi;
    @FindBy(xpath = "//label[@for='MaxChildCount']")
    public WebElement maxChildCountHataYazisi;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoombutonu;

    @Test
    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        usernameTextbox.sendKeys(ConfigReader.getProperty("valid_username1"));
        passwordTextbox.sendKeys(ConfigReader.getProperty("valid_password1"));
        loginButton.click();
        addHotelRoombutonu.click();
    }


}
