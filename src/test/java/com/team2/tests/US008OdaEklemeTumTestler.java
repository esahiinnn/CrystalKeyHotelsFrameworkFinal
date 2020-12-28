package com.team2.tests;

import com.team2.pages.HotelRoomAdminLoginPage;
import com.team2.pages.HotelRoomManagementPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US008OdaEklemeTumTestler {

    @Test
    public void tc001() throws InterruptedException {

        HotelRoomAdminLoginPage hotelRoomAdminLoginPage=new HotelRoomAdminLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        hotelRoomAdminLoginPage.login();
        HotelRoomManagementPage hotelRoomManagementPage=new HotelRoomManagementPage();
        hotelRoomManagementPage.addHotelRoomButon.click();
        Select select=new Select(hotelRoomManagementPage.otelName);
        select.selectByVisibleText("HİLTON");
        hotelRoomManagementPage.otelCode.sendKeys(ConfigReader.getProperty("adck_otel_code_a"));
        hotelRoomManagementPage.odaName.sendKeys(ConfigReader.getProperty("adck_otel_name_a"));
        hotelRoomManagementPage.otelLocation.sendKeys(ConfigReader.getProperty("adck_otel_location_a"));
        hotelRoomManagementPage.otelAciklama.sendKeys(ConfigReader.getProperty("adck_otel_aciklama_a"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(hotelRoomManagementPage.otelPriceYediyuzButonu,hotelRoomManagementPage.otelpriceTextBox).perform();
        Select selectOda=new Select(hotelRoomManagementPage.otelOdaTipi);
        selectOda.selectByVisibleText("Double");
        hotelRoomManagementPage.otelAdultCount.sendKeys(ConfigReader.getProperty("adck_otel_adult_a"));
        hotelRoomManagementPage.otelChilCount.sendKeys(ConfigReader.getProperty("adck_otel_child_a"));
        hotelRoomManagementPage.otelApproved.click();
        hotelRoomManagementPage.saveButon.click();
        Thread.sleep(2000);
        Assert.assertTrue(hotelRoomManagementPage.otelOdasiKaydedildiYazisi.isDisplayed());
        hotelRoomManagementPage.okbutonu.click();

        }
    @Test
    public  void  tc002() throws InterruptedException {
        HotelRoomAdminLoginPage hotelRoomAdminLoginPage=new HotelRoomAdminLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        hotelRoomAdminLoginPage.login();
        HotelRoomManagementPage hotelRoomManagementPage=new HotelRoomManagementPage();
        hotelRoomManagementPage.addHotelRoomButon.click();
        Select select=new Select(hotelRoomManagementPage.otelName);
        select.selectByVisibleText("HİLTON");
        hotelRoomManagementPage.otelCode.sendKeys(ConfigReader.getProperty("adck_otel_code_a"));
        hotelRoomManagementPage.odaName.sendKeys(ConfigReader.getProperty("adck_otel_name_a"));
        hotelRoomManagementPage.otelLocation.sendKeys(ConfigReader.getProperty("adck_otel_location_a"));
        hotelRoomManagementPage.otelAciklama.sendKeys(ConfigReader.getProperty("adck_otel_aciklama_a"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(hotelRoomManagementPage.otelPriceYediyuzButonu,hotelRoomManagementPage.otelpriceTextBox).perform();
        Select selectOda=new Select(hotelRoomManagementPage.otelOdaTipi);
        selectOda.selectByVisibleText("Double");
        hotelRoomManagementPage.otelAdultCount.sendKeys(ConfigReader.getProperty("adck_otel_adult_a"));
        hotelRoomManagementPage.otelChilCount.sendKeys(ConfigReader.getProperty("adck_otel_child_a"));
        hotelRoomManagementPage.otelApproved.click();
        hotelRoomManagementPage.saveButon.click();
        Thread.sleep(2000);
        Assert.assertTrue(hotelRoomManagementPage.otelOdasiKaydedildiYazisi.isDisplayed());
        hotelRoomManagementPage.okbutonu.click();

    }
}
