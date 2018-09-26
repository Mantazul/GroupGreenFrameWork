package optionListsTest;

import optionLists.CreditCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCreditCards extends CreditCards {
    @Test
    public void testSelectCreditCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectCreditCards();
    }
    @Test
    public void testSelectCashRewardsCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectCashRewardsCards();
    }
    @Test
    public void testSelectLowerInterestRateCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectLowerInterestRateCards();
    }
    @Test
    public void testSelectPointRwardsCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectPointRwardsCards();
    }
    @Test
    public void testSelectBuildCrditCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectBuildCrditCards();
    }
    @Test
    public void testSelectSmallBusinessCards(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectSmallBusinessCards();
    }
    @Test
    public void testSelectManageCreditCardAccount(){
        CreditCards cc = PageFactory.initElements(driver, CreditCards.class);
        cc.selectManageCreditCardAccount();
    }

}
