package com.team2.smoketests;

import com.team2.pages.AddHotelPage;
import com.team2.utilities.ConfigReader;
import com.team2.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeAddHotelTest {

    @Test
    public void positiveAddHotelTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("a_anasayfa_URL"));
        AddHotelPage addHotelPage=new AddHotelPage();

        addHotelPage.loginSignin.click();
        addHotelPage.usernameTextBox.sendKeys(ConfigReader.getProperty("a_username"));
        addHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("a_password"));
        addHotelPage.loginHome.click();



        addHotelPage.hotelManagement.click();
        addHotelPage.hotelList.click();
        addHotelPage.addHotel.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.click(addHotelPage.codeTextBox)
                .sendKeys(ConfigReader.getProperty("a_code"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("a_name"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("a_adress"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("a_phone_wrong"))
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("a_email"))
                .perform();
        Thread.sleep(2000);
        Select select=new Select(addHotelPage.dropdownIDGroup);
        Thread.sleep(2000);
        select.selectByVisibleText("Hotel Type1");
        actions.click(addHotelPage.save).perform();
        Thread.sleep(2000);

        Assert.assertFalse(addHotelPage.addHotelMessage.isDisplayed());


        Driver.closeDriver();


    }


}
