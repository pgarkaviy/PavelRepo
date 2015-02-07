package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * My first WebDriver //
 */   
public class DZ_2_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pgr\\Desktop\\PAVEL AUTOMATION\\1 INSTRUMENTS\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("https://google.com");

        WebElement i = a.findElement(By.id("gbqfq"));
        i.sendKeys("qa factory");
        WebElement n = a.findElement(By.name("btnG"));
        n.click();
        Thread.sleep(1000);
        WebElement s = a.findElement(By.id("ires"));
        List<WebElement> l = s.findElements(By.tagName("a"));
        WebElement f = l.get(0);
        if(f.getText().equals("QA Factory")){
            System.out.println("Test name: passed");
        }
        else {
            System.out.println("Test name: failed");
        }
        if(f.getAttribute("href").equals("http://qafactory.com.ua/")) {
            System.out.println("Test url: passed");
        }
        else {
            System.out.println("Test url: failed");
        }

        a.quit();
    }
}
