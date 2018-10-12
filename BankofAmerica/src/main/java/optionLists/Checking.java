package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Checking extends CommonAPI {

    @FindBy(xpath = "//span[text()='Checking'][1]") public WebElement chekingMenu;
    @FindBy(id = "coreChecking")public WebElement coreCheking;
    @FindBy(id="interestChecking")public WebElement interestChecking;
    @FindBy(id="studentBanking")public WebElement studenBanking;
    @FindBy(id = "businessChecking")public WebElement busunessChecking;
    @FindBy(id = "navCheckingOnlineBanking")public WebElement checkingOnlineBanking;
    @FindBy(id = "navCheckingMobileBanking")public WebElement chekingMobileBanking;
    public WebElement getChekingMenu() {
        return chekingMenu;
    }
    public void setChekingMenu(WebElement chekingMenu) {
        this.chekingMenu = chekingMenu;
    }
    public void selectCheking(){
        getChekingMenu().click();
    }
    public void selectCoreChecking(){
        selectCheking();
        coreCheking.click();
    }
    public void selectInterestCheking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCheking();
        interestChecking.click();
    }
    public void selectStudentBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCheking();
        studenBanking.click();
    }
    public void selectBusinessCheking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCheking();
        busunessChecking.click();
    }
    public void selectCheckingOnlineBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCheking();
        checkingOnlineBanking.click();
    }
    public void selectChekingMobileBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCheking();
        chekingMobileBanking.click();
    }
}
