package com.team2.smoketests;

import com.team2.pages.RegisterPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class US003AccountCreationPositive {


    @Test
    public void positiveSmokeTest() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));
        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_password"));
        registerPage.emailBox.sendKeys(ConfigReader.getProperty("mrgstr_email"));
        registerPage.fulNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_fullname"));
        registerPage.phoneBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_telnumber"));
        registerPage.ssnBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_SSNnumber"));
        registerPage.drivingLicenceBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_DriverLicence"));
        registerPage.adressBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_Adress"));
        registerPage.workingSecBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_WorkingSector"));
        registerPage.IdCountrydrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_Country"));
        registerPage.IdStatedrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_State"));

        registerPage.saveButon.click();
    }
}
