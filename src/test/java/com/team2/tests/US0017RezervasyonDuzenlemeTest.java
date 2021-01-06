package com.team2.tests;

import com.team2.pages.CkHotelsHomePageHS;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class US0017RezervasyonDuzenlemeTest extends TestBaseRapor {

    @Test
    public void generalDataDuzenlemeTesti() throws InterruptedException {

        extentTest=extentReports.createTest("General data duzenleme testi","Otel duzenleme sayfasindaki General Data bolumundeki datalari degistirip kaydedebilmeliyim");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        extentTest.info("Valid user name girildi");
        extentTest.info("Valid user password girildi");
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        ckHotelsHomePage.hotelListText.click();
        ckHotelsHomePage.hotelDetail.click();

        Set<String> tumHandleKumesi=Driver.getDriver().getWindowHandles();

        String ikincisayfaWindowHandle="";

        for (String w: tumHandleKumesi
        ) {
            if (!w.equals(ilkSayfaWindowHandle)){
                ikincisayfaWindowHandle=w;
            }
        }
        Driver.getDriver().switchTo().window(ikincisayfaWindowHandle);
        ckHotelsHomePage.codeText.clear();
        ckHotelsHomePage.codeText.sendKeys(ConfigReader.getProperty("h_generalData_codeText"));
        extentTest.info("Code Text Box'a data girildi");

        ckHotelsHomePage.nameText.clear();
        ckHotelsHomePage.nameText.sendKeys(ConfigReader.getProperty("h_generalData_NameText"));
        extentTest.info("Name Text Box'a data girildi");

        ckHotelsHomePage.addressText.clear();
        ckHotelsHomePage.addressText.sendKeys(ConfigReader.getProperty("h_generalData_AddressText"));
        extentTest.info("Address Text Box'a data girildi");

        ckHotelsHomePage.phoneText.clear();
        ckHotelsHomePage.phoneText.sendKeys(ConfigReader.getProperty("h_generalData_PhoneText"));
        extentTest.info("Phone Text Box'a data girildi");

        ckHotelsHomePage.emailText.clear();
        ckHotelsHomePage.emailText.sendKeys(ConfigReader.getProperty("h_generalData_EmailText"));
        extentTest.info("E-mail Text Box'a data girildi");


        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select = new Select(ckHotelsHomePage.hotelDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("h_hotel_type"));
        extentTest.info("Group dropdown menusunden secim yapildi");

        ckHotelsHomePage.saveButton.click();
        extentTest.info("Save butonuna basildi");

        Thread.sleep(3000);
        String updateMessage=ckHotelsHomePage.updateSuccessfullyText.getText();

        Thread.sleep(3000);

        Assert.assertEquals(updateMessage,ConfigReader.getProperty("h_hotelUpdate_successMessage"));
        extentTest.pass("Hotel was updated successfully mesaji görüntülendi");

        Driver.closeDriver();
        }
    @Test
    public void otelOdasíSilmeTesti() throws InterruptedException {

        extentTest=extentReports.createTest("Otel odasi silme testi","Otel duzenleme sayfasinda otel odasi silebilmeliyim");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        extentTest.info("Valid user name girildi");
        extentTest.info("Valid user password girildi");
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        ckHotelsHomePage.roomDetail.click();
        extentTest.info("Silinmek istenen odanin details butonuna basildi");
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        ckHotelsHomePage.deleteRoom.click();
        extentTest.info("Delete butonuna basildi");

        Thread.sleep(2000);

        String onayUrl= Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(onayUrl.equals(ConfigReader.getProperty("h_onay_url")));
        extentTest.pass("Hotel Room successfully deleted mesaji goruntulendi");
        ckHotelsHomePage.okButton.click();

        Driver.closeDriver();

    }
    @Test
    public void propertyEkleme() throws InterruptedException {

        extentTest=extentReports.createTest("Property ekleme testi","Otel duzenleme sayfasinda Properties bolumunde property ekleyebilmeliyim");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        extentTest.info("Valid user name girildi");
        extentTest.info("Valid user password girildi");
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        ckHotelsHomePage.hotelListText.click();
        extentTest.info("Hotel List'e tiklandi");
        ckHotelsHomePage.hotelDetail.click();
        extentTest.info("Property eklenecek otelin deails butonuna basildi");

        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();

        Set<String> tumHandleKumesi= Driver.getDriver().getWindowHandles();

       String ikincisayfaWindowHandle="";
        for (String w: tumHandleKumesi
        ) {
            if (!w.equals(ilkSayfaWindowHandle)){
                ikincisayfaWindowHandle=w;
            }
        }
        Driver.getDriver().switchTo().window(ikincisayfaWindowHandle);

        ckHotelsHomePage.propertiesLink.click();
        extentTest.info("Properties linkine tiklandi");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        WebElement dropdown=ckHotelsHomePage.otelPropertiesDropdown;
        Select select = new Select(dropdown);
        select.selectByVisibleText(ConfigReader.getProperty("h_hotel_propery"));
        extentTest.info("Tip dropdown menusunden secim yapildi");

        ckHotelsHomePage.codePropertyTextBox.sendKeys(ConfigReader.getProperty("h_generalData_codeText"));
        extentTest.info("Code text Box'a data girildi");
        ckHotelsHomePage.valuePropertyTextBox.sendKeys(ConfigReader.getProperty("h_generalData_value"));
        extentTest.info("Value text Box'a data girildi");

        Thread.sleep(2000);

        ckHotelsHomePage.savePropertyButton.click();
        extentTest.info("Save butonuna basildi");

        Thread.sleep(3000);

        String addValueMessage= ckHotelsHomePage.addValueMessage.getText();
        System.out.println(addValueMessage);
        String expectedMessage=ConfigReader.getProperty("h_value_added");
        System.out.println(expectedMessage);


        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(addValueMessage.equals(expectedMessage));
        extentTest.pass("Value added mesaji goruntulendi");

        softAssert.assertAll();

        Driver.closeDriver();
    }
    @Test
    public void otelPropertyGuncellemeTesti() throws InterruptedException {
        extentTest=extentReports.createTest("Otel odasi silme testi","Otel duzenleme sayfasinda otel odasi silebilmeliyim");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        extentTest.info("Valid user name girildi");
        extentTest.info("Valid user password girildi");
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        ckHotelsHomePage.hotelListText.click();
        extentTest.info("Hotel List'e tiklandi");
        ckHotelsHomePage.hotelDetail.click();
        extentTest.info("Property'si duzenlenmek istenen hotel details'e tiklandi");

        String ilkSayfaWindow= Driver.getDriver().getWindowHandle();

        Set<String> sayfalarWindow= Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindow="";

        for (String w:sayfalarWindow
        ) {
            if (!w.equals(ilkSayfaWindow)) {
                ikinciSayfaWindow=w;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindow);
        ckHotelsHomePage.propertiesLink.click();
        extentTest.info("Properties linkine basildi");
        Thread.sleep(1000);
        ckHotelsHomePage.propertyCodeTextBox.clear();
        ckHotelsHomePage.propertyCodeTextBox.sendKeys(ConfigReader.getProperty("h_generalData_codeText"));
        extentTest.info("Code Text Box'a data girildi");
        Thread.sleep(1000);
        ckHotelsHomePage.propertyValueTextBox.clear();
        ckHotelsHomePage.propertyValueTextBox.sendKeys(ConfigReader.getProperty("h_generalData_value"));
        extentTest.info("Value Text Box'a data girildi");
        ckHotelsHomePage.propertyUpdateButton.click();
        extentTest.info("Update butonuna basildi");
        Thread.sleep(1000);

        String propertyUpdatePopupText=ConfigReader.getProperty("h_valueUpdate_successMessage");
        String expectedPopUpText=ckHotelsHomePage.propertyUpdatePopupText.getText();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(propertyUpdatePopupText.equals(expectedPopUpText));
        extentTest.pass("Value was updated Succesfully mesaji goruntulendi");

        softAssert.assertAll();

        Driver.closeDriver();
    }
    @Test
    public void otelPropertyRemoveTesti() throws InterruptedException {

        extentTest=extentReports.createTest("Otel odasi silme testi","Otel duzenleme sayfasinda otel odasi silebilmeliyim");

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        extentTest.info("CrystalKeyHotels Room Admin sayfasina gidildi");
        extentTest.info("Valid user name girildi");
        extentTest.info("Valid user password girildi");
        extentTest.info("Login butonuna basildi");
        extentTest.info("Ck hotels sitesine login olundu");

        ckHotelsHomePage.hotelListText.click();
        extentTest.info("Hotel List'e tiklandi");
        ckHotelsHomePage.hotelDetail.click();
        extentTest.info("Property'si duzenlenmek istenen hotel details'e tiklandi");

        String ilkSayfaWindow= Driver.getDriver().getWindowHandle();

        Set<String> sayfalarWindow= Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindow="";

        for (String w:sayfalarWindow
        ) {
            if (!w.equals(ilkSayfaWindow)) {
                ikinciSayfaWindow=w;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindow);
        ckHotelsHomePage.propertiesLink.click();
        extentTest.info("Properties linkine basildi");
        ckHotelsHomePage.removeProperty.click();
        extentTest.info("Remove butonuna basildi");

        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);
        softAssert.assertTrue(ckHotelsHomePage.popUpOnay.isDisplayed());

        ckHotelsHomePage.okButton.click();

        Thread.sleep(1000);

        String mesaj = ckHotelsHomePage.valueDeletedMessage.getText();
        String expectedMessage= ConfigReader.getProperty("h_valueDelete_successMessage");

        softAssert.assertTrue(mesaj.equals(expectedMessage));
        extentTest.pass("Value was deleted Succesfully mesaji goruntulendi");

        softAssert.assertAll();

        Driver.closeDriver();
    }
}



