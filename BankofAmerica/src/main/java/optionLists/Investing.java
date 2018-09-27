package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Investing extends CommonAPI {

    @FindBy(xpath = "//span[text()='Investing'][1]")public WebElement investing;
    @FindBy(id = "retirementPlanning")public WebElement retirementPlanning;
    @FindBy(id = "rollovers")public WebElement rollovers;
    @FindBy(id = "collegeSavingsPlans")public WebElement collgeSavingsPlans;
    @FindBy(id = "investmentProducts")public WebElement investmentProducts;
    @FindBy(id = "usTrustWealthManagement")public WebElement usTrustWealthManagement;
    @FindBy(id="merrillWealthManagement")public WebElement merrilWealthManagement;
    public void selectInvesting(){
        investing.click();
    }
    public void selectRetimentPlanning(){
        selectInvesting();
        retirementPlanning.click();
    }
    public void selectRollovers(){
        selectInvesting();
        rollovers.click();
    }
    public void selectCollegeSavingsPlans(){
        selectInvesting();
        collgeSavingsPlans.click();
    }
    public void selectInvestmentProducts(){
        selectInvesting();
        investmentProducts.click();
    }
    public void selectUsTrustWealthManagement(){
        selectInvesting();
        usTrustWealthManagement.click();
    }
    public void selectMerrilWealthManagement(){
        selectInvesting();
        merrilWealthManagement.click();
    }
}
