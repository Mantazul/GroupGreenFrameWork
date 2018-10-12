package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomeLoans extends CommonAPI {

    @FindBy(xpath = "//span[text()='Home Loans']")public WebElement homeLoans;
    @FindBy(id = "mortgages")public WebElement mortgages;
    @FindBy(id="refinance")public WebElement refinance;
    @FindBy(id = "homeEquity")public WebElement homeEquity;
    @FindBy(id = "findAHome")public WebElement findHome;
    @FindBy(id = "firstTimeHomeBuyer")public WebElement firsTimeHomeBuyer;
    public void selectHomeLoans(){
        homeLoans.click();
    }
    public void selectMortgages(){
        selectHomeLoans();
        mortgages.click();
    }
    public void selectRefinance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectHomeLoans();
        refinance.click();
    }
    public void selectHomeEquity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectHomeLoans();
        homeEquity.click();
    }
    public void selectFindHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectHomeLoans();
        findHome.click();
    }
    public void selectFirstTimeHomebuyer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectHomeLoans();
        firsTimeHomeBuyer.click();
    }
}
