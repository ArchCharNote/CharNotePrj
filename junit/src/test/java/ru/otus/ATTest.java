package ru.otus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ATTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    @Test
    public void MethodTest() {
        driver.get("http://otus.ru");

    }
    @AfterMethod
    public void clDown() {
        driver.quit();
    }

}
