package com.company;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by user on 2/4/15.
 */
public class TestHelper {
    public static WebDriver driver;
    public boolean testPassed = false;

    @Rule
    public TestName name = new TestName();

    @Before
    public void Init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        TestHelper.driver = new ChromeDriver();
        Ukrzal_classes.open();


    }

    @After
    public void CleanUp() throws IOException {

        if (!testPassed) {
            File scrFile = ((TakesScreenshot) TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\tmp\\" + name.getMethodName() + ".jpg"));


        }
        TestHelper.driver.close();
    }

    public static void pushButton(String button){
        WebElement f = getData.getValueElement(button);
        f.click();
    }

    public static void clearFields(String str){
        TestHelper.getData.getValueElement(str).clear();
    }

    public static class getData {
        public static WebElement getValueElement(String xpath){
            int timeout = 10000;
            for (int timepassed =0; timepassed < timeout; timepassed+=100){
                List<WebElement> f = TestHelper.driver.findElements(By.xpath(xpath));
                if(f.size() > 0) {
                    return f.get(0);
                }
            }
            Assert.fail("No element found by xpath: " + xpath);
            return null;
        }

    }

}
