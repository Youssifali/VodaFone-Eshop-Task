package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
            features = "src/main/resources/features",
            glue = {"org.example.stepdefs"},
            plugin = { "pretty",
                    "html:target/cucumber.html",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt"},
            tags = "@smoke"
    )
public class Runner extends AbstractTestNGCucumberTests {
    }



