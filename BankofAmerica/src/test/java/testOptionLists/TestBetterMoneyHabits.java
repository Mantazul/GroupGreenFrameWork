package testOptionLists;

import optionLists.BetterMoneyHabits;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBetterMoneyHabits extends BetterMoneyHabits {
   @Test
    public void testSelectBetterMoneyHabits(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectBetterMOneyHabits();
    }
    @Test
    public void testSelectMerrilWealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BetterMoneyHabits bm = PageFactory.initElements(driver, BetterMoneyHabits.class);
        bm.selectMerrillWealthManagement();
    }
}
