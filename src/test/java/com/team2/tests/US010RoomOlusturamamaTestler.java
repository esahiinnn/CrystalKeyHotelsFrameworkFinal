package com.team2.tests;

import com.team2.pages.US010RoomOlusturamamaHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import com.team2.utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US010RoomOlusturamamaTestler extends TestBaseRapor {

    @Test
    public void us10idHotelsizRoomOlusturamama()  {
        //IdHotel bos.
        extentTest= extentReports.createTest("us10idHotelsizRoomOlusturamama","idhotelsiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password yaz");
        //  Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        //  select.selectByIndex(3);
        extentTest.info("idhotel dropdown ini ini bos birak");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code yaz");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        extentTest.info("sayfanin en ustune gel");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.selectHotelHataYazisi.isDisplayed());
        extentTest.info("'select hotel' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();

    }
    @Test
    public void us10CodesuzRoomOlusturamama(){
        //code textbox  bos.
        extentTest= extentReports.createTest("us10CodesuzRoomOlusturamama","codesuz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password yaz");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        //  us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ini bos birak");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        extentTest.info("sayfanin en ustune gel");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.codeHataYazisi.isDisplayed());
        extentTest.info("'code' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();

    }
    @Test
    public void us10NamesizRoomOlusturamama(){
        //name textbox  bos.
        extentTest= extentReports.createTest("us10NamesizRoomOlusturamama","namesiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password yaz");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code yaz");
        //us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ini bos birak");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        extentTest.info("sayfanin en ustune gel");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.nameHataYazisi.isDisplayed());
        extentTest.info("'name' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();

    }
    @Test
    public void us10LocationsizRoomOlusturamama(){
        //Location textbox  bos.
        extentTest= extentReports.createTest("us10LocationsizRoomOlusturamama","locationsiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password yaz");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code yaz");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        // us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ini bos birak");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi gir");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        extentTest.info("sayfanin en ustune gel");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.locationHataYazisi.isDisplayed());
        extentTest.info("'location' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();
    }
    @Test
    public void us10PricesizRoomOlusturamama(){
        //Price textbox  bos.
        extentTest= extentReports.createTest("us10PricesizRoomOlusturamama","pricesiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password gir");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code yaz");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        //  us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ini bos birak");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.priceHataYazisi.isDisplayed());
        extentTest.info("'price' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();
    }
    @Test
    public void us10RoomTypesizRoomOlusturamama(){
        //Room type textbox  bos.
        extentTest= extentReports.createTest("us10RoomTypesizRoomOlusturamama","roomtypesiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password yaz");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code yaz");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        // Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        // select1.selectByIndex(2);
        extentTest.info("roomtype dropdown ini bos birak ");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.roomTypeHataYazisi.isDisplayed());
        extentTest.info("'roomtype' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();
    }
    @Test
    public void us10MaxAdultCountsizRoomOlusturamama(){
        //maxAdultCount textbox  bos.
        extentTest= extentReports.createTest("us10MaxAdultCountsizRoomOlusturamama","MaxAdultCountsiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password gir");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code gir");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        // us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        extentTest.info("maxAdultCount textbox ini bos birak");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.maxAdultCountHataYazisi.isDisplayed());
        extentTest.info("'MaxAdultCount' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();
    }
    @Test
    public void us10MaxChildCountsizRoomOlusturamama(){
        //maxChildCount textbox  bos.
        extentTest= extentReports.createTest("us10maxChildCountsizRoomOlusturamama","maxChildCountsiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password gir");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code gir");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        //   us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        extentTest.info("maxChildCount textbox ini bos birak");
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretle");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Assert.assertTrue(us010RoomOlusturamamaHomePage.maxChildCountHataYazisi.isDisplayed());
        extentTest.info("'maxChildCount' hata yazisini gor");
        extentTest.pass("room olusmadi,test pass");
        Driver.closeDriver();
    }
    @Test
    public void approvedsuzRoomOlusturamama() throws InterruptedException {
        //Approved kutucugu secili degil
        extentTest= extentReports.createTest("us10ApprovedsizRoomOlusturamama","Approvedsiz room olusmadigini test ettik");
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        extentTest.info("login ekraninda valid username ve password gir");
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        extentTest.info("idhotel dropdown indan hotel sec");
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("fvalid_code"));
        extentTest.info("code texbox ina code gir");
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("fvalid_name"));
        extentTest.info("name textbox ina name yaz");
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("fvalid_location"));
        extentTest.info("location textbox ina location yaz");
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("fvalid_price"));
        extentTest.info("price textbox ina price yaz");
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        extentTest.info("roomtype dropdown indan roomtype sec");
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_adultCount"));
        extentTest.info("maxAdultCount textbox ina sayi yaz");
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("fvalid_childcount"));
        extentTest.info("maxChildCount textbox ina sayi yaz");
        // us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        extentTest.info("approve kutucugunu isaretleme");
        us010RoomOlusturamamaHomePage.saveButonu.click();
        extentTest.info("save butonuna click yap");
        Thread.sleep(5000);
        extentTest.info("5 saniye bekle");
        extentTest.info("'hotel olusturuldu' yazisini gor");
        extentTest.info("room olustu,test failed");
        Assert.assertFalse(us010RoomOlusturamamaHomePage.succesYazisi.isDisplayed());
        Driver.closeDriver();
    }










}


