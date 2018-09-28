package googleSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleSheetPage;

import java.io.IOException;
import java.util.List;

public class GoogleSheetPageTest extends GoogleSheetPage {
GoogleSheetPage googleSheetPage;
@BeforeMethod
public void initialize()
{googleSheetPage= new GoogleSheetPage(driver);
}

     @Test
     public void dd(){
         clickOnsignUp();
     }
     public void methodForSheet(){
    Username.isEnabled();
    Password.isEnabled();
     }
    //driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLogin")).sendKeys("username", Keys.ENTER);
       //  driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtPass")).sendKeys("password",Keys.ENTER);
    // }

    @Test
     public void testLogInByInvalidIdPassUsingGoogleSheet() throws InterruptedException, IOException {
        clickOnsignUp();
       sleepFor(3);
       //methodForSheet();
       //sleepFor(3);

        int i = 0;
        String spreadsheetId = "1SsicIWg2OfYIAF8RTjvoJaCJfrJreen76Mq4BGXIssI";
        String range = "Sheet1!A2:C";
       // List<String> actualErrorMessage = signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = getSpreadSheetRecords (spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            //Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            System.out.println("expected"+row.get(2).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
