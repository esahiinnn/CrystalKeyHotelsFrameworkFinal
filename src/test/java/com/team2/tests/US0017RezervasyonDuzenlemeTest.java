package com.team2.tests;

import com.team2.pages.CkHotelsHomePageHS;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class US0017RezervasyonDuzenlemeTest {

    @Test
    public void generalDataDuzenlemeTesti() throws InterruptedException {

            CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
            ckHotelsHomePage.login();
            String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
            ckHotelsHomePage.hotelListText.click();
            ckHotelsHomePage.hotelDetail.click();

            Set<String> tumHandleKumesi=Driver.getDriver().getWindowHandles();
            //4. adim : kume icerisindeki 2 windowhandle'dan 1 sayfaninkine esit olamayani bulup 2.sayfa olarak tanimlayalim
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
        ckHotelsHomePage.nameText.clear();
        ckHotelsHomePage.nameText.sendKeys(ConfigReader.getProperty("h_generalData_NameText"));
        ckHotelsHomePage.addressText.clear();
        ckHotelsHomePage.addressText.sendKeys(ConfigReader.getProperty("h_generalData_AddressText"));
        ckHotelsHomePage.phoneText.clear();
        ckHotelsHomePage.phoneText.sendKeys(ConfigReader.getProperty("h_generalData_PhoneText"));
        ckHotelsHomePage.emailText.clear();
        ckHotelsHomePage.emailText.sendKeys(ConfigReader.getProperty("h_generalData_EmailText"));


        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select = new Select(ckHotelsHomePage.hotelDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("h_hotel_type"));

        ckHotelsHomePage.saveButton.click();

        Thread.sleep(3000);
        String updateMessage=ckHotelsHomePage.updateSuccessfullyText.getText();
        System.out.println(updateMessage);

        Thread.sleep(3000);
        ckHotelsHomePage.okButton.click();

        Assert.assertEquals(updateMessage,ConfigReader.getProperty("h_hotelUpdate_successMessage"));

        Driver.closeDriver();
        }
    @Test
    public void otelOdasíSilmeTesti() throws InterruptedException {
        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        ckHotelsHomePage.roomDetail.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);

        ckHotelsHomePage.deleteRoom.click();

        Thread.sleep(2000);

        String onayUrl= Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(onayUrl.equals(ConfigReader.getProperty("h_onay_url")));
        ckHotelsHomePage.okButton.click();

        Driver.closeDriver();

    }
    @Test
    public void propertyEkleme() throws InterruptedException {
        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();

        ckHotelsHomePage.hotelListText.click();
        ckHotelsHomePage.hotelDetail.click();

        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();

        Set<String> tumHandleKumesi= Driver.getDriver().getWindowHandles();
        //4. adim : kume icerisindeki 2 windowhandle'dan 1 sayfaninkine esit olamayani bulup 2.sayfa olarak tanimlayalim
        String ikincisayfaWindowHandle="";
        for (String w: tumHandleKumesi
        ) {
            if (!w.equals(ilkSayfaWindowHandle)){
                ikincisayfaWindowHandle=w;
            }
        }
        Driver.getDriver().switchTo().window(ikincisayfaWindowHandle);

        ckHotelsHomePage.propertiesLink.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        WebElement dropdown=ckHotelsHomePage.otelPropertiesDropdown;
        Select select = new Select(dropdown);
        select.selectByVisibleText(ConfigReader.getProperty("h_hotel_propery"));

        ckHotelsHomePage.codePropertyTextBox.sendKeys(ConfigReader.getProperty("h_generalData_codeText"));
        ckHotelsHomePage.valuePropertyTextBox.sendKeys(ConfigReader.getProperty("h_generalData_value"));
        ckHotelsHomePage.savePropertyButton.click();

        Thread.sleep(1000);
        String addValueMessage= ckHotelsHomePage.addValueMessage.getText();

        System.out.println(addValueMessage);
        String expectedMessage=ConfigReader.getProperty("h_value_added");
        System.out.println(expectedMessage);
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(addValueMessage.equals(expectedMessage));
        ckHotelsHomePage.okButton.click();

        softAssert.assertAll();

        Driver.getDriver().quit();
    }
    @Test
    public void otelPropertyGuncellemeTesti() throws InterruptedException {

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        ckHotelsHomePage.hotelListText.click();
        ckHotelsHomePage.hotelDetail.click();

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
        Thread.sleep(1000);
        ckHotelsHomePage.propertyCodeTextBox.clear();
        ckHotelsHomePage.propertyCodeTextBox.sendKeys(ConfigReader.getProperty("h_generalData_codeText"));
        Thread.sleep(1000);
        ckHotelsHomePage.propertyValueTextBox.clear();
        ckHotelsHomePage.propertyValueTextBox.sendKeys(ConfigReader.getProperty("h_generalData_value"));
        ckHotelsHomePage.propertyUpdateButton.click();
        Thread.sleep(1000);

        String propertyUpdatePopupText=ConfigReader.getProperty("h_valueUpdate_successMessage");
        String expectedPopUpText=ckHotelsHomePage.propertyUpdatePopupText.getText();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(propertyUpdatePopupText.equals(expectedPopUpText));

        softAssert.assertAll();

        ckHotelsHomePage.okButton.click();

        Driver.closeDriver();
    }
    @Test
    public void otelPropertyRemoveTesti() throws InterruptedException {

        CkHotelsHomePageHS ckHotelsHomePage = new CkHotelsHomePageHS();
        ckHotelsHomePage.login();
        ckHotelsHomePage.hotelListText.click();

        String birincisayfa= Driver.getDriver().getWindowHandle();

        ckHotelsHomePage.hotelDetail.click();
        Set<String> windowHamdles= Driver.getDriver().getWindowHandles();
        String ikincisayfa = "";

        for (String w:windowHamdles
        ) {
            if(!w.equals(birincisayfa)){
                ikincisayfa=w;
            }
        }
        Driver.getDriver().switchTo().window(ikincisayfa);

        ckHotelsHomePage.properties.click();
        ckHotelsHomePage.removeProperty.click();

        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);
        softAssert.assertTrue(ckHotelsHomePage.popUpOnay.isDisplayed());

        ckHotelsHomePage.okButton.click();

        Thread.sleep(1000);

        String mesaj = ckHotelsHomePage.valueDeletedMessage.getText();
        String expectedMessage= ConfigReader.getProperty("h_valueDelete_successMessage");

        softAssert.assertTrue(mesaj.equals(expectedMessage));

        softAssert.assertAll();

        Driver.closeDriver();
    }
}



