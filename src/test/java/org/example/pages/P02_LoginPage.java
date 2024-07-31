package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P02_LoginPage extends P00_BasePage {


    public P02_LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By phoneField = By.id("username");
    public void enterPhoneNumber(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    private final By passwordField = By.id("password");
    public void enterPass(String pass){
        driver.findElement(passwordField).sendKeys(pass);
    }

    private final By loginBtn = By.xpath("//*[@id=\"submitBtn\"]");
    public void clickLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void login(String phone, String pass){
        enterPhoneNumber(phone);
        enterPass(pass);
        clickLogin();
    }
}
