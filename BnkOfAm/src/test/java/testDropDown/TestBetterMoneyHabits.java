package testDropDown;

import dropDown.BetterMoneyHabits;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBetterMoneyHabits extends BetterMoneyHabits {
   @Test
    public void testSelectBetterMoneyHabits(){
        BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectBetterMOneyHabits();
    }
    @Test
    public void testSelectMerrilWealthManagement(){
        BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectMerrillWealthManagement();
    }
}
