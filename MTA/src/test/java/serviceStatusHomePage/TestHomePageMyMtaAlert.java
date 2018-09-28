package serviceStatusHomePage;

import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePageMyMtaAlerts;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class TestHomePageMyMtaAlert extends HomePageMyMtaAlerts{

    HomePageMyMtaAlerts myMtaAlerts;
    @BeforeMethod
    public void initialization(){
        myMtaAlerts=new HomePageMyMtaAlerts(driver);}


    @Test
    public void testMymtaHomePage(){
        clickOnsignUp();
        }
        @Test
        public void test(){
        clickOnsignUp();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")).sendKeys("fahim", Keys.ENTER);
        }



    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();

    }
    @Test(dataProvider = "supplyData")
    public void signIn(String Username,String Password) throws InterruptedException {
        clickOnsignUp();
        signUpDataForXls(Username, Password);
        TestLogger.log("Username: " + Username);TestLogger.log("Password: " + Password);
        //TestLogger.log("message: " + message);
        TestLogger.log("In Sign In Page");
      //  myMtaAlerts.signUpDataForXls(Username, Password);
        TestLogger.log("Test Passed");

    }
}

