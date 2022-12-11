package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This code is used to perform all kind of Input Handlings in Selenium
 */
public class HandlingInputs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //Getting Co-ordinates of button
        WebElement ele = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        Point point = ele.getLocation();
        int x = point.getX();
        int y = point.getY();
        System.out.println("X Value:" +x+" "+"Y Value:"+y);

        //Getting color of the button
        WebElement web = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        String color = web.getCssValue("color");
        System.out.println("Color is:"+color);

        //Getting height and width of the button
        Rectangle rect = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).getRect();
        Dimension dime  = rect.getDimension();
        System.out.println(dime.getHeight());
        System.out.println(dime.getWidth());

        //Check button is enabled
        Boolean bool = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).isEnabled();
        System.out.println(bool);

        driver.close();
    }
}
