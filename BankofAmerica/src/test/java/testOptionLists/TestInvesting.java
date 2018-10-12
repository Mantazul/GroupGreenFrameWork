package testOptionLists;

import optionLists.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestInvesting extends Investing {
    @Test
    public void testSelectInvesting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectInvesting();
    }
    @Test
    public void testSelectRetirementPlanning() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectRetimentPlanning();
    }
    @Test
    public void testSelectRollovers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectRollovers();
    }
    @Test
    public void testSelectCollegeSavingsPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectCollegeSavingsPlans();
    }
    @Test
    public void testSelectInvestmentProducts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectInvestmentProducts();
    }
    @Test
    public void testSelectTrustWealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectUsTrustWealthManagement();
    }
    @Test
    public void testSelectMerrilWealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectMerrilWealthManagement();
    }
}
