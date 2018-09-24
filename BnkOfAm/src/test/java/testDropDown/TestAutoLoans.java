package testDropDown;

import dropDown.AutoLoans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAutoLoans extends AutoLoans {
    @Test
    public void testSelectAutoApplyNow() {
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectAutoApplyNow();
    }

    @Test
    public void testSelectAutoLoanRates() {
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectAutoLoanRates();
    }
    @Test
    public void testSelectCalculateAutoLoanPayment() {
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectCalculateAutoLoanPayment();
    }
    @Test
    public void testSelectCheckAutoStatus() {
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectCheckAutoStatus();
    }
    @Test
    public void testSelectFindAndFinaceYourNextCar() {
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectFindAndFinaceYourNextCar();
    }

}
