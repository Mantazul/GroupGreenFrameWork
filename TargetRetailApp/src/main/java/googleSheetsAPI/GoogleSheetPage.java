package googleSheetsAPI;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends CommonAPI {
    public static WebDriver driver = null;
    @FindBy(xpath = "//*[@id=\"username\"]")
    public static WebElement username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public static WebElement password;
    //@FindBy(id="onlineId1")
    //public static WebElement username;
    //@FindBy(id="passcode1")
    //public static WebElement password;
    @FindBy(xpath = "//*[@id=\"accountNav-signIn\"]/a/div")
    public static WebElement Signin;
    @FindBy(xpath = "username--longInstruction")
    public static WebElement signInErrorMesage;
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public void click(){
        typeOnInputBox("//*[@id=\"username\"]",
                "Jewell");
    }
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
           sleepFor(1);
           inputValueInTextBoxByWebElement(username, row.get(1).toString());
           inputValueInTextBoxByWebElement(password, row.get(2).toString());
           Signin.click();
            sleepFor(1);
           //actual.add(getCurrentPageTitle());
           actual.add(getTextByWebElement(signInErrorMesage));
           System.out.println(getTextByWebElement(signInErrorMesage));
           clearInputBox(username);
           clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
}

