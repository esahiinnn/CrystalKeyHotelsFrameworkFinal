package com.team2.tests;

import com.team2.pages.CkHotelOdaReservisionPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US014HotelOdaReservisionOlusturmaTest extends TestBaseRapor {

    @Test
    public void odaReservisiontest(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Valid datalarla oda reservasyon yapilmali");
    CkHotelOdaReservisionPage ckHotelOdaReservisionPage=new CkHotelOdaReservisionPage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        ckHotelOdaReservisionPage.ilkLogin.click();
        ckHotelOdaReservisionPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        ckHotelOdaReservisionPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        ckHotelOdaReservisionPage.loginButonu.click();
        extentTest.info("Siteye Basarili bir sekilde giris yapildi");
        ckHotelOdaReservisionPage.hotelManagement.click();
        ckHotelOdaReservisionPage.roomResev.click();
        ckHotelOdaReservisionPage.addRoomRese.click();
        extentTest.info("Reservasyon sayfasina basarili bir sekilde gecildi");
        Select select=new Select(ckHotelOdaReservisionPage.drobDown1);
        select.selectByVisibleText("manager");
        Select select2=new Select(ckHotelOdaReservisionPage.drobDown2);
        select2.selectByVisibleText("Star Hotel");
        ckHotelOdaReservisionPage.priceBox.sendKeys(ConfigReader.getProperty("au_Price_Data"));
        ckHotelOdaReservisionPage.dataStar.sendKeys(ConfigReader.getProperty("au_DataStart"));
        ckHotelOdaReservisionPage.dataEnd.sendKeys(ConfigReader.getProperty("au_DataEnd"));
        ckHotelOdaReservisionPage.aduoltBox.sendKeys(ConfigReader.getProperty("au_AdultAmount_Data"));
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Valid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.onayMesaji.isEnabled());
        ckHotelOdaReservisionPage.okButton.click();
        extentTest.pass("Oda Reservasyonu Olusturuldu");

        Driver.closeDriver();








    }




}
