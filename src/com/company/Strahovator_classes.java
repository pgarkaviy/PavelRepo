package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

/**
 * Created by user on 2/6/15.
 */
public class Strahovator_classes {
    private static String autoType = "//select[contains(@id,\"ts_type\")]";
    private static String detailsType = "//select[contains(@id,\"ts_details_type\")]";
    private static String zoneName = "//select[contains(@id,\"ts_zone\")]";
    private static String noCrash = "//select[contains(@id,\"no_crash_years_qty\")]";
    private static String period = "//select[contains(@id,\"period\")]";
    private static String dgo = "//select[contains(@id,\"dgo\")]";
    private static String tooltip = "//div[@class=\"tooltip fade top\"]//div[@class=\"tooltip-inner\"]/p[text()= 'Это та часть страховой выплаты, которую в любом случае необходимо будет оплатить Вам самостоятельно, если произойдет ДТП по Вашей вине']";
    private static String franchise = "//a[text()=\"Франшиза\"]";
    private static String submitButton1 = "//table[@class=\"osago_result\"]/tbody/tr/td/button";
    private static String no_reg = "//strong[text()='без регистрации']";
    private static String policyButton = "//a[@class = \"btn btn-success\"]";
    private static String policyLastName = "//input[@id=\"policy_last_name\"]";
    private static String policyFirstName = "//input[@id=\"policy_first_name\"]";
    private static String policyParentName = "//input[@id=\"policy_parent_name\"]";
    private static String policyRegAddrCity= "//input[@id=\"policy_registration_address_city\"]";
    private static String policyRegAddrStreet = "//input[@id=\"policy_registration_address_street\"]";
    private static String policyRegAddrHouse = "//input[@id=\"policy_registration_address_house\"]";
    private static String policyRegAddrApp = "//input[@id=\"policy_registration_address_app\"]";
    private static String idCode = "//input[@id=\"policy_identity_code\"]";
    private static String birthDay = "//select[contains(@name,\"policy_birthdate_day\")]";
    private static String birthMonth = "//select[contains(@name,\"policy_birthdate_month\")]";
    private static String birthYear = "//select[contains(@name,\"policy_birthdate_year\")]";
    private static String regDoc = "//input[@id=\"policy_document_type_passport\"]";
    private static String docSer = "//input[contains(@name,\"policy_document_series\")]";
    private static String docNum = "//input[contains(@name,\"policy_document_number\")]";
    private static String docGiv = "//input[contains(@name,\"policy_document_given_by\")]";
    private static String docDay = "//select[contains(@name,\"policy_document_given_date_day\")]";
    private static String docMon = "//select[contains(@name,\"policy_document_given_date_month\")]";
    private static String docYear = "//select[contains(@name,\"policy_document_given_date_year\")]";
    private static String polStart = "//input[contains(@name, \"policy_start_date\")]";
    private static String polBrand = "//input[@id=\"policy_ts_brand\"]";
    private static String polMod = "//input[@id=\"policy_ts_model\"]";
    private static String polPlate = "//input[@id=\"policy_ts_plate_number\"]";
    private static String polCity = "//input[@id=\"policy_ts_registration_city\"]";
    private static String polYearPr = "//select[@id=\"policy_ts_production_year\"]";
    private static String polTsVin= "//input[@id=\"policy_ts_vin\"]";
    private static String submitButton2 = "//button[@class= \"btn btn-success\"]";

    public static void open() {
        TestHelper.driver.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
    }

