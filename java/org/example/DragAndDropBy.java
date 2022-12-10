package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Point class will get the locations in an integer datatype
        Point point = drag.getLocation();
        int x = point.getX();
        int y = point.getY();
        System.out.println(x+","+y);
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(drag,x+40,y+50).perform();
    }
}