package pages;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends CommonAPI {
    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_txtLogin']")
    public static WebElement username;
    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_txtPass']")
    public static WebElement password;
    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_btnSubmitLogin']")
    public static WebElement login;
    @FindBy(xpath = "//span[@id='ctl00_ContentPlaceHolder1_lblLoginMsg']")
    public static WebElement ErrorMessage;

    public GoogleSheetPage(){}
    public GoogleSheetPage(WebDriver driver){this.driver=driver;
    PageFactory.initElements(driver,this);}
    public void signUp(){
        driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
    }

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inpuValueInTextBoxByWebElement(username, row.get(1).toString());
            inpuValueInTextBoxByWebElement(password, row.get(2).toString());
            login.click();
            sleepFor(2);
            //actual.add(getCurrentPageTitle());
           actual.add(getTextByWebElement(ErrorMessage));
              System.out.println(getTextByWebElement(ErrorMessage));
            sleepFor(1);
            clearInputBox(username);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
        }
    }

