

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


public class US011Tests {

    @Test
    public void tc001() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        eckHotelsAdminPage.idTextBox.sendKeys(ConfigReader.getProperty(""));
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
        select.selectByVisibleText("UNAL");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(2000);


        Assert.assertEquals("UNAL", eckHotelsAdminPage.idHotelDropDownSonuc.getText());

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
        eckHotelsAdminPage.codeTextBox.sendKeys("428686");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(ConfigReader.getProperty("e_code"), eckHotelsAdminPage.codeTextSonuc.getText());

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
        eckHotelsAdminPage.nameTextBox.sendKeys("Chris");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(ConfigReader.getProperty("e_name"), eckHotelsAdminPage.nameTextSonuc.getText());

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
        eckHotelsAdminPage.locationTextBox.sendKeys("California San Francisco Lincoln Road USA");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(ConfigReader.getProperty("e_location"), eckHotelsAdminPage.locationTextSonuc.getText());

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
        eckHotelsAdminPage.priceTextBox.sendKeys("400");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals("400.00", eckHotelsAdminPage.priceTextSonuc.getText());

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
        select.selectByVisibleText("Queen");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals("Queen", eckHotelsAdminPage.IDGroupRoomTypeSonuc.getText());
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
        select.selectByVisibleText("True");
        eckHotelsAdminPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertTrue(eckHotelsAdminPage.isAvailableSonuc.isSelected());

        Driver.closeDriver();
    }
}