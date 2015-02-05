package com.company;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
/**
 * Created by user on 1/30/15.
 */
@RunWith(JUnit4.class)

public class SecondTests {
    WebDriver a;
    boolean testPassed;
    @Before
    public void Init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        a = new ChromeDriver();
        Angel_net.open(a);
        Thread.sleep(1000);

    }
    @After
    public void CleanUp(){

        //    if(!testPassed){
        //      File scrFile = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
        //      FileUtils
        //     }
        a.close();
    }
    // Test 1
    @Test
    public void MyTest()throws InterruptedException {

        Angel_net.setSite(a, "angel.net");
        Angel_net.pushButton(a);
        Thread.sleep(1000);
        String passwd = Angel_net.getPassword(a);
        Assert.assertEquals("Is2nfhWTJLvq0@1a", passwd);

    }
    // Test 2
    @Test
    public void MyTest1()throws InterruptedException {

        Angel_net.setMaster(a, "asdasd");
        Angel_net.setSite(a, "angel.net");
        Angel_net.pushButton(a);
        Thread.sleep(1000);
        String passwd = Angel_net.getPassword(a);
        Assert.assertEquals("B9ya7yayeK/Zn@1a", passwd);

    }
    // Test 3
    @Test
    public void MyTest2()throws InterruptedException {

        String passwd1 = Angel_net.myInputPassTest3(a, 10);
        String passwd2 = Angel_net.myInputPassTest3(a, 10);

        Assert.assertNotEquals(passwd1, passwd2);

    }
    // Test 4
    @Test
    public void MyTest3()throws InterruptedException {

        String passwd = Angel_net.myInputPass(a, 10, 10);
        String site = Angel_net.getSite(a);
        String master = Angel_net.getMaster(a);

        Assert.assertNotEquals("", passwd);
        Assert.assertNotEquals("", site);
        Assert.assertNotEquals("", master);
    }

    // Test 5
    @Test
    public void MyTest4()throws InterruptedException {
        Angel_net.myInputPass(a, 32, 128);
        String site = Angel_net.getSite(a);
        String master = Angel_net.getMaster(a);

        Assert.assertNotEquals("", site);
        Assert.assertNotEquals("", master);
    }
}

