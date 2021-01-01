package com.team2.smoketests;

import com.team2.pages.CrysHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US002NegativeLogin extends TestBaseRapor {


    @Test
    public void validUsernameInvalidPassword(){
        extentTest=extentReports.createTest("ck hotel negative login", "Invalid datalar girdigimde sayfaya login olmamali");
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("Anasayfaya basari bir sekilde gidilidi");
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Ussername box a valid bir username ile girildi");
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_password"));
        extentTest.info("Password box a invalid bir password girildi");
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        extentTest.pass("Test basarili bir sekilde kontrol edildi ve valid datalarla siteye giris yapilamadi");
        Driver.closeDriver();
    }
    @Test
    public void InvalidUsernameValidPassword(){
        extentTest=extentReports.createTest("ck hotel negative login","Invalid datalar girdigimde sayfaya login olmamali");
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("Anasayfaya basarili bir sekilde gidildi");
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_ussername"));
        extentTest.info("Ussername box a invalid bir username girildi");
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Password test box a valid bir password girildi");
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        extentTest.pass("Test basarili bir sekilde kontrol edildi ve valid datalarla siteye giris yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void InvalidUsernameInvalidPassword(){
        extentTest=extentReports.createTest("ck hotel negative login","Invalid datalar girdigimide sayfaya giris yapilamammli");
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("Anasayfaya basarili bir sekilde gidildi");
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_ussername"));
        extentTest.info("Ussername text box a Invalid bir ussername girildi");
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_password"));
        extentTest.info("Password test box a valid bir password girildi");
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        extentTest.pass("Test basarili bir sekilde kontrol edildi ve valid datalarla siteye giris yapilamadi");
        Driver.closeDriver();

    }



}
