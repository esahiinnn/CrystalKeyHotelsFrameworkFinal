package com.team2.tests;

import com.team2.pages.US007HotelListPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US007NegativeTestHotelOlusturma extends TestBaseRapor {


    @Test
    public void bosCodeTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("bos code textbox","code textbox bos birakildiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_phone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("code textbox disindaki tum hotel bilgi kutucuklarina gerekli bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.codeTextBox.isEnabled());
        extentTest.pass("code box'i bos biraktigimizda hotel olusturulmadigi test edildi");

        Driver.closeDriver();

    }


    @Test
    public void bosNameTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("bos name textbox","name textbox bos birakildiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_phone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("name textbox disindaki tum hotel bilgi kutucuklarina gerekli bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.nameTextBox.isEnabled());
        extentTest.pass("name textbox'i bos biraktigimizda hotel olusturulmadigi test edildi");

        Driver.closeDriver();

    }

    @Test
    public void bosAddressTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("bos address textbox","address textbox bos birakildiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_phone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("address textbox disindaki tum hotel bilgi kutucuklarina gerekli bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.adresTextBox.isEnabled());
        extentTest.pass("address textbox'i bos biraktigimizda hotel olusturulmadigi test edildi");

        Driver.closeDriver();

    }


    @Test
    public void bosPhoneTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("bos phone textbox","phone textbox bos birakildiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("phone textbox disindaki tum hotel bilgi kutucuklarina gerekli bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.phoneTextBox.isEnabled());
        extentTest.pass("phone textbox'i bos biraktigimizda hotel olusturulmadigi test edildi");

        Driver.closeDriver();

    }

    @Test
    public void invalidDataPhoneTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("invalid data phone textbox","phone textbox'a invalid data girildiginde hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_invalidPhone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("phone textbox'a invalid data, diger tum hotel bilgi kutucuklarina dogru bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertFalse(hotelListPage.hotelOlusturulduYazisi.isDisplayed());
        extentTest.pass("phone textbox'a invalid data girildiginde hotel olusturuldugu test edildi");

        Driver.closeDriver();

    }

    @Test
    public void bosEmailTextBox() throws InterruptedException {
        extentTest = extentReports.createTest("bos email textbox","email textbox bos birakildiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_phone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        extentTest.info("email textbox disindaki tum hotel bilgi kutucuklarina gerekli bilgiler girildi.");

        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        extentTest.info("hotel type secildi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.emailTextBox.isEnabled());
        extentTest.pass("email textbox'i bos biraktigimizda hotel olusturulmadigi test edildi");
        Driver.closeDriver();

    }

    @Test
    public void idGroupSeciliDegil() throws InterruptedException {
        extentTest = extentReports.createTest("hotel idGroup secili degil","hotel idGroup secili olmadiginda hotel olusturulamamali");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        extentTest.info("ck hotels hotel olusturma sayfasina gidildi");

        US007HotelListPage hotelListPage = new US007HotelListPage();

        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("dogru kullanici adi girildi");

        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("dogru password girildi");

        hotelListPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Thread.sleep(5000);
        extentTest.info("5 sn beklendi");

        hotelListPage.hotelManagementButonu.click();
        extentTest.info("hotel management butonu tiklandi");

        hotelListPage.hotelListButonu.click();
        extentTest.info("hotel list butonu tiklandi");

        hotelListPage.addButonu.click();
        extentTest.info("add hotel butonu tiklandi");

        hotelListPage.codeTextBox.click();
        hotelListPage.codeTextBox.sendKeys(ConfigReader.getProperty("uhotel_code"));
        hotelListPage.nameTextBox.click();
        hotelListPage.nameTextBox.sendKeys(ConfigReader.getProperty("uhotel_name"));
        hotelListPage.adresTextBox.click();
        hotelListPage.adresTextBox.sendKeys(ConfigReader.getProperty("uhotel_adres"));
        hotelListPage.phoneTextBox.click();
        hotelListPage.phoneTextBox.sendKeys(ConfigReader.getProperty("uhotel_phone"));
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        hotelListPage.emailTextBox.click();
        hotelListPage.emailTextBox.sendKeys(ConfigReader.getProperty("uhotel_email"));
        extentTest.info("tum hotel bilgi kutucuklarina gerekli bilgiler girildi ve hotel idGroup secilmedi");

        hotelListPage.saveButonu.click();
        extentTest.info("hotel olusturma butonuna tiklandi");

        Assert.assertTrue(hotelListPage.idGroupDropDown.isEnabled());
        extentTest.pass("hotel idGroup secilmediginde hotel olusturulmadigi test edildi");

        Driver.closeDriver();

    }



}