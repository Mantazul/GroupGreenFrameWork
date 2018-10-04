package testXlSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import xlSheetData.HomePageMyMtaAlerts;
import reporting.TestLogger;

public class TestHomePageMyMtaAlert extends HomePageMyMtaAlerts{

    HomePageMyMtaAlerts myMtaAlerts;
    @BeforeMethod
    public void initialization(){
        myMtaAlerts=new HomePageMyMtaAlerts(driver);}
        @Test
    public void testMymtaHomePage(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnsignUp();
        }
        @Test
        public void test(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnsignUp();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")).sendKeys("fahim", Keys.ENTER);
        }
        @Test(dataProvider = "supplyData")
    public void signIn(String Username,String Password) throws InterruptedException {
        clickOnsignUp();
        signUpDataForXls(Username, Password);
        TestLogger.log("In Sign In Page");
        TestLogger.log("Username: " + Username);TestLogger.log("Password: " + Password);
        //signUpDataForXls(Username, Password);
        TestLogger.log("Test Passed");
    }
}

