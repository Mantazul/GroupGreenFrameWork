package testOptionLists;

import optionLists.AutoLoans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAutoLoans extends AutoLoans {
    @Test
    public void testSelectAutoApplyNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectAutoApplyNow();
    }
    @Test
    public void testSelectAutoLoanRates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectAutoLoanRates();
    }
    @Test
    public void testSelectCalculateAutoLoanPayment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectCalculateAutoLoanPayment();
    }
    @Test
    public void testSelectCheckAutoStatus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectCheckAutoStatus();
    }
    @Test
    public void testSelectFindAndFinaceYourNextCar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AutoLoans al = PageFactory.initElements(driver, AutoLoans.class);
        al.selectFindAndFinaceYourNextCar();
    }

}
