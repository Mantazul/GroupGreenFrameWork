package testOptionLists;

import optionLists.CreditCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCreditCards extends CreditCards {
    @Test
    public void testSelectCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectCreditCards();
    }
    @Test
    public void testSelectCashRewardsCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectCashRewardsCards();
    }
    @Test
    public void testSelectLowerInterestRateCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectLowerInterestRateCards();
    }
    @Test
    public void testSelectPointRwardsCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectPointRwardsCards();
    }
    @Test
    public void testSelectBuildCrditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectBuildCrditCards();
    }
    @Test
    public void testSelectSmallBusinessCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectSmallBusinessCards();
    }
    @Test
    public void testSelectManageCreditCardAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectManageCreditCardAccount();
    }

}
