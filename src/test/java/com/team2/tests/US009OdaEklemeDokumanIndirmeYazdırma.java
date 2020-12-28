package com.team2.tests;

import com.team2.pages.HotelRoomAdminLoginPage;
import com.team2.pages.HotelRoomManagementPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class US009OdaEklemeDokumanIndirmeYazdırma {
    @Test
    public void tc001() throws InterruptedException {

        HotelRoomAdminLoginPage hotelRoomAdminLoginPage = new HotelRoomAdminLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        hotelRoomAdminLoginPage.login();
        HotelRoomManagementPage hotelRoomManagementPage = new HotelRoomManagementPage();
        Select selectdrop1=new Select(hotelRoomManagementPage.formatDropDown);
        selectdrop1.selectByVisibleText("Excel");
        hotelRoomManagementPage.indirbutonu.click();
        Thread.sleep(2000);
        Driver.closeDriver();
    }
    @Test
    public void tc002() throws InterruptedException {

        HotelRoomAdminLoginPage hotelRoomAdminLoginPage = new HotelRoomAdminLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        hotelRoomAdminLoginPage.login();
        HotelRoomManagementPage hotelRoomManagementPage = new HotelRoomManagementPage();
        Select selectdrop2=new Select(hotelRoomManagementPage.formatDropDown);
        selectdrop2.selectByVisibleText("Csv");
        hotelRoomManagementPage.indirbutonu.click();
        Thread.sleep(2000);
        Driver.closeDriver();
    }
    @Test
    public void tc003() throws InterruptedException {

        HotelRoomAdminLoginPage hotelRoomAdminLoginPage = new HotelRoomAdminLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        hotelRoomAdminLoginPage.login();
        HotelRoomManagementPage hotelRoomManagementPage = new HotelRoomManagementPage();
        Select selectdrop3=new Select(hotelRoomManagementPage.formatDropDown);
        selectdrop3.selectByVisibleText("Pdf");
        hotelRoomManagementPage.indirbutonu.click();
        Thread.sleep(2000);
        Driver.closeDriver();

    }
}