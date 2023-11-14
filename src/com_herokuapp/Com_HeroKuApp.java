package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_HeroKuApp {
    //1. Set up the Multi-Browser
    static String browser = "Chrome";
    // static  String browser = "FireFox";
    //static  String browser = "Edge";
    //Base Url
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    //Launch the Browser
    static WebDriver driver;

    //Instance method with if-else loop
    public void multiBrowserTest() {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
    }

    public static void main(String[] args) {
        //Instance method calling in main method
        Com_HeroKuApp obj = new Com_HeroKuApp();
        obj.multiBrowserTest();

        //2.Open the Url
        driver.get(baseUrl);

        //3.Print the title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //4.Print the current url
        System.out.println("Current page Url : " + driver.getCurrentUrl());

        //5.Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("Welcome");

        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("abc@2023");

        //8.Click on Login Button
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();

        //9.Print the current url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //10.Refresh the page
        driver.navigate().refresh();
        System.out.println("Refresh the page : " + driver.getCurrentUrl());
        
        //11.Close the browser
        driver.quit();
    }
}//Run the program