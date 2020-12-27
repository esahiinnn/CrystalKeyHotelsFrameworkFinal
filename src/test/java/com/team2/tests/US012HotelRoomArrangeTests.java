
package com.team2.tests;

import com.team2.pages.ECKHotelsAdminPage;
import com.team2.pages.ECKHotelsEditRoomPage;
import com.team2.pages.ECKHotelsHomePage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US012HotelRoomArrangeTests {

    @Test
    public void tc001() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        Select select = new Select(eckHotelsEditRoomPage.hotelDropDown);
        select.selectByVisibleText("UNAL");
        String secilmisSecenek = select.getFirstSelectedOption().getText();

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals( eckHotelsEditRoomPage.successMessage.getText(), ConfigReader.getProperty("e_success_message"));

        Thread.sleep(1000);
        eckHotelsEditRoomPage.okButton.click();

        Thread.sleep(1000);
        Assert.assertEquals(secilmisSecenek, ConfigReader.getProperty("e_id_hotel"));

    }

    @Test
    public void tc002() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.codeTextBox.clear();
        eckHotelsEditRoomPage.codeTextBox.sendKeys("428619");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.codeTextBox.getText(), "428619");

    }

    @Test
    public void tc003() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.nameTextBox.clear();
        eckHotelsEditRoomPage.nameTextBox.sendKeys("UNAL");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.nameTextBox.getText(), "UNAL");

    }

    @Test
    public void tc004() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.priceTextBox.clear();
        eckHotelsEditRoomPage.priceTextBox.sendKeys("300");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        actions.click(eckHotelsEditRoomPage.okButton).sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.priceTextBox.getText(), "300");

    }

    @Test
    public void tc005() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        Select select = new Select(eckHotelsEditRoomPage.roomTypeDropDown);
        select.selectByVisibleText("Quenn");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Quenn");

    }

    @Test
    public void tc006() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.maxAdultCountTextBox.clear();
        eckHotelsEditRoomPage.maxAdultCountTextBox.sendKeys("2");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.maxAdultCountTextBox.getText(), "2");

    }

    @Test
    public void tc007() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.maxChildrenCountTextBox.clear();
        eckHotelsEditRoomPage.maxChildrenCountTextBox.sendKeys("1");

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());

        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertEquals(eckHotelsEditRoomPage.maxChildrenCountTextBox.getText(), "1");

    }

    @Test
    public void tc008() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        eckHotelsEditRoomPage.isAvailableCheckBox.click();

        Thread.sleep(2000);
        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        eckHotelsEditRoomPage.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(eckHotelsEditRoomPage.isAvailableCheckBox.isSelected());

    }

    @Test
    public void tc009() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        ECKHotelsHomePage eckHotelsHomePage = new ECKHotelsHomePage();
        ECKHotelsAdminPage eckHotelsAdminPage = new ECKHotelsAdminPage();
        ECKHotelsEditRoomPage eckHotelsEditRoomPage = new ECKHotelsEditRoomPage();

        eckHotelsEditRoomPage.logInAndSearch();

        actions.click(eckHotelsEditRoomPage.editHotelRoomTitle).sendKeys(Keys.END).perform();

        eckHotelsEditRoomPage.deleteButton.click();
        eckHotelsEditRoomPage.secondOkButton.click();


        Assert.assertEquals(ConfigReader.getProperty("e_success_message"), eckHotelsEditRoomPage.successMessage.getText());
        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();
        Assert.assertFalse(eckHotelsEditRoomPage.isAvailableCheckBox.isSelected());

    }
}

