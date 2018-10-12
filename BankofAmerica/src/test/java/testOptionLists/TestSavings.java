package testOptionLists;

import optionLists.Savings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSavings extends Savings {
    @Test
    public void testSelectSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Savings savings = PageFactory.initElements(driver, Savings.class);
        savings.selectSavings();
    }
    @Test
    public void testSelectRewardSavingsAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Savings savings = PageFactory.initElements(driver, Savings.class);
        savings.selectRewardSavingsAccount();
    }
    @Test
    public void testSelectCdAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Savings savings = PageFactory.initElements(driver, Savings.class);
        savings.selectCdAccount();
    }
    @Test
    public void testSelectIraAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Savings savings = PageFactory.initElements(driver, Savings.class);
        savings.selectIraAccount();
    }
}
