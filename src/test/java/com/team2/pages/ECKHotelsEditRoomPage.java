package com.team2.pages;

import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECKHotelsEditRoomPage {

    public ECKHotelsEditRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@title='Select Hotel']")
    public WebElement hotelDropDown;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeTextBox;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='Location']")
    public WebElement locationTextBox;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceTextBox;

    @FindBy(xpath = "//select[@title='Select GroupRoomType']")
    public WebElement roomTypeDropDown;

    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxAdultCountTextBox;

    @FindBy(xpath = "//input[@id='MaxChildCount']")
    public WebElement maxChildrenCountTextBox;

    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement isAvailableCheckBox;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement editHotelRoomTitle;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement secondOkButton;

    public void logInAndSearch() throws InterruptedException {
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        eckHotelsAdminPage.codeTextBox.sendKeys("428691");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        eckHotelsAdminPage.detailsButton.click();
    }
}

