package dropDown;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCards extends CommonAPI {

    @FindBy(xpath = "//span[text()='Credit Cards']")public WebElement creditCards;
    @FindBy(id = "cashRewardsCards")public WebElement cashRewardsCards;
    @FindBy(id="lowerInterestRateCards")public WebElement lowerInterestTateCards;
    @FindBy(id = "pointsRewardsCards")public WebElement pointRewardsCards;
    @FindBy(id = "buildCreditCards")public WebElement buildCreditCards;
    @FindBy(id = "smallBusinessCards")public WebElement smallBusinessCards;
    @FindBy(id = "manageCreditCardAccount")public WebElement manageCreditCardAccount;
    public void selectCreditCards(){
        creditCards.click();
    }
    public void selectCashRewardsCards(){
        selectCreditCards();
        cashRewardsCards.click();
    }
    public void selectLowerInterestRateCards(){
        selectCreditCards();
        lowerInterestTateCards.click();
    }
    public void selectPointRwardsCards(){
        selectCreditCards();
        pointRewardsCards.click();
    }
    public void selectBuildCrditCards(){
        selectCreditCards();
        buildCreditCards.click();
    }
    public void selectSmallBusinessCards(){
        selectCreditCards();
        smallBusinessCards.click();
    }
    public void selectManageCreditCardAccount(){
        selectCreditCards();
        manageCreditCardAccount.click();
    }

}
