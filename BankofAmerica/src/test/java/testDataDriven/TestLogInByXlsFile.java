package testDataDriven;

import dataDriven.LogInByXlsFile;
import home.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestLogInByXlsFile extends LogInByXlsFile {
    LogIn objLoginPage;
    LogInByXlsFile objLogInByXls;

    @BeforeMethod
    public void initialization(){
       objLoginPage = PageFactory.initElements(driver, LogIn.class);
       objLogInByXls = PageFactory.initElements(driver, LogInByXlsFile.class);
    }
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void testLogInByDataProvider(String userName, String passWord) throws IOException, InterruptedException {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       objLoginPage.logInByDataProvider(userName,passWord );
    }
}
