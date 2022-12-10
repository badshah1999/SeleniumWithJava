package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * This code will perform the screenshot task on the webpage and web elements
 */
public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Taking ScreenShot of a WebPage
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("/Users/badshah.p/Documents/snaps/img.png");
        FileHandler.copy(file,destination);

        //Screenshot of elements
        WebElement ele = driver.findElement(By.xpath("//input[@id='login-button']"));
        File sec = ele.getScreenshotAs(OutputType.FILE);
        File des = new File("/Users/badshah.p/Documents/snaps/img1.png");
        FileHandler.copy(sec,des);

        //Screenshot of certain blocks
        WebElement el = driver.findElement(By.xpath("//div[@id='login_credentials']"));
        File third = el.getScreenshotAs(OutputType.FILE);
        File dest = new File("/Users/badshah.p/Documents/snaps/img2.png");
        FileHandler.copy(third,dest);
    }
}