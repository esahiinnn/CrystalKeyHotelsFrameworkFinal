package com.team2.smoketests;

import com.team2.pages.RoomDocumentationsPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class RoomDocumentationsTest {


    RoomDocumentationsPage roomDocumentationsPage=new RoomDocumentationsPage();

    @BeforeClass
    public void RoomReservations(){
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        roomDocumentationsPage.loginSignin.click();
        roomDocumentationsPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        roomDocumentationsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        roomDocumentationsPage.loginHome.click();
        roomDocumentationsPage.hotelManagement.click();
        roomDocumentationsPage.roomReservations.click();

    }
    @Test
    public void excelDownloudTest() throws InterruptedException {

        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Excel");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.xlsx";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(dosyaVarmi);


    }

    @Test
    public void csvDownloudTest() throws InterruptedException {

        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Csv");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.csv";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(dosyaVarmi);


    }

    @Test
    public void pdfDownloudTest() throws InterruptedException {
        Select select=new Select(roomDocumentationsPage.documenDropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Pdf");
        Thread.sleep(2000);
        roomDocumentationsPage.downloadButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        String homePath = System.getProperty("user.home");
        String filePath = homePath + "\\Downloads\\Admin - List Of Reservations.pdf";
        boolean dosyaVarmi = Files.exists(Paths.get(filePath));

        Assert.assertTrue(dosyaVarmi);


    }



}
