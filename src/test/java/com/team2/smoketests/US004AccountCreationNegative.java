package com.team2.smoketests;

import com.team2.pages.RegisterPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class US004AccountCreationNegative {
    @Test
    public void EmptyFullName() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));
        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_password"));
        registerPage.emailBox.sendKeys(ConfigReader.getProperty("mrgstr_email"));
        registerPage.fulNameBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_fullname"));
        registerPage.phoneBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_telnumber"));
        registerPage.ssnBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_SSNnumber"));
        registerPage.drivingLicenceBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_DriverLicence"));
        registerPage.adressBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_Adress"));
        registerPage.workingSecBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_WorkingSector"));
        registerPage.IdCountrydrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_Country"));
        registerPage.IdStatedrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_State"));

        registerPage.saveButon.click();
    }

    @Test
    public void EmptyWorkingSector() {

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
        registerPage.workingSecBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_WorkingSector"));
        registerPage.IdCountrydrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_Country"));
        registerPage.IdStatedrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_State"));

        registerPage.saveButon.click();
    }

    @Test

    public void InvalidAdress() {

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
        registerPage.adressBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_Adress"));
        registerPage.workingSecBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_WorkingSector"));
        registerPage.IdCountrydrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_Country"));
        registerPage.IdStatedrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_State"));

        registerPage.saveButon.click();
    }

    @Test
    public void DortKarakterdenAzUserNameSmokeTest() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_username"));

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

    @Test
    public void KucukharfIcermeyenPassword () {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));

        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_passwordKucukharfsiz"));

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

    @Test
    public void negativeSmokeTest() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));
        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_passwordBuyukharfsiz"));
        registerPage.emailBox.sendKeys(ConfigReader.getProperty("mrgstr_email"));
        registerPage.fulNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_fullname"));
        registerPage.phoneBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_telnumber"));
        registerPage.ssnBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_SSNnumber"));
        registerPage.drivingLicenceBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_DriverLicence"));
        registerPage.adressBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_Adress"));
        registerPage.workingSecBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_WorkingSector"));
        Select select=new Select(registerPage.IdCountrydrobdown);
        select.selectByVisibleText("UnitedStates");
        registerPage.IdCountrydrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_Country"));
        select.selectByVisibleText("Alaska");
        registerPage.IdStatedrobdown.sendKeys(ConfigReader.getProperty("mrgstr_valid_State"));

        registerPage.saveButon.click();
    }

    @Test
    public void rakamsizPassword() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));
        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_passwordRakamsiz"));
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

    @Test
    public void positiveSmokeTest() {

        RegisterPage registerPage =new RegisterPage ();
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        registerPage.ilklogin.click();
        registerPage.createaNewAccount.click();
        registerPage.userNameBox.sendKeys(ConfigReader.getProperty("mrgstr_valid_username"));
        registerPage.passwordBox.sendKeys(ConfigReader.getProperty("mrgstr_invalid_passwordspecialChartersiz"));
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
