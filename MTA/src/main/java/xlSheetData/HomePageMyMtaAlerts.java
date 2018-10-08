package xlSheetData;

import base.CommonAPI;
import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class HomePageMyMtaAlerts extends CommonAPI {

    public void clickOnsignUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
    }
    public void signUpDataForXls(String username,String password) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtLogin']")).sendKeys(username);
        sleepFor(2);
        driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtPass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnSubmitLogin']")).click();
       // driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lblLoginMsg\"]")).getText();
    }
    public HomePageMyMtaAlerts(){}
    public HomePageMyMtaAlerts(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
}
