package com.team2.smoketests;

import com.team2.pages.CrysHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogin {

    @Test
    public void positiveLogin1(){

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        crysHotelHomePage.loginButonu.click();

        String adminUrl=Driver.getDriver().getCurrentUrl();
        String expntUrl="http://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
        Assert.assertTrue(adminUrl.contains(expntUrl));

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(crysHotelHomePage.logut).perform();
        crysHotelHomePage.logutTikle.click();


        Driver.closeDriver();


    }
    @Test
    public void positiveLogin2(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username2"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password2"));
        crysHotelHomePage.loginButonu.click();

        String adminUrl=Driver.getDriver().getCurrentUrl();
        String expntUrl="http://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
        Assert.assertTrue(adminUrl.contains(expntUrl));
        Driver.closeDriver();


    }
    @Test
    public void positiveLogin3(){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username3"));
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password3"));
        crysHotelHomePage.loginButonu.click();

        String adminUrl=Driver.getDriver().getCurrentUrl();
        String expntUrl="http://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
        Assert.assertTrue(adminUrl.contains(expntUrl));

        Driver.closeDriver();
    }

}
