package pages;

import base.CommonAPI;
import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class HomePageMyMtaAlerts extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")
    public WebElement SignUp;


    public void clickOnsignUp(){
        driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
    }
    public void signUpDataForXls(String Username,String Password) throws InterruptedException {
        //driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")).sendKeys(Username);
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmitLogin\"]")).click();
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
