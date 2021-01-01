

package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.krb5.Config;


public class US011HotelRoomSearchTests extends TestBaseRapor {

    @Test
    public void tc001() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "Id ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        eckHotelsAdminPage.idTextBox.sendKeys(ConfigReader.getProperty("e_id"));
        extentTest.info("Id text box'a valid bir data girildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.idDropDownSonuc.getText(), ConfigReader.getProperty("e_id"));
        extentTest.pass("Hotel room search with Id testi basariliyla gerceklestirildi");

        Driver.closeDriver();
        Thread.sleep(2000);

    }


    @Test
    public void tc002() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "IdHotel ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        Select select = new Select(eckHotelsAdminPage.IdHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_id_hotel"));
        extentTest.info("IdHotel drop down'undan valid bir hotel secildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(2000);


        Assert.assertEquals(eckHotelsAdminPage.idHotelDropDownSonuc.getText(), ConfigReader.getProperty("e_id_hotel"));
        extentTest.pass("Hotel room search with IdHotel testi basariliyla gerceklestirildi");

        Driver.closeDriver();
    }

    @Test
    public void tc003() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "Code ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        actions.click(eckHotelsAdminPage.codeTextBox).perform();
        eckHotelsAdminPage.codeTextBox.sendKeys(ConfigReader.getProperty("e_codes"));
        extentTest.info("Code text box'ina valid bir data girildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.codeTextSonuc.getText(), ConfigReader.getProperty("e_codes"));
        extentTest.pass("Hotel room search with Code testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }

    @Test
    public void tc004() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "Name ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        actions.click(eckHotelsAdminPage.nameTextBox).perform();
        eckHotelsAdminPage.nameTextBox.sendKeys(ConfigReader.getProperty("e_namef"));
        extentTest.info("Name text box'a valid data girildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.nameTextSonuc.getText(), ConfigReader.getProperty("e_namef"));
        extentTest.pass("Hotel room search with Name testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }

    @Test
    public void tc005() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "Location ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        actions.click(eckHotelsAdminPage.locationTextBox).perform();
        eckHotelsAdminPage.locationTextBox.sendKeys(ConfigReader.getProperty("e_locationf"));
        extentTest.info("Location text box'a valid data girildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.locationTextSonuc.getText(), ConfigReader.getProperty("e_locationf"));
        extentTest.pass("Hotel room search with Location testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }

    @Test
    public void tc006() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "Price ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        actions.click(eckHotelsAdminPage.priceTextBox).perform();
        eckHotelsAdminPage.priceTextBox.sendKeys(ConfigReader.getProperty("e_pricef"));
        extentTest.info("Price text box'ina valid data girildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.priceTextSonuc.getText(), ConfigReader.getProperty("e_price_real"));
        extentTest.pass("Hotel room search with price testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }

    @Test
    public void tc007() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "RoomType ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        Select select = new Select(eckHotelsAdminPage.IDGroupRoomTypeDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_room_typef"));
        extentTest.info("IDGroupRoomType dropdown'undan valid bir data secildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(eckHotelsAdminPage.IDGroupRoomTypeSonuc.getText(), ConfigReader.getProperty("e_room_typef"));
        extentTest.pass("Hotel room search with IDGroupRoomType dropdown testi basariliyla gerceklestirildi");
        Driver.closeDriver();

    }

    @Test
    public void tc008() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels Room Search", "isAvailable ile oda aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_rooms_url"));
        extentTest.info("Kullanici CrystalKeyHotels Room Admin sayfasina gitti");

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        Select select = new Select(eckHotelsAdminPage.isAvailableDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("e_is_available"));
        extentTest.info("isAvailable dropdown'undan valid bir data secildi");
        eckHotelsAdminPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("e_is_available"));
        extentTest.pass("Hotel room search with isAvailable dropdown testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }
}