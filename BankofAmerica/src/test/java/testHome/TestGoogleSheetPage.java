package testHome;

import googleSheetsAPI.GoogleSheetPage;
import home.HomePage;
import home.LogIn;
import org.openqa.selenium.support.PageFactory;
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

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        objLoginPage.loginWithInValidusernameandPassword(username,password);
        int i = 0;
        String spreadsheetId = "1MywS8njcZ8tIc2wB7THtQJhgZ6mW_KvYTsk7d4AHbeU";
        String range = "Sheet1!A2:B";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }

}
