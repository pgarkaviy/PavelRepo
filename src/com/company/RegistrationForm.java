package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 1/28/15.
 */

public class RegistrationForm {
    private static String firstNameXpath = "//input[@name='first_name']";


    public static void open(WebDriver w){
        w.get("http://demoqa.com/registration/");
    }

    public static void setFirstName(WebDriver w, String i){
        WebElement f = w.findElement(By.xpath(firstNameXpath));
        f.sendKeys(i);
    }
    public static String getFirstName(WebDriver w){
        WebElement name = w.findElement(By.xpath(firstNameXpath));
        return name.getText();
    }

}
