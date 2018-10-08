package testXlSheet;

import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import xlSheetData.HomePageMyMtaAlerts;
import reporting.TestLogger;

public class TestHomePageMyMtaAlert extends HomePageMyMtaAlerts{

    HomePageMyMtaAlerts myMtaAlerts;
    XlsDataReaderUtil xlsDataReaderUtil;
    @BeforeMethod
    public void initialization(){
        myMtaAlerts= PageFactory.initElements(driver, HomePageMyMtaAlerts.class);
        xlsDataReaderUtil=PageFactory.initElements(driver,XlsDataReaderUtil.class);
    }
        @Test
    public void testMymtaHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnsignUp();
        }
        @Test
        public void test() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnsignUp();
        signUpDataForXls("fahim","fsaag");
        }
        @Test(dataProvider = "supplyData")
    public void signIn(String Username,String Password) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnsignUp();
        signUpDataForXls(Username, Password);
        TestLogger.log("In Sign In Page");
        TestLogger.log("Username: " + Username);TestLogger.log("Password: " + Password);
        TestLogger.log("Test Passed");
    }
}

