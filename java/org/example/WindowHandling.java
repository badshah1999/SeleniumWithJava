package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * This code will perform the window handlings between two webpages
 */
public class WindowHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/windows");
        String window = driver.getCurrentUrl();
        System.out.println("Parent window:"+window);
        driver.findElement(By.xpath("//button[@id='home']")).click();

        //Set collection will be used in window handling as it won't allow the duplicates
        Set<String> windows = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windows);

        //Switching to the next window tab
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getCurrentUrl());

        //Switching to the previous window tab
        driver.switchTo().window(list.get(0));
        driver.close();

        Set<String> win2 = driver.getWindowHandles();
        list.clear();
        list.addAll(win2);
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getCurrentUrl());
    }
}
