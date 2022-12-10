package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/badshah.p/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");

        //Simple Alert
        driver.findElement(By.xpath("//button[@id='accept']")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert text: "+text);
        alert.accept();

        //Prompt Alert
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Alert alert1 = driver.switchTo().alert();
        String t = alert1.getText();
        System.out.println("Prompt Alert: "+t);
        alert1.sendKeys("Badshah");
        alert1.accept();
    }
}