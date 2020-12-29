package com.team2.tests;

import com.team2.pages.CkHotelsHomePageHS;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US005AnasayfaModulleriTest {

    @Test
    public void hotelRoomReservasyonMenusu(){

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(ckHotelsHomePage.hotelListText.getText().equals(ConfigReader.getProperty("h_hotel_list_text")));
        softAssert.assertTrue(ckHotelsHomePage.hotelRoomsText.getText().equals(ConfigReader.getProperty("h_hotel_rooms_text")));
        softAssert.assertTrue(ckHotelsHomePage.roomReservasyonText.getText().equals(ConfigReader.getProperty("h_room_reservasyon_text")));

        softAssert.assertAll();

        Driver.closeDriver();
    }

}
