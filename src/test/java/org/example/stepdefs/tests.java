package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_HomePage;
import org.example.pages.P02_LoginPage;

public class tests {
    P01_HomePage homePage = new P01_HomePage(Hooks.driver);
    P02_LoginPage loginPage = new P02_LoginPage(Hooks.driver);

    @Given("user go to login page")
    public void userGoToLoginPage(){
        homePage.closeCookiesWindow();
        homePage.clickLoginPage();
    }

    @When("user login with valid phoneNumber {string} and password {string}")
    public void userLoginWithValidPhoneNumberAndPassword(String arg0, String arg1) {
        loginPage.login(arg0,arg1);
    }


    @And("add first product to cart")
    public void addFirstProductToCart() {
        homePage.addFirstProduct();
        Hooks.driver.navigate().back();
    }

    @And("add second product to cart")
    public void addSecondProductToCart() {
        homePage.addSecondProduct();
        Hooks.driver.navigate().back();
    }

    @Then("search for product name {string}")
    public void searchForProductName(String arg0) {
        homePage.searchForProduct(arg0);

    }

    @Then("add result product to cart")
    public void addResultProductToCart() {
        homePage.addResultProductToCart();

    }

    @Then("go to cart page")
    public void goToCartPage() throws InterruptedException {
        homePage.clickCartPage();
        Thread.sleep(5000);

    }


}
