package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class DZ_2_2 {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pgr\\Desktop\\PAVEL AUTOMATION\\1 INSTRUMENTS\\chromedriver_win32\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("https://www.google.com");
        WebElement fie=w.findElement(By.id("gbqfq"));
        fie.sendKeys("как полюбить свое тело и себя");
        WebElement but=w.findElement(By.id("gbqfb"));
        but.click();

        List<WebElement> li = w.findElements(By.tagName("a"));
        int i=0;
        while (i<li.size())
        {
            WebElement a = li.get(i);
            i++;
            System.out.println(a.getAttribute("href"));
        }




        //

    }
}
