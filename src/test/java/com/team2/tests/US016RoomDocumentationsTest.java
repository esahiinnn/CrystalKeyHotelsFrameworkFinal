package com.team2.tests;

import com.team2.pages.RoomDocumentationsPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US016RoomDocumentationsTest extends TestBaseRapor {

    @Test
    public void excelDownloudTest() throws InterruptedException {

        RoomDocumentationsPage roomDocumentationsPage=new RoomDocumentationsPage();
        extentTest=extentReports.createTest("RoomDocumentationsTest","Otel odasi rezervasyonu dokümantasyonu istenilen dosya tipinde indirilebilir olmalidir");
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        extentTest.info("Crystalkeyhotels  anasayfasına gidin");
        roomDocumentationsPage.loginSignin.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        extentTest.info("Username TextBox 'ına valid bir username girin");
        roomDocumentationsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        extentTest.info("Password TextBox'ına valid bir password girin");
        roomDocumentationsPage.loginHome.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.hotelManagement.click();
        extentTest.info("HotelManagement tıklayın");
        roomDocumentationsPage.roomReservations.click();
        extentTest.info("RoomReservation tıklayın");
        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Excel");
        extentTest.info("Roomdocumen dropdownunda excel seceneğini secin");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        extentTest.info("Download butonuna tıklayın");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.xlsx";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(dosyaVarmi);
        extentTest.pass("Dosyanın bilgisayarınızda oldugu test edildi");


    }

    @Test
    public void csvDownloudTest() throws InterruptedException {
        RoomDocumentationsPage roomDocumentationsPage=new RoomDocumentationsPage();
        extentTest=extentReports.createTest("RoomDocumentationsTest","Otel odasi rezervasyonu dokümantasyonu istenilen dosya tipinde indirilebilir olmalidir");
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        extentTest.info("Crystalkeyhotels  anasayfasına gidin");
        roomDocumentationsPage.loginSignin.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        extentTest.info("Username TextBox 'ına valid bir username girin");
        roomDocumentationsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        extentTest.info("Password TextBox'ına valid bir password girin");
        roomDocumentationsPage.loginHome.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.hotelManagement.click();
        extentTest.info("HotelManagement tıklayın");
        roomDocumentationsPage.roomReservations.click();
        extentTest.info("RoomReservation tıklayın");
        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Csv");
        extentTest.info("Roomdocumen dropdownunda excel seceneğini secin");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        extentTest.info("Download butonuna tıklayın");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.csv";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(dosyaVarmi);
        extentTest.pass("Dosyanın bilgisayarınızda oldugu test edildi");


    }

    @Test
    public void pdfDownloudTest() throws InterruptedException {

        RoomDocumentationsPage roomDocumentationsPage=new RoomDocumentationsPage();
        extentTest=extentReports.createTest("RoomDocumentationsTest","Otel odasi rezervasyonu dokümantasyonu istenilen dosya tipinde indirilebilir olmalidir");
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        extentTest.info("Crystalkeyhotels  anasayfasına gidin");
        roomDocumentationsPage.loginSignin.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        extentTest.info("Username TextBox 'ına valid bir username girin");
        roomDocumentationsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        extentTest.info("Password TextBox'ına valid bir password girin");
        roomDocumentationsPage.loginHome.click();
        extentTest.info("Login butonuna basın");
        roomDocumentationsPage.hotelManagement.click();
        extentTest.info("HotelManagement tıklayın");
        roomDocumentationsPage.roomReservations.click();
        extentTest.info("RoomReservation tıklayın");
        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Pdf");
        extentTest.info("Roomdocumen dropdownunda excel seceneğini secin");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        extentTest.info("Download butonuna tıklayın");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.pdf";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));

        Assert.assertTrue(dosyaVarmi);
        extentTest.pass("Dosyanın bilgisayarınızda oldugu test edildi");


    }
}
