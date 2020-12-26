package com.team2.smoketests;

import com.team2.pages.CrysHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLogin {


    @Test
    public void validUsernameInvalidPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_password"));
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void InvalidUsernameValidPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_ussername"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void InvalidUsernameInvalidPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_ussername"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("y_Invalid_password"));
        crysHotelHomePage.loginButonu.click();

        Assert.assertTrue(crysHotelHomePage.hataMesaji.isDisplayed());
        Driver.closeDriver();

    }



}
