
package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Array;
import java.util.*;

/**
 * Created by user on 2/13/15.
 */
public class Ukrzal_classes_Jakof {

    private static String fromStation = "//input[@name=\"station_from\"]";
    private static String tillStation = "//input[@name=\"station_till\"]";
    private static String departDate = "//input[@id=\"date_dep\"]";
    private static String departTime = "//select[@name=\"time_dep\"]";
    private static String eightMarch = "/html/body/div[2]/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]";
    private static String roundTrip = "//input[@name=\"round_trip\"]";
    private static String searchButton = "//button[@name=\"search\"]";
    private static String popupHelper = "//div[@class=\"vToolsPopup \"]";
    private static String popupHelperText = "//div[@class=\"vToolsPopupContent\"]";
    private static String popupText1 = "//div[@class=\"vToolsPopupContent\"]/p[1]";
    private static String popupText2 = "//div[@class=\"vToolsPopupContent\"]/p[2]";
    private static String pushPopup = "//center[@class=\"vToolsPopupToolbar\"]/button";
    private static String suggestionsFrom = "//div[@id=\"stations_from\"][@class=\"autosuggest\"]";
    private static String suggestionsTill = "//div[@id=\"stations_till\"][@class=\"autosuggest\"]";

    public static void open() {
        TestHelper.driver.get("http://booking.uz.gov.ua/en/");
    }

    public static void setFromStation(String str) {
        WebElement f = TestHelper.getData.getValueElement(fromStation);
        f.sendKeys(str);
    }

    public static void setTillStation(String str){
        TestHelper.getData.getValueElement(tillStation).sendKeys(str);
    }

    public static String getDepartDate(){
        WebElement f = TestHelper.getData.getValueElement(departDate);
        String k = f.getAttribute("value");

        return k;
    }

    public static void setDepartDate(){
        TestHelper.getData.getValueElement(departDate).click();
        TestHelper.getData.getValueElement(eightMarch).click();
    }

    public static void setDepartTime(){
        WebElement f = TestHelper.getData.getValueElement(departTime);
        Select s = new Select(f);
        s.selectByValue("02:00");
    }

    public static void pushButton(){
        TestHelper.pushButton(searchButton);

    }
    public static void setRoundTrip(){
        TestHelper.pushButton(roundTrip);
    }

    public static void getPopupHelper(){
        TestHelper.getData.getValueElement(popupHelper);

    }

    public static String[] getPopupHelperText(){
        TestHelper.getData.getValueElement(popupHelperText);
        String mes1 = TestHelper.getData.getValueElement(popupText1).getText();
        String mes2 = TestHelper.getData.getValueElement(popupText2).getText();
        String[] messages = {mes1, mes2};

        return messages;
    }

    public static String[] getSuggestionsFrom(){
        TestHelper.getData.getValueElement(suggestionsFrom);
        String sug1 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[1]").getAttribute("title");
        String sug2 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[2]").getAttribute("title");
        String sug3 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[3]").getAttribute("title");
        String sug4 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[4]").getAttribute("title");
        String sug5 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[5]").getAttribute("title");
        String sug6 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[6]").getAttribute("title");
        String sug7 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[7]").getAttribute("title");
        String sug8 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[8]").getAttribute("title");
        String sug9 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[9]").getAttribute("title");
        String sug10 = TestHelper.getData.getValueElement("//*[@id=\"stations_from\"]/div[10]").getAttribute("title");
        String[] messages = {sug1, sug2, sug3, sug4, sug5, sug6, sug7, sug8, sug9, sug10};

        return messages;
    }

    public static String[] getSuggestionsTill(){
        TestHelper.getData.getValueElement(suggestionsTill);
        String sug1 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[1]").getAttribute("title");
        String sug2 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[2]").getAttribute("title");
        String sug3 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[3]").getAttribute("title");
        String sug4 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[4]").getAttribute("title");
        String sug5 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[5]").getAttribute("title");
        String sug6 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[6]").getAttribute("title");
        String sug7 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[7]").getAttribute("title");
        String sug8 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[8]").getAttribute("title");
        String sug9 = TestHelper.getData.getValueElement("//*[@id=\"stations_till\"]/div[9]").getAttribute("title");

        String[] messages = {sug1, sug2, sug3, sug4, sug5, sug6, sug7, sug8, sug9};

        return messages;
    }

    public static void clearFrom(){
        TestHelper.clearFields(fromStation);
    }

    public static void clearTo(){
        TestHelper.clearFields(tillStation);
    }

    public static void setPushPopupButton(){
        TestHelper.pushButton(pushPopup);
    }
}

