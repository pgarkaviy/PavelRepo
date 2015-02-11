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
 * Created by user on 2/6/15.
 */
@RunWith(JUnit4.class)
public class Strahovator_tests extends TestHelper{


    // Test 1
    @Test
    public void MyTest()throws InterruptedException {

        Strahovator_classes.setAutoType(1);
        Strahovator_classes.setdetailsType(1);
        Strahovator_classes.setdgo(1);
        Strahovator_classes.setnoCrash(1);
        Strahovator_classes.setperiod(0);
        Strahovator_classes.setzoneName(0);

        String company = Strahovator_classes.getLogoName();
        Assert.assertEquals("Скайд", company);
        testPassed = true;


    }

    // Test 2
    @Test
    public void MyTest1() throws InterruptedException{

        Strahovator_classes.setAutoType(1);
        Strahovator_classes.setdetailsType(1);
        Strahovator_classes.setdgo(1);
        Strahovator_classes.setnoCrash(1);
        Strahovator_classes.setperiod(0);
        Strahovator_classes.setzoneName(0);

        Strahovator_classes.getTooltip();

        testPassed = true;

    }

    // Test 3
    @Test
    public void MyTest2() throws InterruptedException{

        Strahovator_classes.setAutoType(1);
        Strahovator_classes.setdetailsType(1);
        Strahovator_classes.setdgo(1);
        Strahovator_classes.setnoCrash(1);
        Strahovator_classes.setperiod(0);
        Strahovator_classes.setzoneName(0);

        Strahovator_classes.pushBuy1();
        Strahovator_classes.noReg();
    }
}
