
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
        extentTest.info("Hotel odasinin Hotel'i degistirilebildiginin testi yapildi");

        Thread.sleep(1000);
        eckHotelsEditRoomPage.okButton.click();
        extentTest.info("Okey butonuna basildi");

        Thread.sleep(1000);
        Assert.assertEquals(secilmisSecenek, ConfigReader.getProperty("e_id_hotel"));

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
        extentTest.info("Hotel odasinin Code'u degistirilebildinin testi yapildi");
        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.codeTextBox.getText(),ConfigReader.getProperty("e_codes"));

    }

    @Test
    public void tc003() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Name'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.nameTextBox.clear();
        eckHotelsEditRoomPage.nameTextBox.sendKeys(ConfigReader.getProperty("e_id_hotel"));

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.nameTextBox.getText(),ConfigReader.getProperty("e_id_hotel"));

    }

    @Test
    public void tc004() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin Price'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.priceTextBox.clear();
        eckHotelsEditRoomPage.priceTextBox.sendKeys(ConfigReader.getProperty("e_pricef"));

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.priceTextBox.getText(), "300");

    }

    @Test
    public void tc005() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin RoomType'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        Select select = new Select(eckHotelsEditRoomPage.roomTypeDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_room_typef"));

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("e_room_typef"));

    }

    @Test
    public void tc006() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin MAC'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.maxAdultCountTextBox.clear();
        eckHotelsEditRoomPage.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("e_maxacf"));

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.maxAdultCountTextBox.getText(), ConfigReader.getProperty("e_maxacf"));

    }

    @Test
    public void tc007() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin MCC'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.maxChildrenCountTextBox.clear();
        eckHotelsEditRoomPage.maxChildrenCountTextBox.sendKeys(ConfigReader.getProperty("e_maxccf"));

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.maxChildrenCountTextBox.getText(), ConfigReader.getProperty("e_maxccf"));

    }

    @Test
    public void tc008() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasinin isAvailable'i degistirilebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.isAvailableCheckBox.click();

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(eckHotelsEditRoomPage.isAvailableCheckBox.isSelected());

    }

    @Test
    public void tc009() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Arrange", "Hotel odasi silinebilmelidir");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();

        eckHotelsEditRoomPage.deleteButton.click();
        eckHotelsEditRoomPage.secondOkButton.click();


        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(eckHotelsEditRoomPage.isAvailableCheckBox.isSelected());

    }
}

