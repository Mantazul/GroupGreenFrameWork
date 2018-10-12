package testHomePageTarget;

import googleSheetsAPI.GoogleSheetPage;
import homePageTarget.TargetLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetPage extends GoogleSheetPage {
    GoogleSheetPage objGoogleSheetsPage;
    TargetLogin objSignPage;

    @BeforeMethod
    public void initialization(){
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
        objSignPage = PageFactory.initElements(driver, TargetLogin.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);

        int i = 0;
        String spreadsheetId = "16EhPEEr8iChswA7SzzlazeBdQXl25qjnHzWGa7crVck";
        String range = "Sheet1!A2:C";
        List<String> actualErrorMessage = signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
