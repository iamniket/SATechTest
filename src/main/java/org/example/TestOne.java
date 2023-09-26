package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOne{
    WebDriver driver;

    @BeforeTest

    public void Initialise()
    {
        driver = new ChromeDriver();
        driver.get("https://www.tendable.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test

    public void ValidateTest(){
        ScreenObject screen = new ScreenObject(driver);
        screen.setTendableImage();
        screen.setOurStory();
        screen.setOurSolution();
        screen.setWhyTendable();
        screen.setContactUs();
        screen.setFormDetails();
        screen.validateErrorMesssage();

    }


    @AfterTest
    public void TearDown()
    {
        driver.quit();
    }
}
