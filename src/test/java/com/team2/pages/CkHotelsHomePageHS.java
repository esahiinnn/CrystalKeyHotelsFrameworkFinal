package com.team2.pages;

import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CkHotelsHomePageHS {

    public CkHotelsHomePageHS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "UserName")
    public WebElement userTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListText;

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsText;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservasyonText;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement hotelDetail;

    @FindBy(xpath = "//a[@href='#tab_general']")
    public WebElement generalData;

    @FindBy(xpath = "//*[@id=\"edit-form\"]/div/div[2]/div/ul/li[3]/a")
    public WebElement properties;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[1]")
    public WebElement codeText;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[2]")
    public WebElement nameText;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[3]")
    public WebElement addressText;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[4]")
    public WebElement phoneText;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[5]")
    public WebElement emailText;

    @FindBy(id = "IDGroup")
    public WebElement hotelDropdown;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButton;

    @FindBy(className = "bootbox-body")
    public WebElement updateSuccessfullyText;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButton;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[4]")
    public WebElement roomDetail;

    @FindBy(id = "btnDelete")
    public WebElement deleteRoom;

    @FindBy(linkText = "Properties")
    public WebElement propertiesLink;

    @FindBy(id = "lkpBarcodeTypes")
    public WebElement otelPropertiesDropdown;

    @FindBy(id = "txtBarcodeCode")
    public WebElement codePropertyTextBox;

    @FindBy(xpath = "//textarea[@id='txtBarcode']")
    public WebElement valuePropertyTextBox;

    @FindBy(xpath = "(//button[@class='btn green'])[2]")
    public WebElement savePropertyButton;

    @FindBy(className = "bootbox-body")
    public WebElement addValueMessage;

    @FindBy(xpath = "(//a[@class='btn default btn-sm  margin-bottom-5'])[1]")
    public WebElement removeProperty;

    @FindBy(className = "bootbox-body")
    public WebElement popUpOnay;

    @FindBy(className = "bootbox-body")
    public WebElement valueDeletedMessage;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement propertyCodeTextBox;

    @FindBy(xpath = "(//*[@rows='6'])[1]")
    public WebElement propertyValueTextBox;

    @FindBy(xpath = "(//a[@class='btn default btn-sm'])[1]")
    public WebElement propertyUpdateButton;

    @FindBy(className = "bootbox-body")
    public WebElement propertyUpdatePopupText;




    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();

        ckHotelsHomePage.userTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        ckHotelsHomePage.loginButton.click();
    }
}

