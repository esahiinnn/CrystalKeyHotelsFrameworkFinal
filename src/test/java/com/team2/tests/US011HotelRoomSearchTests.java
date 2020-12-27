

package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.krb5.Config;


public class US011HotelRoomSearchTests {

    @Test
    public void tc001() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        eckHotelsAdminPage.idTextBox.sendKeys(ConfigReader.getProperty("e_id"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.idDropDownSonuc.getText(), "206");

        Driver.closeDriver();
        Thread.sleep(2000);

    }


    @Test
    public void tc002() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        Select select = new Select(eckHotelsAdminPage.IdHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_id_hotel"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(2000);


        Assert.assertEquals(eckHotelsAdminPage.idHotelDropDownSonuc.getText(), ConfigReader.getProperty("e_id_hotel"));

        Driver.closeDriver();
    }

    @Test
    public void tc003() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        actions.click(eckHotelsAdminPage.codeTextBox).perform();
        eckHotelsAdminPage.codeTextBox.sendKeys(ConfigReader.getProperty("e_codef"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.codeTextSonuc.getText(), ConfigReader.getProperty("e_code"));

        Driver.closeDriver();
    }

    @Test
    public void tc004() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        actions.click(eckHotelsAdminPage.nameTextBox).perform();
        eckHotelsAdminPage.nameTextBox.sendKeys(ConfigReader.getProperty("e_namef"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.nameTextSonuc.getText(), ConfigReader.getProperty("e_name"));

        Driver.closeDriver();
    }

    @Test
    public void tc005() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        actions.click(eckHotelsAdminPage.locationTextBox).perform();
        eckHotelsAdminPage.locationTextBox.sendKeys(ConfigReader.getProperty("e_locationf"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.locationTextSonuc.getText(), ConfigReader.getProperty("e_location"));

        Driver.closeDriver();
    }

    @Test
    public void tc006() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        actions.click(eckHotelsAdminPage.priceTextBox).perform();
        eckHotelsAdminPage.priceTextBox.sendKeys(ConfigReader.getProperty("e_pricef"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.priceTextSonuc.getText(), ConfigReader.getProperty("e_pricef"));

        Driver.closeDriver();
    }

    @Test
    public void tc007() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        Select select = new Select(eckHotelsAdminPage.IDGroupRoomTypeDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_room_typef"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.IDGroupRoomTypeSonuc.getText(), ConfigReader.getProperty("e_room_typef"));
        Driver.closeDriver();

    }

    @Test
    public void tc008() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        Select select = new Select(eckHotelsAdminPage.isAvailableDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_is_available"));
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("e_is_available"));

        Driver.closeDriver();
    }
}