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
 * Created by user on 2/2/15.
 */
@RunWith(JUnit4.class)
public class Third_tests {

    boolean testPassed;
    @Before
    public void Init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        TestHelper.driver = new ChromeDriver();
        New_tests_2.open();


    }
    @After
    public void CleanUp(){

        //    if(!testPassed){
        //      File scrFile = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
        //      FileUtils
        //     }
        TestHelper.driver.close();
    }
    // Test 1
    @Test
    public void MyTest()throws InterruptedException {

        New_tests_2.setSite("angel.net");
        New_tests_2.pushButton();

        String passwd = New_tests_2.getPassword();
        Assert.assertEquals("Is2nfhWTJLvq0@1a", passwd);

    }
    // Test 2
    @Test
    public void MyTest1()throws InterruptedException {

        New_tests_2.setMaster("asdasd");
        New_tests_2.setSite("angel.net");
        New_tests_2.pushButton();

        String passwd = New_tests_2.getPassword();

        Assert.assertEquals("B9ya7yayeK/Zn@1a", passwd);

    }
    // Test 3
    @Test
    public void MyTest2()throws InterruptedException {

        String passwd1 = New_tests_2.myInputPassTest3(10);
        String passwd2 = New_tests_2.myInputPassTest3(10);

        Assert.assertNotEquals(passwd1, passwd2);

    }
    // Test 4
    @Test
    public void MyTest3()throws InterruptedException {

        String passwd = New_tests_2.myInputPass(10, 10);
        String site = New_tests_2.getSite();
        String master = New_tests_2.getMaster();

        Assert.assertNotEquals("", passwd);
        Assert.assertNotEquals("", site);
        Assert.assertNotEquals("", master);
    }

    // Test 5
    @Test
    public void MyTest4()throws InterruptedException {
        New_tests_2.myInputPass(32, 128);
        String site = New_tests_2.getSite();
        String master = New_tests_2.getMaster();

        Assert.assertNotEquals("", site);
        Assert.assertNotEquals("", master);
    }
}
