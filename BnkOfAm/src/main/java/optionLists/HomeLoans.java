package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        selectHomeLoans();
        refinance.click();
    }
    public void selectHomeEquity(){
        selectHomeLoans();
        homeEquity.click();
    }
    public void selectFindHome(){
        selectHomeLoans();
        findHome.click();
    }
    public void selectFirstTimeHomebuyer(){
        selectHomeLoans();
        firsTimeHomeBuyer.click();
    }
}
