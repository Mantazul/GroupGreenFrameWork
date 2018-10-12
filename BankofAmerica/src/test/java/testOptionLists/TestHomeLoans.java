package testOptionLists;

import optionLists.HomeLoans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomeLoans extends HomeLoans {

    @Test
    public void TestSelectHomeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectHomeLoans();
    }
    @Test
    public void TestSelectMortgages(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectMortgages();
    }
    @Test
    public void TestSelectRefinance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectRefinance();
    }
    @Test
    public void TestSelectHomeEquity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectHomeEquity();
    }
    @Test
    public void TestSelectFindHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectFindHome();
    }
    @Test
    public void TestSelectTimeHomebuyer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomeLoans hl = PageFactory.initElements(driver, HomeLoans.class);
        hl.selectFirstTimeHomebuyer();
    }
}
