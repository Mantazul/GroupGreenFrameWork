package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BetterMoneyHabits extends CommonAPI {

    @FindBy(xpath = "//span[text()='Better Money Habits®']")public WebElement betterMoneyHabits;
    @FindBy(css = "#merrillWealthManagement")public WebElement merrillWealthManagement;
    public void selectBetterMOneyHabits(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        betterMoneyHabits.click();
    }
    public void selectMerrillWealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBetterMOneyHabits();
        merrillWealthManagement.click();
    }
}
