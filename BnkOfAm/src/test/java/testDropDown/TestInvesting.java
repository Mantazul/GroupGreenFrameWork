package testDropDown;

import dropDown.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInvesting extends Investing {
    @Test
    public void testSelectInvesting() {
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectInvesting();
    }

    @Test
    public void testSelectRetirementPlanning() {
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectRetimentPlanning();
    }

    @Test
    public void testSelectRollovers() {
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectRollovers();
    }
    @Test
    public void testSelectCollegeSavingsPlans() {
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectCollegeSavingsPlans();
    }
    @Test
    public void testSelectInvestmentProducts(){
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectInvestmentProducts();
    }
    @Test
    public void testSelectTrustWealthManagement(){
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectUsTrustWealthManagement();
    }
    @Test
    public void testSelectMerrilWealthManagement(){
        Investing investing = PageFactory.initElements(driver, Investing.class);
        investing.selectMerrilWealthManagement();
    }

}
