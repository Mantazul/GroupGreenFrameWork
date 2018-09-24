package testDropDown;

import dropDown.Savings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSavings extends Savings {
    @Test
    public void testSelectSavings(){
        Savings savings = PageFactory.initElements(driver,Savings.class);
        savings.selectSavings();
    }
    @Test
    public void testSelectRewardSavingsAccount(){
        Savings savings = PageFactory.initElements(driver,Savings.class);
        savings.selectRewardSavingsAccount();
    }
    @Test
    public void testSelectCdAccount(){
        Savings savings = PageFactory.initElements(driver,Savings.class);
        savings.selectCdAccount();
    }
    @Test
    public void testSelectIraAccount(){
        Savings savings = PageFactory.initElements(driver,Savings.class);
        savings.selectIraAccount();
    }
}
