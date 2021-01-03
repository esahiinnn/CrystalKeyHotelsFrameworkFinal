package com.team2.tests;

import com.team2.pages.CkHotelOdaReservisionPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US15InvalidDatalarlaResarvasyonOlusturamama extends TestBaseRapor {

    @Test
    public void TC01SelectUserdropdown1Secmeme() throws InterruptedException {
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(2000);
        Assert.assertTrue(ckHotelOdaReservisionPage.idUserHata1.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC02SelectUserdropdownSecmeme() throws InterruptedException {
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(2000);
        Assert.assertTrue(ckHotelOdaReservisionPage.idUserHata2.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();

    }
    @Test
    public void TC03PriceBoxaDegerGirmeme() throws InterruptedException {
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.dataStar.sendKeys(ConfigReader.getProperty("au_DataStart"));
        ckHotelOdaReservisionPage.dataEnd.sendKeys(ConfigReader.getProperty("au_DataEnd"));
        ckHotelOdaReservisionPage.aduoltBox.sendKeys(ConfigReader.getProperty("au_AdultAmount_Data"));
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(2000);
        Assert.assertTrue(ckHotelOdaReservisionPage.priceHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC04DataStartBoxGirmeme(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.dataEnd.sendKeys(ConfigReader.getProperty("au_DataEnd"));
        ckHotelOdaReservisionPage.aduoltBox.sendKeys(ConfigReader.getProperty("au_AdultAmount_Data"));
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.dataStartHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC05DataEndGeriTarih(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.dataEnd.sendKeys(ConfigReader.getProperty("au_DataEnd_GeriTarih"));
        ckHotelOdaReservisionPage.aduoltBox.sendKeys(ConfigReader.getProperty("au_AdultAmount_Data"));
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.dataEndHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC06DataEndBoxGirmeme(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.aduoltBox.sendKeys(ConfigReader.getProperty("au_AdultAmount_Data"));
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.dataEndHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC007AdultAmountBosBirakma(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.childrenBox.sendKeys(ConfigReader.getProperty("au_ChildrenAmount_Data"));
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.adultAmountHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC08ChilderenAmaountBosBirak(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactName.sendKeys(ConfigReader.getProperty("au_ContactNameSurname_Data"));
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.childrenAmountHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC09ContactNameBosBirakma(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ContactPhone_Data"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactNameHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();

    }
    @Test
    public void TC10ValidContactPhone() throws InterruptedException {
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        Thread.sleep(4000);
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ValidContactPhone"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactPhoneHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();

    }
    @Test
    public void TC11ValidContactPhone2(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactPhoneBox.sendKeys(ConfigReader.getProperty("au_ValidContactPhone2"));
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactPhoneHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC12ContactPhoneBos(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_ContactEmail_Data"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactPhoneHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();

    }
    @Test
    public void TC13InvalidEmail(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_InvalidEmail"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactEmailHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC14InvalidEmail2(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.contactEmailBox.sendKeys(ConfigReader.getProperty("au_InvalidEmail2"));
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactEmailHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();

    }
    @Test
    public void TC15ContactEmailBos(){
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.notesBox.sendKeys(ConfigReader.getProperty("au_Note_Data"));
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.contactEmailHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");
        Driver.closeDriver();
    }
    @Test
    public void TC16NoteBoxBos() throws InterruptedException {
        extentTest=extentReports.createTest("Ck Otel Oda Reservision","Invalid datalarla oda reservasyon yapilmamali");
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
        ckHotelOdaReservisionPage.approvedBox.click();
        extentTest.info("Invalid datalar Basarili bir sekilde girildi");
        Thread.sleep(3000);
        ckHotelOdaReservisionPage.save.click();
        Assert.assertTrue(ckHotelOdaReservisionPage.notesHata.isDisplayed());
        extentTest.pass("Resarvasyon olusturulamadi");

        Thread.sleep(3000);
        Driver.closeDriver();
    }

}