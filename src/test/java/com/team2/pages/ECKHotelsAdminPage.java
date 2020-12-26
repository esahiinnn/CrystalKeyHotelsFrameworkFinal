package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECKHotelsAdminPage {

    public ECKHotelsAdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='IDHotelRoom']")
    public WebElement idTextBox;

    @FindBy(xpath = "//*[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//tr[1]//td[1]")
    public WebElement idDropDownSonuc;

    @FindBy(xpath = "//select[@id='lkpHotels']")
    public WebElement IdHotelDropDown;

    @FindBy(xpath = "//tr[1]//td[2]")
    public WebElement idHotelDropDownSonuc;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement codeTextBox;

    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement codeTextSonuc;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement nameTextBox;

    @FindBy(xpath = "//tr[1]//td[4]")
    public WebElement nameTextSonuc;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement locationTextBox;

    @FindBy(xpath = "//tr[1]//td[5]")
    public WebElement locationTextSonuc;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement priceTextBox;

    @FindBy(xpath = "//tr[1]//td[6]")
    public WebElement priceTextSonuc;

    @FindBy(xpath = "//select[@title='Select Room Type']")
    public WebElement IDGroupRoomTypeDropDown;

    @FindBy(xpath = "//tr[1]//td[7]")
    public WebElement IDGroupRoomTypeSonuc;

    @FindBy(xpath = "//select[@name='IsAvailable']")
    public WebElement isAvailableDropDown;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement isAvailableSonuc;

    @FindBy(xpath = "//*[text()='Clear']")
    public WebElement clearButton;

    @FindBy(xpath = "//*[text()=' Details']")
    public WebElement detailsButton;
}