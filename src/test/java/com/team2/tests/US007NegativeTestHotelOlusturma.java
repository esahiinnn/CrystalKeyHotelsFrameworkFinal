package com.team2.tests;

import com.team2.pages.US007HotelListPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US007NegativeTestHotelOlusturma {

    @Test
    public void bosCodeTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.codeTextBox.isEnabled());
        Driver.closeDriver();

    }


    @Test
    public void bosNameTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.nameTextBox.isEnabled());
        Driver.closeDriver();

    }

    @Test
    public void bosAddressTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.adresTextBox.isEnabled());
        Driver.closeDriver();

    }


    @Test
    public void bosPhoneTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.phoneTextBox.isEnabled());
        Driver.closeDriver();

    }

    @Test
    public void invalidDataPhoneTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertFalse(hotelListPage.hotelOlusturulduYazisi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void bosEmailTextBox() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.idGroupDropDown.click();
        Select select = new Select(hotelListPage.idGroupDropDown);
        select.selectByValue("2");
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.emailTextBox.isEnabled());
        Driver.closeDriver();

    }

    @Test
    public void idGroupSeciliDegil() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_list_url"));
        US007HotelListPage hotelListPage = new US007HotelListPage();
        hotelListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        hotelListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        hotelListPage.loginButonu.click();
        Thread.sleep(5000);
        hotelListPage.hotelManagementButonu.click();
        hotelListPage.hotelListButonu.click();
        hotelListPage.addButonu.click();
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
        hotelListPage.saveButonu.click();
        Assert.assertTrue(hotelListPage.idGroupDropDown.isEnabled());
        Driver.closeDriver();

    }



}