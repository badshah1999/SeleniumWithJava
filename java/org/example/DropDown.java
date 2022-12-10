package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * This code will perform all kind of dropdowns actions in a Web page
 */

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
        Select myfruit = new Select(fruits);
        myfruit.selectByVisibleText("Apple");

        //This will display all the other options in a dropdown menu
        List<WebElement> li = myfruit.getOptions();
        for (WebElement w:li) {
            System.out.println(w.getText());
        }
        System.out.println();

        WebElement hero = driver.findElement(By.id("superheros"));
        Select heros = new Select(hero);

        //This will check whether it is enabled multiple select options
        Boolean bool = heros.isMultiple();
        System.out.println("Is this multiple: "+bool);
        heros.selectByValue("bt");
        heros.selectByValue("aq");

        //WebElement ele = heros.getFirstSelectedOption();
        //System.out.println(ele.getText());

        //This is will display all the selected options in a dropdown menu
        List<WebElement> list = heros.getAllSelectedOptions();
        for (WebElement web:list) {
            System.out.println(web.getText());
        }

        /*This will select the language in the dropdown menu list and also will check
          whether it is enabled multiple selectable drop down menu or not
         */
        WebElement lang = driver.findElement(By.xpath("//select[@id='lang']"));
        Select lan = new Select(lang);
        Boolean b = lan.isMultiple();
        System.out.println("Is this multiple: "+b);
        lan.selectByValue("java");

        //This will select the country in the dropdown menu list
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select coun = new Select(country);
        coun.selectByValue("India");
        WebElement s = coun.getFirstSelectedOption();
        System.out.println(s.getText());
    }
}