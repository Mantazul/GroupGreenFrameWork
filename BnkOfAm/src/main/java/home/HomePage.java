package home;
import base.CommonAPI;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import javax.xml.ws.WebEndpoint;


public class HomePage extends CommonAPI  {
    @FindBy(id = "NAV_EN_ES")public WebElement language;
    @FindBy(id = "footer_bofa_locations")public WebElement location;
    @FindBy(id = "rioSearchFilterLabel")public WebElement ATMLocations;
    @FindBy(xpath = "//input[@value='4413']")public WebElement input;
    public void checkHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        java.lang.String title = driver.getTitle();
        Assert.assertEquals(title, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
        System.out.println("Unit Testing: passed");
    }
    public void checkLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        language.click();
    }
    public void locationDropdown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        location.click();
    }
}