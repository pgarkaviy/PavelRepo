package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 1/23/15.
 */
public class Fourth_web_driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("http://toolsqa.com/automation practice-form/");
        // Finds the element with id content
        WebElement i = a.findElement(By.id("content"));
        // Find the element with tag a, we get all what it is there in the element
        WebElement link1 = i.findElements(By.tagName("a")).get(0);
        // We print the link, by referring to the href attribute
        System.out.println(link1.getAttribute("href"));
        // Enter FirstName
        WebElement inputs = i.findElement(By.name("firstname"));
        inputs.sendKeys("FirstName");
        // Select the continent
        WebElement d = a.findElement(By.id("continents"));
        Select s = new Select(d);
        s.selectByVisibleText("Africa");
        // Select the gender on the page
        WebElement gen = a.findElement(By.id("sex-1"));
        gen.click();

        a.quit();
    }
}