package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LogIn extends CommonAPI {

    @FindBy(id="onlineId1")
    public WebElement username;
    @FindBy(id="passcode1")
    public WebElement password;
    @FindBy(id="signIn")
    public WebElement signin;

    public WebElement getSignin() {
        return signin;
    }
    public void setSignin(WebElement signin) {
        this.signin = signin;
    }
    public WebElement getPassword() {
        return password;
    }
    public void setPassword(WebElement password) {
        this.password = password;
    }
    public WebElement getUsername() {
        return username;
    }
    public void setUsername(WebElement username) {
        this.username = username;
    }
    public void enterUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString (new Object(){}.getClass().getEnclosingMethod().getName()));
        getUsername().sendKeys("asiftanvir");
    }
    public void enterPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys("notmypassword");
    }
    public void clickSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignin().click();
    }
}
