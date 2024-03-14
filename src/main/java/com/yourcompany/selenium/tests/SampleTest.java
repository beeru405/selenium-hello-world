package com.yourcompany.selenium.tests;

import com.yourcompany.selenium.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    private WebDriver driver;
    private HomePage homePage;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    public void sampleTest() {
        // Navigate to the Hello, World! webpage
        homePage.navigateToHelloWorldPage();

        // Verify the title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Print a greeting from the webpage
        String greeting = homePage.getGreeting();
        System.out.println("Greeting from the Web Page: " + greeting);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        SampleTest test = new SampleTest();
        test.setUp();
        test.sampleTest();
        test.tearDown();
    }
}
