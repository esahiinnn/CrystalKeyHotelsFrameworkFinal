
package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsEditRoomPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.krb5.Config;

public class US012HotelRoomArrangeTests extends TestBaseRapor {

    @Test
    public void tc001() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Hotel'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        Select select = new Select(eckHotelsEditRoomPage.hotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_id_hotel"));
        extentTest.info("Hotel dropdown'undan valid bir data secildi");
        String secilmisSecenek = select.getFirstSelectedOption().getText();

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals( eckHotelsEditRoomPage.successMessage.getText(), ConfigReader.getProperty("e_success_message"));
        extentTest.pass("Hotel odasinin Hotel'i degistirilebildiginin testi yapildi");

        Thread.sleep(1000);
        eckHotelsEditRoomPage.okButton.click();
        extentTest.info("Okey butonuna basildi");


        Driver.closeDriver();
    }

    @Test
    public void tc002() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Code'u degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        eckHotelsEditRoomPage.codeTextBox.clear();
        extentTest.info("Code text box'indaki veriler silindi");
        eckHotelsEditRoomPage.codeTextBox.sendKeys(ConfigReader.getProperty("e_codes"));
        extentTest.info("Code text box'ina valid datalar gonderildi");
        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin el altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(eckHotelsEditRoomPage.successMessage.getText(), ConfigReader.getProperty("e_success_message"));
        extentTest.pass("Hotel odasinin Code'u degistirilebildinin testi yapildi");

        Driver.closeDriver();
    }

    @Test
    public void tc003() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Name'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        eckHotelsEditRoomPage.nameTextBox.clear();
        extentTest.info("Name text box'indaki veriler silindi");
        eckHotelsEditRoomPage.nameTextBox.sendKeys(ConfigReader.getProperty("e_id_hotel"));
        extentTest.info("Name text box'ina valid datalar girildi");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin Name'i degistirilebildinin testi yapildi");
        Driver.closeDriver();

    }

    @Test
    public void tc004() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Price'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        eckHotelsEditRoomPage.priceTextBox.clear();
        extentTest.info("Price text box'indaki veriler silindi");
        eckHotelsEditRoomPage.priceTextBox.sendKeys(ConfigReader.getProperty("e_pricef"));
        extentTest.info("Price text box'ina valid datalar girildi");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin Price'i degistirilebildinin testi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void tc005() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin RoomType'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");
        Select select = new Select(eckHotelsEditRoomPage.roomTypeDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_room_typef"));
        extentTest.info("Room type drop down'undan valid bir data secildi");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin RoomType'i degistirilebildinin testi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void tc006() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin MAC'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");
        eckHotelsEditRoomPage.maxAdultCountTextBox.clear();
        extentTest.info("Max Adult Count text box'indaki veriler silindi");
        eckHotelsEditRoomPage.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("e_maxacf"));
        extentTest.info("Max Adult Count'una valid datalar girildi");
        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin Max Adult Count'unun degistirilebildinin testi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void tc007() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin MCC'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        eckHotelsEditRoomPage.maxChildrenCountTextBox.clear();
        extentTest.info("Max Children Count text box'indaki veriler temizlendi");
        eckHotelsEditRoomPage.maxChildrenCountTextBox.sendKeys(ConfigReader.getProperty("e_maxccf"));
        extentTest.info("Max Children Count text box'ina valid datalar girildi");
        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna basildi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin Max Children Count'unun degistirilebildinin testi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void tc008() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin isAvailable'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");

        eckHotelsEditRoomPage.isAvailableCheckBox.click();
        extentTest.info("isAvailable check box'ina tiklandi");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin en altina inildi");
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        extentTest.info("Save butonuna baisldi");
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        extentTest.pass("Hotel odasinin isAvailable durumu degistirilebildiginin testi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void tc009() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasi silinebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();
        extentTest.info("Otel Odasi sayfasina giris yapildi");
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        extentTest.info("Sayfanin el altina inildi");
        eckHotelsEditRoomPage.deleteButton.click();
        extentTest.info("Delete butonuna basildi");
        eckHotelsEditRoomPage.secondOkButton.click();
        extentTest.info("Ok butonuna basildi");


    }
}

