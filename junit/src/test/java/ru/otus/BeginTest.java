package ru.otus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BeginTest {
    static final Logger logger = LogManager.getLogger(BeginTest.class);


    @Before
    public void start(){
        logger.info("Test start");
    }

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

    @After
    public void closeBrowser(){
        logger.info("Test complete");
    }

}
