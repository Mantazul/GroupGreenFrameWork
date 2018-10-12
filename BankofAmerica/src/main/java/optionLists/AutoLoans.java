package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AutoLoans extends CommonAPI {

    @FindBy(xpath = "//span[text()='Auto Loans']") public WebElement autoLoans;
    @FindBy(id = "autoApplyNow") public WebElement autoApplyNow;
    @FindBy(id = "autoLoanRates")public WebElement autoLoanRates;
    @FindBy(id= "calculateAutoLoanPayment")public WebElement calculateAutoLoanPayment;
    @FindBy(id = "checkAutoStatus")public WebElement checkAutoStatus;
    @FindBy(id = "findAndFinanceYourNextCar")public WebElement findAndFinanceYourNextCar;
    public void selectAutoLoans(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        autoLoans.click();
    }
    public void selectAutoApplyNow(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAutoLoans();
        autoApplyNow.click();
    }
    public void selectAutoLoanRates(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAutoLoans();
        autoLoanRates.click();
    }
    public void selectCalculateAutoLoanPayment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAutoLoans();
        calculateAutoLoanPayment.click();
    }
    public void selectCheckAutoStatus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAutoLoans();
        checkAutoStatus.click();
    }
    public void selectFindAndFinaceYourNextCar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAutoLoans();
        findAndFinanceYourNextCar.click();
    }
}
