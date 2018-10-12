package googleSheet;



import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleSheetPage;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class SignInByTest extends GoogleSheetPage {
GoogleSheetPage googleSheetPage;
@BeforeMethod
public void initialize()
{googleSheetPage=new GoogleSheetPage(driver);
}
     @Test
     public void dd() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
                  signUp();
     }
   @Test
     public void testLogInByInvalidIdPassUsingGoogleSheet() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        googleSheetPage.signUp();
        sleepFor(3);
        int i = 0;
       String spreadsheetId = "1SsicIWg2OfYIAF8RTjvoJaCJfrJreen76Mq4BGXIssI";
       String range = "Sheet1!A2:D";
       List<String> actualErrorMessage = signInByInvalidIdPass(spreadsheetId, range);
       List<List<Object>> expectedErrorMessage = getSpreadSheetRecords (spreadsheetId, range);
       for (List row : expectedErrorMessage) {
           Assert.assertFalse(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected "+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Test - Passed");
            i++;
        }
       System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
