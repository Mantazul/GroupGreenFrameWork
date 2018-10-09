package dataDriven;

import base.CommonAPI;
import dataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXlsFile extends CommonAPI {
    LogInByXlsFile objLogInByXls;

    @FindBy(id="onlineId1")
    public WebElement username;
    @FindBy(id="passcode1")
    public WebElement password;
    @FindBy(id="signIn")
    public WebElement signin;

    public void logInByDataProvider(String userName, String passWord) throws InterruptedException {
        username.sendKeys(userName);
        password.sendKeys(passWord);
        signin.click();
        Thread.sleep(1000);
    }

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
}