    public static void setAutoType(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(autoType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setdetailsType(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(detailsType);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setzoneName(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(zoneName);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setnoCrash(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(noCrash);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setperiod(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(period);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }

    public static void setDropdown(String st, Integer i){
        WebElement f = TestHelper.getData.getValueElement(st);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i+1);
    }

    public static void setdgo(Integer i) {
        WebElement f = TestHelper.getData.getValueElement(dgo);
        Select s = new Select(f);
        // We select the value
        s.selectByIndex(i);
    }
    public static void clickOnElement(String s){
        WebElement f = TestHelper.getData.getValueElement(s);
        f.click();
    }

    public static String getLogoName() {
        WebElement n = TestHelper.getData.getValueElement("//tbody//img");
        String[] k = n.getAttribute("src").split("/");
        // We get the last element i.e. <company_short_name>.gif
        String comp = companies.get(k[k.length-1]);

        return comp;
    }

    public static void getTooltip(){
        Actions hover = new Actions(TestHelper.driver).moveToElement(TestHelper.getData.getValueElement(franchise));
        hover.perform();
        WebElement f = TestHelper.getData.getValueElement(tooltip);
    }

    public static void pushBuy1(){
        TestHelper.pushButton(submitButton1);
    }

    public static void pushPolicy() {
        TestHelper.pushButton(policyButton);
    }

    public static void noReg(){
        TestHelper.pushButton(no_reg);
    }



    public static void myInputPolicy() throws InterruptedException {
        // get and set first name
        String first_name = myRandom(7);
        setValue(policyFirstName, first_name);
        // get and set last name
        String last_name = myRandom(7);
        setValue(policyLastName, last_name);
        // get and set parent name
        String parent_name = myRandom(7);
        setValue(policyParentName, parent_name);
        // get and set address
        Random r = new Random();

        String city = myRandom(7);
        setValue(policyRegAddrCity, city);
        String street = myRandom(7);
        setValue(policyRegAddrStreet, street);
        int street_n = r.nextInt(100);
        setValue(policyRegAddrHouse, String.valueOf(street_n));
        int app = r.nextInt(100);
        setValue(policyRegAddrApp, String.valueOf(app));
        // set id code
        int id_code = r.nextInt(100000);
        setValue(idCode, String.valueOf(id_code));
        // Set day of birth
        int day = r.nextInt(31);
        setDropdown(birthDay, day);
        // Set month of birth
        int month = r.nextInt(11);
        setDropdown(birthMonth, month);
        // Set year of birth
        int year = r.nextInt(60);
        setDropdown(birthYear, year);
        // select doc(we select passport)
        clickOnElement(regDoc);
        // Set data for passport
        setValue(docSer, myRandom(2));
        setValue(docNum, String.valueOf(r.nextInt(100)));
        setValue(docGiv, myRandom(15) + String.valueOf(r.nextInt(2)));
        // Set dates for doc
        setDropdown(docDay, r.nextInt(31));
        setDropdown(docMon, r.nextInt(11));
        setDropdown(docYear, r.nextInt(60));
        // Set policy start
        setValue(polStart, String.valueOf(r.nextInt(31)) + "."+ String.valueOf(r.nextInt(12)) + "."+ String.valueOf(r.nextInt(randYear())));
        // Set car params
        setValue(polBrand, myRandom(10));
        setValue(polMod, myRandom(10));
        setValue(polPlate, myRandom(2) + String.valueOf(r.nextInt(10000)) + myRandom(2));
        setValue(polCity, myRandom(10));
        setDropdown(polYearPr, r.nextInt(60));
        setValue(polTsVin, myRandom(10) + String.valueOf(r.nextInt(12)));

        TestHelper.pushButton(submitButton2);
    }


    public static void setValue(String s, String d){
        WebElement f = TestHelper.getData.getValueElement(s);
        f.sendKeys(d);
    }

    public static Integer randYear(){
        int yStart = 1900;
        int yEnd = 2015;
        int range = (yEnd - yStart + 1);
        Random r = new Random();
        int ran = (r.nextInt(range));
        int random_year = ran + yStart;

        return random_year;
    }


    public static String myRandom(Integer val) {
        String forName = "qwertyuiopasdfghjklzxcvbnm";
        Random r = new Random();
        String myrandom = "";
        for (int i = 0; i < val; i++) {
            int n = r.nextInt(forName.length());
            myrandom = myrandom + forName.charAt(n);
        }
        return myrandom;

    }

    private static Map<String, String> companies = new HashMap<String, String>() {
        {
            put("ut.gif","Utico");
            put("sk.gif","Скайд");
        }
    };


}
