package com.company;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
/**
 * Created by user on 2/4/15.
 */
public class getData {
    public static WebElement getValueElement(String xpath){
        int timeout = 10000;
        for (int timepassed =0; timepassed < timeout; timepassed=+100){
            List<WebElement> f = TestHelper.driver.findElements(By.xpath(xpath));
            if(f.size() > 0) {
                return f.get(0);
            }
        }
        Assert.fail("No element found by xpath: "+ xpath);
        return null;
    }

}