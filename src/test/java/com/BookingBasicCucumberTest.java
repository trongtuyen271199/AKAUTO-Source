package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.BasicTest;
import com.utils.Utils;

public class BookingBasicCucumberTest extends BasicTest {
    public void loginTestSuccess()  {
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        LoginPage loginPage=new LoginPage(driver);
        loginPage.enterEmail("trongtuyen451@gmail.com")
        .enterPassword("Admin@123456")
        .enterLogin();
        HomePage homePage=new HomePage(driver);
        homePage.inputSeach("Mercedes");

        CartPage cartPage =new CartPage(driver);
        cartPage.clickOptionOne()
        .clickXuatXu()
        .clickIconPlus()
        .clickAdd()
        .removeProduct();


    }
}
