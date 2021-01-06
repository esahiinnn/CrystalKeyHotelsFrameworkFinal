package com.team2.smoketests;

import com.team2.pages.AddHotelPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US006PositiveAddHotelTest extends TestBaseRapor {

    @Test
    public void positiveAddHotelTest() throws InterruptedException {

        AddHotelPage addHotelPage=new AddHotelPage();
        extentTest=extentReports.createTest("PositiveAddHotelTest","Bir web kullanıcısı olarak CrystakkeysHotel sitesindeki HotelList'e Code-Name-Adress-Phone-Email-IDgroup bilgilerini girerek bir hotel ekleyebilmeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        extentTest.info("Crystalkeyhotels  anasayfasına gidin");
        addHotelPage.loginSignin.click();
        extentTest.info("Login butonuna basın");
        addHotelPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        extentTest.info("Username TextBox 'ına valid bir username girin");
        addHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        extentTest.info("Password TextBox'ına valid bir password girin");
        addHotelPage.loginHome.click();
        extentTest.info("Login butonuna basın");
        addHotelPage.hotelManagement.click();
        extentTest.info("HotelManagement tıklayın");
        addHotelPage.hotelList.click();
        extentTest.info("Hotellist tıklayın");
        addHotelPage.addHotel.click();
        extentTest.info("Sağ üstteki AddHotel butonuna tıklayın");
        addHotelPage.codeTextBox.click();
        addHotelPage.codeTextBox.sendKeys(ConfigReader.getProperty("a_code"));
        extentTest.info("CodeTextBox'ına tıklayarak 10001 textini girin");
        addHotelPage.nameTextBox.click();
        addHotelPage.nameTextBox.sendKeys(ConfigReader.getProperty("a_name"));
        extentTest.info("nameTextBox'ına tıklayarak ayse textini girin");
        addHotelPage.adresTextBox.click();
        addHotelPage.adresTextBox.sendKeys(ConfigReader.getProperty("a_adress"));
        extentTest.info("adressTextBox'ına tıklayarak istanbul textini girin");
        addHotelPage.phoneTextBox.click();
        addHotelPage.phoneTextBox.sendKeys(ConfigReader.getProperty("a_phone_onrakam"));
        extentTest.info("phoneTextBox'ına tıklayarak on rakamlı 5550005555 textini girin");
        addHotelPage.emailTextBox.click();
        addHotelPage.emailTextBox.sendKeys(ConfigReader.getProperty("a_email"));
        extentTest.info("emailTextBox'ına tıklayarak ayse@gmail.com textini girin");
        Thread.sleep(2000);
        Select select=new Select(addHotelPage.dropdownIDGroup);
        Thread.sleep(2000);
        select.selectByVisibleText("Hotel Type1");
        extentTest.info("IDGroup'dropdownına tıklayarak hotel type1 isecin");
        addHotelPage.save.click();
        Thread.sleep(2000);
        extentTest.info("save butonuna tıklayın");

        Assert.assertTrue(addHotelPage.addHotelMessage.isDisplayed());
        extentTest.pass("Hotel was inserted successfully mesajı gorulur test basarılı");


        Driver.closeDriver();


    }


    @Test
    public void negativeAddHotelTest() throws InterruptedException {

        AddHotelPage addHotelPage=new AddHotelPage();
        extentTest=extentReports.createTest("PositiveAddHotelTest extends","Bir web kullanıcısı olarak CrystakkeysHotel sitesindeki HotelList'e Code-Name-Adress-Phone-Email-IDgroup bilgilerini girerek bir hotel ekleyebilmeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        extentTest.info("Crystalkeyhotels  anasayfasına gidin");
        addHotelPage.loginSignin.click();
        extentTest.info("Login butonuna basın");
        addHotelPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        extentTest.info("Username TextBox 'ına valid bir username girin");
        addHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        extentTest.info("Password TextBox'ına valid bir password girin");
        addHotelPage.loginHome.click();
        extentTest.info("Login butonuna basın");
        addHotelPage.hotelManagement.click();
        extentTest.info("HotelManagement tıklayın");
        addHotelPage.hotelList.click();
        extentTest.info("Hotellist tıklayın");
        addHotelPage.addHotel.click();
        extentTest.info("Sağ üstteki AddHotel butonuna tıklayın");
        addHotelPage.codeTextBox.click();
        addHotelPage.codeTextBox.sendKeys(ConfigReader.getProperty("a_code"));
        extentTest.info("CodeTextBox'ına tıklayarak 10001 textini girin");
        addHotelPage.nameTextBox.click();
        addHotelPage.nameTextBox.sendKeys(ConfigReader.getProperty("a_name"));
        extentTest.info("nameTextBox'ına tıklayarak ayse textini girin");
        addHotelPage.adresTextBox.click();
        addHotelPage.adresTextBox.sendKeys(ConfigReader.getProperty("a_adress"));
        extentTest.info("adressTextBox'ına tıklayarak istanbul textini girin");
        addHotelPage.phoneTextBox.click();
        addHotelPage.phoneTextBox.sendKeys(ConfigReader.getProperty("a_phone_onrakam"));
        extentTest.info("phoneTextBox'ına tıklayarak dokuz rakamlı 555000555 textini girin");
        addHotelPage.emailTextBox.click();
        addHotelPage.emailTextBox.sendKeys(ConfigReader.getProperty("a_email"));
        extentTest.info("emailTextBox'ına tıklayarak ayse@gmail.com textini girin");
        Thread.sleep(2000);
        Select select=new Select(addHotelPage.dropdownIDGroup);
        Thread.sleep(2000);
        select.selectByVisibleText("Hotel Type1");
        extentTest.info("IDGroup'dropdownına tıklayarak hotel type1 isecin");
        addHotelPage.save.click();
        Thread.sleep(2000);
        extentTest.info("save butonuna tıklayın");

        Assert.assertFalse(addHotelPage.addHotelMessage.isDisplayed());
        extentTest.pass("Hotel was inserted successfully mesajı gorulur test basarısız");


        Driver.closeDriver();


    }




}
