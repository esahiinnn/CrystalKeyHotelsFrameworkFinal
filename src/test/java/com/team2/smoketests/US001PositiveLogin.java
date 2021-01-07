package com.team2.smoketests;

import com.team2.pages.CrysHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US001PositiveLogin extends TestBaseRapor {

    @Test
    public void positiveLogin1(){
        extentTest=extentReports.createTest("CHotel hotel login test","Valid datalarla sayfaya login yapilabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("Anasayfaya basarili bir sekilde gidildi");
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username1"));
        extentTest.info("Ussername box a valid bir data girildi");
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password1"));
        extentTest.info("Password box a valid bir data girildi");
        crysHotelHomePage.loginButonu.click();
        extentTest.pass("Valid datalarla basarili bir sekilde siteye giris yapildi");


        String adminUrl=Driver.getDriver().getCurrentUrl();
        String expntUrl="https://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
        Assert.assertTrue(adminUrl.contains(expntUrl));
        extentTest.info("Test basarili bir sekilde kontrol edildi sayfaya giris URL i ne ulasildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(crysHotelHomePage.logut).perform();
        crysHotelHomePage.logutTikle.click();
        extentTest.info("Sayfadan basarili bir sekilde cikis yapildi");


        Driver.closeDriver();


    }
    @Test
    public void positiveLogin2(){
        extentTest=extentReports.createTest("CHotel login test","Valid datalarla sayfaya login yapilabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        extentTest.info("Anasayfaya basarili bir sekilde gidildi");
        CrysHotelsHomePage crysHotelHomePage=new CrysHotelsHomePage();
        crysHotelHomePage.girislogin.click();
        crysHotelHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_username2"));
        extentTest.info("Ussername box a valid bir data girildi");
        crysHotelHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password2"));
        extentTest.info("Password box a valid bir data girildi");
        crysHotelHomePage.loginButonu.click();
        

        String adminUrl=Driver.getDriver().getCurrentUrl();
        String expntUrl="https://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
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
        String expntUrl="https://qa-environment.crystalkeyhotels.com/Admin/UserAdmin";
        Assert.assertTrue(adminUrl.contains(expntUrl));

        Driver.closeDriver();
    }

}
