package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CkHotelOdaReservisionPage {

    public CkHotelOdaReservisionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLogin;
    
    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomResev;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomRese;

    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[1]")
    public WebElement drobDown1;

    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[2]")
    public WebElement drobDown2;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(xpath = "(//input[@class='form-control required'])[1]")
    public WebElement dataStar;

    @FindBy(xpath = "(//input[@class='form-control required'])[2]")
    public WebElement dataEnd;

    @FindBy(id = "AdultAmount")
    public WebElement aduoltBox;

    @FindBy(id = "ChildrenAmount")
    public WebElement childrenBox;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactName;

    @FindBy(id="ContactPhone")
    public WebElement contactPhoneBox;

    @FindBy(id = "ContactEmail")
    public WebElement contactEmailBox;

    @FindBy(id = "Notes")
    public WebElement notesBox;

    @FindBy(id = "Approved")
    public WebElement approvedBox;

    @FindBy(id = "btnSubmit")
    public WebElement save;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement onayMesaji;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButton;
}
