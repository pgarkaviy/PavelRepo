package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 2/4/15.
 */
public class New_tests_2 {
    private static String masterXpath = "//tr[td=\"Your master password\"]//input[@type=\"password\"]";
    private static String pushButton = "//input[@type=\"submit\"]";
    private static String siteXpath= "//tr[td=\"Site name\"]//input";
    private static String passwordXpath = "//tr[td=\"Generated password\"]//input";

    public static void open() {
        TestHelper.driver.get("http://oxogamestudio.com/passwd.current8.htm");
    }

    public static void setMaster(String i){
        WebElement n = TestHelper.getData.getValueElement(masterXpath);
        n.clear();
        n.sendKeys(i);
    }

    public static String getMaster(){
        WebElement name = TestHelper.getData.getValueElement(masterXpath);

        return name.getAttribute("value");
    }

    public static void setSite(String i){
        WebElement f = TestHelper.getData.getValueElement(siteXpath);
        f.clear();
        f.sendKeys(i);
    }
    public static String getSite(){
        WebElement name = TestHelper.getData.getValueElement(siteXpath);
        return name.getAttribute("value");
    }

    public static String getPassword(){
        WebElement passwd = TestHelper.getData.getValueElement(passwordXpath);
        return passwd.getAttribute("value");
    }

    public static void pushButton(){
        WebElement f = TestHelper.getData.getValueElement(pushButton);
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

    public static String myInputPass(Integer i, Integer k)throws InterruptedException{
        String mymaster = New_tests_2.myRandom(i);
        String mysite = New_tests_2.myRandom(k);
        New_tests_2.setMaster( mymaster);
        New_tests_2.setSite(mysite);
        New_tests_2.pushButton();
        Thread.sleep(1000);
        String passwd = New_tests_2.getPassword();

        return passwd;
    }
    public static String myInputPassTest3(Integer i) throws InterruptedException{
        String mymaster = New_tests_2.myRandom(i);
        String mysite = "angel.net";
        New_tests_2.setMaster(mymaster);
        New_tests_2.setSite(mysite);
        New_tests_2.pushButton();
        Thread.sleep(1000);
        String passwd = New_tests_2.getPassword();

        return passwd;
    }
}
