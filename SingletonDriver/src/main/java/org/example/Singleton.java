package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Singleton {

    private static Singleton singleton = new Singleton();
    private static WebDriver driver;


    private Singleton()
    {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        ChromeOptions option1=new ChromeOptions();
        option1.addArguments("--start-maximized","--disable-notifications");
        option1.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking","enable-automation"});
        driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(option1).create();

    }

    public static WebDriver getDriverInstance() {

        return driver;
    }



}
