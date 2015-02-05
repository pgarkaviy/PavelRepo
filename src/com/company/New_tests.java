package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
/**
 * Created by user on 2/2/15.
 */
public class New_tests {
    private static String masterXpath = "//tr[td=\"Your master password\"]//input[@type=\"password\"]";
    private static String pushButton = "//input[@type=\"submit\"]";
    private static String siteXpath= "//tr[td=\"Site name\"]//input";
    private static String passwordXpath = "//tr[td=\"Generated password\"]//input";

    public static void open(WebDriver w) {
        w.get("http://oxogamestudio.com/passwd.current6.htm");
    }
    public static void setMaster(WebDriver w, String i){
        WebElement f = w.findElement(By.xpath(masterXpath));
        f.sendKeys(i);
    }
    public static String getMaster(WebDriver w){
        WebElement name = w.findElement(By.xpath(masterXpath));
        return name.getAttribute("value");
    }

    public static void setSite(WebDriver w, String i){
        WebElement f = w.findElement(By.xpath(siteXpath));
        f.sendKeys(i);
    }
    public static String getSite(WebDriver w){
        WebElement name = w.findElement(By.xpath(siteXpath));
        return name.getAttribute("value");
    }

    public static String getPassword(WebDriver w){
        WebElement passwd = w.findElement(By.xpath(passwordXpath));
        return passwd.getAttribute("value");
    }

    public static void pushButton(WebDriver w){
        WebElement f = w.findElement(By.xpath(pushButton));
        f.click();
    }

    public static String myRandom(Integer val) {
        String forName = "qwertyuiop[]asdfghjkl;\\zxcvbnm,.";
        Random r = new Random();
        String myrandom = "";
        for(int i=0; i<val; i++){
            int n = r.nextInt(forName.length());
            myrandom = myrandom +forName.charAt(n);
        }
        return myrandom;
    }

    public static String myInputPass(WebDriver w, Integer i, Integer k)throws InterruptedException{
        String mymaster = New_tests.myRandom(i);
        String mysite = New_tests.myRandom(k);
        New_tests.setMaster(w, mymaster);
        New_tests.setSite(w, mysite);
        New_tests.pushButton(w);
        Thread.sleep(1000);
        String passwd = New_tests.getPassword(w);

        return passwd;
    }
    public static String myInputPassTest3(WebDriver w, Integer i) throws InterruptedException{
        String mymaster = New_tests.myRandom(i);
        String mysite = "angel.net";
        New_tests.setMaster(w, mymaster);
        New_tests.setSite(w, mysite);
        New_tests.pushButton(w);
        Thread.sleep(1000);
        String passwd = New_tests.getPassword(w);

        return passwd;
    }
}
