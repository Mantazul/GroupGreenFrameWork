package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CreditCards extends CommonAPI {

    @FindBy(xpath = "//span[text()='Credit Cards']")public WebElement creditCards;
    @FindBy(id = "cashRewardsCards")public WebElement cashRewardsCards;
    @FindBy(id="lowerInterestRateCards")public WebElement lowerInterestTateCards;
    @FindBy(id = "pointsRewardsCards")public WebElement pointRewardsCards;
    @FindBy(id = "buildCreditCards")public WebElement buildCreditCards;
    @FindBy(id = "smallBusinessCards")public WebElement smallBusinessCards;
    @FindBy(id = "manageCreditCardAccount")public WebElement manageCreditCardAccount;
    public void selectCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        creditCards.click();
    }
    public void selectCashRewardsCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        cashRewardsCards.click();
    }
    public void selectLowerInterestRateCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        lowerInterestTateCards.click();
    }
    public void selectPointRwardsCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        pointRewardsCards.click();
    }
    public void selectBuildCrditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        buildCreditCards.click();
    }
    public void selectSmallBusinessCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        smallBusinessCards.click();
    }
    public void selectManageCreditCardAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCreditCards();
        manageCreditCardAccount.click();
    }
}
