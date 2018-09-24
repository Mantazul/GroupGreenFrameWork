package testDropDown;

import dropDown.HomeLoans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomeLoans extends HomeLoans {

    @Test
    public void TestSelectHomeLoan(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectHomeLoans();
    }
    @Test
    public void TestSelectMortgages(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectMortgages();
    }
    @Test
    public void TestSelectRefinance(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectRefinance();
    }
    @Test
    public void TestSelectHomeEquity(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectHomeEquity();
    }
    @Test
    public void TestSelectFindHome(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectFindHome();
    }
    @Test
    public void TestSelectTimeHomebuyer(){
        HomeLoans hl = PageFactory.initElements(driver,HomeLoans.class);
        hl.selectFirstTimeHomebuyer();
    }
}
