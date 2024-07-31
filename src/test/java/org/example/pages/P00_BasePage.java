package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P00_BasePage {
    protected WebDriver driver;
    public JavascriptExecutor js;

    public P00_BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToBottom() {
        js.executeScript("window.scrollBy(0,2500)");
    }
}
