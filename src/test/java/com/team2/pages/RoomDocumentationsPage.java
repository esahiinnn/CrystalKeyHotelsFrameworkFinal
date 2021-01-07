package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomDocumentationsPage {

    public RoomDocumentationsPage(){
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
    @FindBy(partialLinkText = "Room reservations")
    public WebElement roomReservations;
    @FindBy(xpath = "//select[@id='itemsExportTypes']")
    public WebElement documenDropdown;
    @FindBy(xpath = "//button[@id='btnExportTable']")
    public WebElement downloadButton;


}
