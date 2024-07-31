package org.example.stepdefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.get("https://eshop.vodafone.com.eg/en/");
        driver.manage().deleteAllCookies();

//        driver.navigate().to("https://eshop.vodafone.com.eg/en/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    }

    @After
    public void wrapUp(){
        driver.close();
    }
}
