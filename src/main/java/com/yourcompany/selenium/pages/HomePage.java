package com.yourcompany.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHelloWorldPage() {
        driver.get("https://www.google.com"); // Replace with your Hello, World! webpage URL
    }

    public String getGreeting() {
        return driver.findElement(By.tagName("h1")).getText();
    }
}
