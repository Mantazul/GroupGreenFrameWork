package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BetterMoneyHabits extends CommonAPI {

    @FindBy(xpath = "//span[text()='Better Money Habits®']")public WebElement betterMoneyHabits;
    @FindBy(css = "#merrillWealthManagement")public WebElement merrillWealthManagement;
    public void selectBetterMOneyHabits(){
        betterMoneyHabits.click();
    }
    public void selectMerrillWealthManagement(){
        selectBetterMOneyHabits();
        merrillWealthManagement.click();
    }
}
