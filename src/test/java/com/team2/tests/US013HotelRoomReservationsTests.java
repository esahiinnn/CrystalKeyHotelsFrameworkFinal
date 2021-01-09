package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.pages.US013HotelRoomReservationsPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US013HotelRoomReservationsTests extends TestBaseRapor {

    @Test
    public void tc001() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "Id ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");


        us013HotelRoomReservationsPage.IdTextbox.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_valid_Id"));
        extentTest.info("Id Text box'a valid bir data girildi");
        Thread.sleep(3000);
        extentTest.info("3 saniye beklenildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.IdTextboxSonuc.getText(), "18");
        extentTest.pass("HotelRoomReservationPage search with Id testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc002() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "HtlRmSellectDropDown ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");


        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageHtlRmSellectDropDown);
        select.selectByValue("69");
        extentTest.info("HtlRmSellectDropDown'inda valid bir deger secildi");
        Thread.sleep(2000);
        extentTest.info("2 saniye beklenildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageHtlRmSellectDropDownSonuc.getText(), ConfigReader.getProperty("HtlRmRsrvPage_SellectDropDown_valid_HotelRoomIsmi"));
        extentTest.pass("HotelRoomReservationPage search with HtlRmSellectDropDown testi basariliyla gerceklestirildi");
        Driver.closeDriver();
    }

    @Test
    public void tc003() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "UserSellectDropDown ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageUserSellectDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("HtlRmRsrvPage_UserSellectDropDown_valid_User"));
        extentTest.info("UserSellectDropDown'inda valid bir deger secildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageUserSellectDropDownSellectUserSonuc.getText(), ConfigReader.getProperty("HtlRmRsrvPage_UserSellectDropDown_valid_User"));
        extentTest.pass("HotelRoomReservationPage search with UserSellectDropDown testi basariliyla gerceklestirildi");
        Driver.closeDriver();


    }

    @Test
    public void tc004() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "Price ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox).perform();
        us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_PriceTextBox_valid_Price"));
        extentTest.info("Price Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBoxSonuc.isDisplayed());
        extentTest.pass("HotelRoomReservationPage search with Price testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        // Assert.assertTrue(hotelRoomManagementPage.otelOdasiKaydedildiYazisi.isDisplayed());
        //        hotelRoomManagementPage.okbutonu.click();
        //us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_PriceTextBox_valid_Price"));
        //Thread.sleep(2000);
        //us013HotelRoomReservationsPage.searchButton.click();
        //Thread.sleep(3000);
        //Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBoxSonuc.getText(), ConfigReader.getProperty("HtlRmRsrvPage_PriceTextBox_valid_Price"));
        //Driver.closeDriver();


    }

    @Test
    public void tc005() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "DateStart ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");


        actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart).perform();
        //us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_DateStart_valid_Date"));
        us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart.sendKeys("01.15.2021");
        extentTest.info("DateStart Text box'a valid bir data girildi");
        Thread.sleep(3000);
        extentTest.info("3 saniye beklenildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");


        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStartSonuc.isDisplayed());
        extentTest.pass("HotelRoomReservationPage search with DateStar testi basariliyla gerceklestirildi");
        Driver.closeDriver();


    }

    @Test
    public void tc006() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "DateEnd ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");


        actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEnd).perform();
        us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEnd.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_DateEnd_valid_Date"));
        extentTest.info("DateEnd Text box'a valid bir data girildi");
        Thread.sleep(3000);
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEndSonuc.getText(), ConfigReader.getProperty("25.01.2021"));
        extentTest.pass("HotelRoomReservationPage search with DateEnd testi basariliyla gerceklestirildi");
        Driver.closeDriver();


    }

    @Test
    public void tc007() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "AdultAmount ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageAdultAmount.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_AdultAmount_valid_Amount"));
        extentTest.info("AdultAmount Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageAdultAmountSonuc.getText(), "2");
        extentTest.pass("HotelRoomReservationPage search with AdultAmount testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc008() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ChildAmount ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageChildAmount.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ChildAmount_valid_Amount"));
        extentTest.info("ChildAmount Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageChildAmountSonuc.getText(), "2");
        extentTest.pass("HotelRoomReservationPage search with ChildAmount testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);

    }

    @Test
    public void tc009() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ContacNameSurname ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacNameSurname.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacName_valid_Name"));
        extentTest.info("ContacNameSurname Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacNameSurnameSonuc.getText(), "Laura");
        extentTest.pass("HotelRoomReservationPage search with ContacNameSurname testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc010() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ContacPhone ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacPhone.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacPhone_valid_Phone"));
        extentTest.info("ContacPhone Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacPhoneSonuc.getText(), "(407) 555-5555");
        extentTest.pass("HotelRoomReservationPage search with ContacPhone testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);



    }

    @Test
    public void tc011() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ContacEmail ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacEmail.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacEmail_valid_Email"));
        extentTest.info("ContacEmail Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacEmailSonuc.getText(), "can_can@gmail.com");
        extentTest.pass("HotelRoomReservationPage search with ContacEmail testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc012() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ApprovedDropDown ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");


        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageApprovedDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("HtlRmRsrvPage_ApprovedDropDown_valid_TrueFalse"));
        extentTest.info("ApprovedDropDown'in da valid bir data secildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");
        Thread.sleep(3000);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("HtlRmRsrvPage_ApprovedDropDown_valid_TrueFalse"));
        extentTest.pass("HotelRoomReservationPage search with ApprovedDropDown testi basariliyla gerceklestirildi");
        Driver.closeDriver();


    }

    @Test
    public void tc013() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "IsPaidDropDown ile RoomReservation aramasi yapilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        WebElement element = us013HotelRoomReservationsPage.HotelRoomReservationsPageIsPaidDropDown;
        Select obtion = new Select(element);
        List<WebElement> list = obtion.getOptions();
        for (WebElement w : obtion.getOptions()

        ) {

            if (w.getText().equals(ConfigReader.getProperty("HtlRmRsrvPage_IsPaidDropDown_valid_TrueFalse"))) {
                System.out.println("Test pass");
                break;
            }
        }

        extentTest.info("IsPaidDropDown'in da valid bir data secildi");
        extentTest.pass("HotelRoomReservationPage search with IsPaidDropDown testi basariliyla gerceklestirildi");
        // Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageIsPaidDropDown);
        // us013HotelRoomReservationsPage.HotelRoomReservationsPageIsPaidDropDown.click();
        //select.selectByVisibleText(ConfigReader.getProperty("HtlidDropDown_valid_TrueFalseRmRsrvPage_IsPa"));

        // Thread.sleep(3000);
        // us013HotelRoomReservationsPage.searchButton.click();
        //Thread.sleep(3000);
        // Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("HtlidDropDown_valid_TrueFalseRmRsrvPage_IsPa"));
        Driver.closeDriver();


    }

    @Test
    public void tc014() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "RoomReservation sayfasi Excel ile acilabilmeli");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ListofReservations_valid_Type"));
        extentTest.info("ListofReservationsType Text box'a valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");

        Thread.sleep(3000);

        // Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.getText(), "Excel");
        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.getText().contains("Excel"));
        extentTest.pass("HotelRoomReservationPage ListofReservationsType open with Excel testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc015() throws InterruptedException {
        extentTest = extentReports.createTest("CrystalKeyHotels HotelRoomReservation Search", "ListofReservations sayfasinda bir sayfada gozuken rezvs mktr");
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));
        extentTest.info("Kullanici CrystalKeyHotels HotelRoomReservation sayfasina gitti");
        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Valid username girildi");
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Valid password girildi");
        eckHotelsHomePage.logInButton.click();
        extentTest.info("Login butonuna basildi");

        us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsSayfadaGozukmeMktr.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ListofReservations_valid_Page"));
        extentTest.info("ListofReservations sayfasinda bir sayfada listenin gozukme miktari icin valid bir data girildi");
        us013HotelRoomReservationsPage.searchButton.click();
        extentTest.info("Search butonuna basildi");

        Thread.sleep(3000);

        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsSayfadaGozukmeMktr.getText().contains("All"));
        extentTest.pass("ListofReservations sayfasinda bir sayfada listenin gozukme miktari testi basariliyla gerceklestirildi");
        Driver.closeDriver();
        Thread.sleep(3000);


    }

}

