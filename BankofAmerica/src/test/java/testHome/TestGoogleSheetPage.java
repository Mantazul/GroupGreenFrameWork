package testHome;

import googleSheetsAPI.GoogleSheetPage;
import home.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetPage extends GoogleSheetPage {
    GoogleSheetPage objGoogleSheetsPage;
   LogIn objLoginPage;

    @BeforeMethod
    public void initialization(){
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
        objLoginPage = PageFactory.initElements(driver, LogIn.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1xZFJh5IlbIBR7pM9Iq7lnRb834rLgp0OrO8imPudlzY";
        String range = "Sheet1!A2:D";
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
    @Test
    public void clicktest(){
        click();
    }
}
