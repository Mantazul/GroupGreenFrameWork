package keyWordDriven;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class InputFromXls extends CommonAPI {
   @FindBy(id="onlineId1")
    public WebElement username;
    @FindBy(id="passcode1")
    public WebElement password;
    @FindBy(id="signIn")
    public WebElement signin;
    @FindBy(css = "#login-submit")
    public static WebElement signInButton;

    public void logInToTarget(){
        username.sendKeys("jmintegr1@gmail.com");
        password.sendKeys("wrongpassword");
        signin.click();
    }
    public void signInToTarget(){
        username.sendKeys("Jewell");
        password.sendKeys("3476562394");
        signInButton.click();
    }
    public void executeActions(String feature) throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switch (feature){
            case "SignIn":
                signInToTarget();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyWord(String fileName) throws IOException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = "../target/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
    public void signInByKeyWord() throws  IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyWord("KeyWordDriven.xls");
        for (int i = 0; i < keyword.length; i++){
            executeActions(keyword[i]);
        }
    }
}
