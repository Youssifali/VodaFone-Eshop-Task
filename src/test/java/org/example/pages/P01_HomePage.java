package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_HomePage extends P00_BasePage {
    private final By cookiesBtn = By.xpath("//*[@id='onetrust-close-btn-container']/button");
    private final By loginPage = By.id("userProfileMenu");
    private final By product1 = By.xpath("//*[@id=\"01HRPTAZTDTVMP1RFG937Y092E\"]/vf-product-box-featured[5]/div/div");
    private final By product2 = By.xpath("//*[@id=\"01HJ6A5VWGMP4S0EMDJ9VT10QJ\"]/vf-product-box-featured[1]/div/div");
    private final By addToCartBtn = By.xpath("//*[text()=' Add To Cart ']");
    private final By addedSuccessfully = By.xpath("/html/body/vf-root/main/section[1]/vf-alert-box/div/div/p");
    private final By searchInput = By.cssSelector("[id='searchInput']");
    private final By product3 = By.xpath("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[4]/div");
    private final By cartPage = By.cssSelector("button[class='cart-btn']");

    public P01_HomePage(WebDriver driver) {
        super(driver);
    }

    public void closeCookiesWindow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(cookiesBtn)).click();

    }

    public void clickLoginPage() {
        driver.findElement(loginPage).click();
    }

    public void addFirstProduct() {
        scrollToBottom();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(product1)).click().build().perform();
        clickAddToCart();
    }

    public void addSecondProduct() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(product2)).click().build().perform();
        clickAddToCart();
    }

    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedSuccessfully));
    }

    public void searchForProduct(String productName) {
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(searchInput)).sendKeys(productName).perform();
    }

    public void addResultProductToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3));
        wait.until(ExpectedConditions.elementToBeClickable(product3)).click();
        clickAddToCart();
    }

    public void clickCartPage() {
        driver.findElement(cartPage).click();
    }
}
