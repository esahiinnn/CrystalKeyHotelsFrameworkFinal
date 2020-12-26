package com.team2.tests;

import com.team2.pages.US010RoomOlusturamamaHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US010RoomOlusturamamaTestler {

    @Test
    public void us10idHotelsizRoomOlusturamama()  {
        //IdHotel bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.selectHotelHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10CodesuzRoomOlusturamama(){
        //code textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        // us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.codeHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10namesizRoomOlusturamama(){
        //name textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        // us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.nameHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10LocationsizRoomOlusturamama(){
        //Location textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        // us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.locationHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10PricesizRoomOlusturamama(){
        //Price textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        // us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.priceHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10RoomTypesizRoomOlusturamama(){
        //Room type textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        //Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        //select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.roomTypeHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10MaxAdultCountsizRoomOlusturamama(){
        //maxAdultCount textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        // us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.maxAdultCountHataYazisi.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void us10MaxChildCountsizRoomOlusturamama(){
        //maxChildCount textbox  bos.
        US010RoomOlusturamamaHomePage us010RoomOlusturamamaHomePage=new US010RoomOlusturamamaHomePage();
        us010RoomOlusturamamaHomePage.login();
        Select select=new Select(us010RoomOlusturamamaHomePage.selectHotelDropdown);
        select.selectByIndex(3);
        us010RoomOlusturamamaHomePage.codeTextbox.sendKeys(ConfigReader.getProperty("valid_code"));
        us010RoomOlusturamamaHomePage.nameTextbox.sendKeys(ConfigReader.getProperty("valid_name"));
        us010RoomOlusturamamaHomePage.locationTextbox.sendKeys(ConfigReader.getProperty("valid_location"));
        us010RoomOlusturamamaHomePage.priceTextbox.sendKeys(ConfigReader.getProperty("valid_price"));
        Select select1=new Select(us010RoomOlusturamamaHomePage.roomTypeDropdown);
        select1.selectByIndex(2);
        us010RoomOlusturamamaHomePage.maxAdultCountTextbox.sendKeys(ConfigReader.getProperty("valid_adultCount"));
        // us010RoomOlusturamamaHomePage.maxChildCountTextbox.sendKeys(ConfigReader.getProperty("valid_childcount"));
        us010RoomOlusturamamaHomePage.approvedKutucugu.click();
        us010RoomOlusturamamaHomePage.saveButonu.click();
        Assert.assertTrue(us010RoomOlusturamamaHomePage.maxChildCountHataYazisi.isDisplayed());
        Driver.closeDriver();
    }










}


