package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 1/26/15.
 */
public class Fifth_web_driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        WebDriver a = new ChromeDriver();

        a.get("http://demoqa.com/registration/");

        WebElement name = a.findElement(By.xpath("//input[@name='first_name']"));

        name.sendKeys("Max");

        WebElement lastname = a.findElement(By.xpath("//input[@name='last_name']"));

        lastname.sendKeys("Power");

        WebElement mar_status = a.findElement(By.xpath("//div[@class='radio_wrap']/label[text()='Divorced']/following-sibling::input"));
        mar_status.click();

        WebElement hobby = a.findElement(By.xpath("//div[@class='radio_wrap']/label[text()='Dance']/following-sibling::input"));
        hobby.click();

        WebElement country = a.findElement(By.xpath("//select[@id=\"dropdown_7\"]/option[@value='Peru']"));
        country.click();

        WebElement month = a.findElement(By.xpath("//div[@class='piereg_time date_format_field']/div[@class='time_fields']/select"));
        month.sendKeys("3");

        WebElement day = a.findElement(By.xpath("//div[@class='piereg_time date_format_field']/div[@class='time_fields']/following-sibling::div/select"));
        day.sendKeys("4");

        WebElement year = a.findElement(By.xpath("//div[@class='piereg_time date_format_field']/div[@class='time_fields']/following-sibling::div/following-sibling::div/select"));
        year.sendKeys("1971");



    }
}
