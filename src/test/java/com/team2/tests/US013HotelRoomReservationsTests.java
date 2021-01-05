package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.pages.US013HotelRoomReservationsPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US013HotelRoomReservationsTests {

    @Test
    public void tc001() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.IdTextbox.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_valid_Id"));
        Thread.sleep(3000);
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.IdTextboxSonuc.getText(), "18");

        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc002() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();


        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageHtlRmSellectDropDown);
        select.selectByValue("69");
        Thread.sleep(2000);
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageHtlRmSellectDropDownSonuc.getText(), ConfigReader.getProperty("HtlRmRsrvPage_SellectDropDown_valid_HotelRoomIsmi"));

        Driver.closeDriver();
    }

    @Test
    public void tc003() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageUserSellectDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("HtlRmRsrvPage_UserSellectDropDown_valid_User"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageUserSellectDropDownSellectUserSonuc.getText(), ConfigReader.getProperty("HtlRmRsrvPage_UserSellectDropDown_valid_User"));

        Driver.closeDriver();


    }

    @Test
    public void tc004() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();


        // actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox).perform();
        us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_PriceTextBox_valid_Price"));
        Thread.sleep(2000);
        //us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.sendKeys("500");
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.getText().contains("500"));
        //Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPagePriceTextBox.getText(), ConfigReader.getProperty("HtlRmRsrvPage_PriceTextBox_valid_Price"));

        Driver.closeDriver();


    }

    @Test
    public void tc005() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();


        actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart).perform();
        //us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_DateStart_valid_Date"));
        us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStart.sendKeys("01.15.2021");
        Thread.sleep(3000);
        us013HotelRoomReservationsPage.searchButton.click();


        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateStartSonuc.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void tc006() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();


        actions.click(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEnd).perform();
        us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEnd.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_DateEnd_valid_Date"));
        Thread.sleep(3000);
        us013HotelRoomReservationsPage.searchButton.click();


        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageDateEndSonuc.getText(), ConfigReader.getProperty("25.01.2021"));

        Driver.closeDriver();


    }

    @Test
    public void tc007() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageAdultAmount.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_AdultAmount_valid_Amount"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageAdultAmountSonuc.getText(), "2");

        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc008() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageChildAmount.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ChildAmount_valid_Amount"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageChildAmountSonuc.getText(), "2");

        Driver.closeDriver();
        Thread.sleep(3000);

    }

    @Test
    public void tc009() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacNameSurname.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacName_valid_Name"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacNameSurnameSonuc.getText(), "Laura");

        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc010() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacPhone.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacPhone_valid_Phone"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacPhoneSonuc.getText(), "(407) 555-5555");

        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc011() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageContacEmail.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ContacEmail_valid_Email"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageContacEmailSonuc.getText(), "can_can@gmail.com");

        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc012() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();


        Select select = new Select(us013HotelRoomReservationsPage.HotelRoomReservationsPageApprovedDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("HtlRmRsrvPage_ApprovedDropDown_valid_TrueFalse"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), ConfigReader.getProperty("HtlRmRsrvPage_ApprovedDropDown_valid_TrueFalse"));
        Driver.closeDriver();


    }

    @Test
    public void tc013() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

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

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ListofReservations_valid_Type"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        // Assert.assertEquals(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.getText(), "Excel");
        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsType.getText().contains("Excel"));
        Driver.closeDriver();
        Thread.sleep(3000);


    }

    @Test
    public void tc015() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        US013HotelRoomReservationsPage us013HotelRoomReservationsPage = new US013HotelRoomReservationsPage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_admin_hotel_reservations_url"));

        eckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        eckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        eckHotelsHomePage.logInButton.click();

        us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsSayfadaGozukmeMktr.sendKeys(ConfigReader.getProperty("HtlRmRsrvPage_ListofReservations_valid_Page"));
        us013HotelRoomReservationsPage.searchButton.click();
        Thread.sleep(3000);

        Assert.assertTrue(us013HotelRoomReservationsPage.HotelRoomReservationsPageListofReservationsSayfadaGozukmeMktr.getText().contains("All"));

        Driver.closeDriver();
        Thread.sleep(3000);


    }

}

