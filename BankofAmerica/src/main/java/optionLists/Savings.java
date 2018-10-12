package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Savings extends CommonAPI {

    @FindBy(xpath = "//span[text()='Savings']")public WebElement savings;
    @FindBy(id = "rewardsSavingsAccount")public WebElement rewadsSavingsAccount;
    @FindBy(id="cdAccount")public WebElement cdAccount;
    @FindBy(id = "iraAccount")public WebElement iraAcccount;

    public void selectSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        savings.click();
    }
    public void selectRewardSavingsAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSavings();
        rewadsSavingsAccount.click();
    }
    public void selectCdAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSavings();
        cdAccount.click();
    }
    public void selectIraAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSavings();
        iraAcccount.click();
    }
}


