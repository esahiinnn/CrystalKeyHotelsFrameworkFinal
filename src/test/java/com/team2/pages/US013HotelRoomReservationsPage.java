package com.team2.pages;

import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US013HotelRoomReservationsPage {

    public US013HotelRoomReservationsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;



    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[1]")
    public WebElement IdTextbox;

    @FindBy(xpath = "//tr[1]//td[1]")
    public WebElement IdTextboxSonuc;

    @FindBy(xpath = "//select[@id='lkpHotelRooms']")
    public WebElement HotelRoomReservationsPageHtlRmSellectDropDown;

    @FindBy(xpath = "//tr[1]//td[2]")
    public WebElement HotelRoomReservationsPageHtlRmSellectDropDownSonuc;

    @FindBy(xpath = "//select[@id='lkpUsers']")
    public WebElement HotelRoomReservationsPageUserSellectDropDown;


    @FindBy(id = "lkpUsers")
    public WebElement HotelRoomReservationsPageUserSellectDropDownSellectUser;

    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement HotelRoomReservationsPageUserSellectDropDownSellectUserSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[2]")

    public WebElement HotelRoomReservationsPagePriceTextBox;

    @FindBy(xpath = "//tr[1]//td[4]")
    public WebElement HotelRoomReservationsPagePriceTextBoxSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[3]")
    public WebElement HotelRoomReservationsPageDateStart;

    //@FindBy(xpath = "//tr[10]//td[5]")
    public WebElement HotelRoomReservationsPageDateStartSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[5]")
    public WebElement HotelRoomReservationsPageDateEnd;

    @FindBy(xpath = "//tr[1]//td[6]")
    public WebElement HotelRoomReservationsPageDateEndSonuc;


    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[7]")
    public WebElement HotelRoomReservationsPageAdultAmount;

    @FindBy(xpath = "//tr[1]//td[7]")
    public WebElement HotelRoomReservationsPageAdultAmountSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[8]")
    public WebElement HotelRoomReservationsPageChildAmount;

    @FindBy(xpath = "//tr[1]//td[8]")
    public WebElement HotelRoomReservationsPageChildAmountSonuc;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement HotelRoomReservationsPageContacNameSurname;

    @FindBy(xpath = "//tr[1]//td[9]")
    public WebElement HotelRoomReservationsPageContacNameSurnameSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[10]")
    public WebElement HotelRoomReservationsPageContacPhone;

    @FindBy(xpath = "//tr[1]//td[10]")
    public WebElement HotelRoomReservationsPageContacPhoneSonuc;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[11]")
    public WebElement HotelRoomReservationsPageContacEmail;

    @FindBy(xpath = "//tr[1]//td[11]")
    public WebElement HotelRoomReservationsPageContacEmailSonuc;

    @FindBy(xpath = "(//select[@class='form-control form-filter input-sm'])[3]")
    public WebElement HotelRoomReservationsPageApprovedDropDown;

    @FindBy(xpath = "//tr[1]//td[12]")
    public WebElement HotelRoomReservationsPageApprovedDropDownSonuc;

    @FindBy(xpath = "(//select[@class='form-control form-filter input-sm'])[4]")
    public WebElement HotelRoomReservationsPageIsPaidDropDown;

    @FindBy(xpath = "//tr[1]//td[13]")
    public WebElement HotelRoomReservationsPageIsPaidDropDownSonuc;

    @FindBy(xpath = "//select[@id='itemsExportTypes']")
    public WebElement HotelRoomReservationsPageListofReservationsType;

    @FindBy(xpath = "(//select[@class='form-control input-xsmall input-sm input-inline'])[1]")
    public WebElement HotelRoomReservationsPageListofReservationsSayfadaGozukmeMktr;





}
