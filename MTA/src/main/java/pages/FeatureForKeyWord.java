package pages;

import base.CommonAPI;
import keywordDriven.InputFromXls;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import xlSheetData.HomePageMyMtaAlerts;

import java.io.IOException;

public class FeatureForKeyWord extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")
    public static WebElement signUp;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")
     public static WebElement username;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]")
     public static WebElement password;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmitLogin\"]")
        public static WebElement loginButton;
        public void clickOnSignUp()
        {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            signUp.click();
        }
        public void inputUsername(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            username.sendKeys("Fahim1988");}
        public void inputPassword()
        {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            password.sendKeys("mun34119");
        }
        public void clickOnLoginButton()
        {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            loginButton.click();
        }
}
