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
 * Created by user on 1/28/15.
 */
@RunWith(JUnit4.class)

public class FirstTests {
    WebDriver a;
    boolean testPassed;

    @Rule
    public TestName name = new TestName();

    @Before
    public void Init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\My_projects\\aut\\chromedriver_win32\\chromedriver.exe");
        a = new ChromeDriver();
        RegistrationForm.open(a);
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


    @Test
    public void MyTest(){

        String first_name = RegistrationForm.getFirstName(a);

        Assert.assertEquals("", first_name);

    }

    @Test
    public void MyTest2(){

        WebElement lastname = a.findElement(By.xpath("//input[@name='last_name']/preceding-sibling::label"));
        String glastname = lastname.getText();


        Assert.assertEquals("Last Name",glastname);


    }

    @Test
         public void MyTest3(){

        WebElement sub = a.findElement(By.xpath("//input[@name='pie_submit']"));
        sub.sendKeys(Keys.ENTER);

        WebElement legend_err = a.findElement(By.xpath("//div[@class=\"legend_txt\"]//span"));
        String lerror = legend_err.getText();

        Assert.assertEquals("* This field is required", lerror);

    }

    @Test
    public void MyTest4(){

       RegistrationForm.setFirstName(a, "Alex");

    }


}
