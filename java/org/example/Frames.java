package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This codes defines how to switch between frames in a DOM
 */

public class Frames {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        WebElement frames = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
        driver.switchTo().frame(frames);
        driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("badshah");
        driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("Khan");
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("baasha303@gmail.com");
        Thread.sleep(2000);

        //Return to parent frame
        driver.switchTo().parentFrame();

        //Return to the main page
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
    }
}
