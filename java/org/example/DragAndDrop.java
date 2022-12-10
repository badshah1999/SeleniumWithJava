package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * This code will perform the drag and drop function
 */

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        //Switching to the first frame of DOM
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(source,destination).build().perform();
    }
}