package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelRoomManagementPage {

    public  HotelRoomManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelRoomButon;
    @FindBy(id="IDHotel")
    public WebElement otelName;
    @FindBy(id="Code")
    public WebElement otelCode;
    @FindBy(id="Name")
    public WebElement odaName;
    @FindBy(id="Location")
    public WebElement otelLocation;
    @FindBy(xpath="//textarea[@dir='ltr']")
    public WebElement otelAciklama;
    @FindBy(id="Price")
    public  WebElement otelpriceTextBox;
    @FindBy(linkText="700")
    public WebElement otelPriceYediyuzButonu;
    @FindBy(xpath="//select[@title='Select Room Type']")
    public WebElement otelOdaTipi;
    @FindBy(id="MaxAdultCount")
    public WebElement otelAdultCount;
    @FindBy(id="MaxChildCount")
    public  WebElement otelChilCount;
    @FindBy(id="IsAvailable")
    public WebElement otelApproved;
    @FindBy(id="btnSubmit")
    public WebElement saveButon;
    @FindBy(xpath="//*[text()='HotelRoom was inserted successfully']")
    public WebElement otelOdasiKaydedildiYazisi;
    @FindBy(xpath="(//button[@type='button'])[6]")
    public WebElement okbutonu;
    @FindBy(id="itemsExportTypes")
    public WebElement formatDropDown;
    @FindBy(id="btnExportTable")
    public  WebElement indirbutonu;
}

