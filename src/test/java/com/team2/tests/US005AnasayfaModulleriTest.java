package com.team2.tests;
import com.aventstack.extentreports.ExtentTest;
import com.team2.pages.CkHotelsHomePageHS;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US005AnasayfaModulleriTest extends TestBaseRapor {

    @Test
    public void hotelRoomReservasyonMenusu(){

        extentTest=extentReports.createTest("ck hotel hotel room reservasyon menüsü görüntüleme","login oldugumda sirasiyla şu moduleler görmeliyim: Hotel, room and reservation");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        ckHotelsHomePage.userTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid user name girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        ckHotelsHomePage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(ckHotelsHomePage.hotelListText.getText().equals(ConfigReader.getProperty("h_hotel_list_text")));
        softAssert.assertTrue(ckHotelsHomePage.hotelRoomsText.getText().equals(ConfigReader.getProperty("h_hotel_rooms_text")));
        softAssert.assertTrue(ckHotelsHomePage.roomReservasyonText.getText().equals(ConfigReader.getProperty("h_room_reservasyon_text")));
        extentTest.pass("Ck hotels anasayfasinda sirasiyla; Hotel, room and reservation modülleri görüntülendigi test edildi");

        softAssert.assertAll();

        Driver.closeDriver();
    }

}