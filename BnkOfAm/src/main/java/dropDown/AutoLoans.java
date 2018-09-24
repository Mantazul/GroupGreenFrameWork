package dropDown;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoLoans extends CommonAPI {

    @FindBy(xpath = "//span[text()='Auto Loans']") public WebElement autoLoans;
    @FindBy(id = "autoApplyNow") public WebElement autoApplyNow;
    @FindBy(id = "autoLoanRates")public WebElement autoLoanRates;
    @FindBy(id= "calculateAutoLoanPayment")public WebElement calculateAutoLoanPayment;
    @FindBy(id = "checkAutoStatus")public WebElement checkAutoStatus;
    @FindBy(id = "findAndFinanceYourNextCar")public WebElement findAndFinanceYourNextCar;
    public void selectAutoLoans(){
        autoLoans.click();
    }
    public void selectAutoApplyNow(){
        selectAutoLoans();
        autoApplyNow.click();
    }
    public void selectAutoLoanRates(){
        selectAutoLoans();
        autoLoanRates.click();
    }
    public void selectCalculateAutoLoanPayment(){
        selectAutoLoans();
        calculateAutoLoanPayment.click();
    }
    public void selectCheckAutoStatus(){
        selectAutoLoans();
        checkAutoStatus.click();
    }
    public void selectFindAndFinaceYourNextCar(){
        selectAutoLoans();
        findAndFinanceYourNextCar.click();
    }
}
