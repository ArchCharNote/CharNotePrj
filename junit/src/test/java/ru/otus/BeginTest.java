package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeginTest {
    static final Logger logger = LogManager.getLogger(BeginTest.class);





    @Test
    public void Chrome() {
        System.setProperty("webdriver.chrome.driver", "../executable/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://otus.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям"));
    }

    @Test
    public void Firefox() {
        System.setProperty("webdriver.Firefox.driver", "../executable/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://otus.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям"));
    }

    @AfterClass
    public static void afterClass() {
        logger.info("Test complete");
    }

    @AfterMethod
    public void afterMethod() {
        logger.info("Test complete");
    }

}
