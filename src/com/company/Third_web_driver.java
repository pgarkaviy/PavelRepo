package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * List correct translation
 */
public class Third_web_driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("https://translate.google.com/#ru/en");

        String[] input = {"товарищ", "привет", "пока"};
        String[] expected = {"comrade", "hi", "as long as"};
        int j = 0;
        WebElement i = a.findElement(By.id("source"));
        for (j=0; j < input.length; j++){
            i.clear(); // Clear field
            i.sendKeys(input[j]); // Print text
            Thread.sleep(1000);
            String result = a.findElement(By.id("result_box")).getText();
            System.out.println(result);
            if(result.equals(expected[j])){
               System.out.println("Test passed");

            }
            else{
               System.out.println("Test failed");
            }
        }

       a.quit();

    }
}