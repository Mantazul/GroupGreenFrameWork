package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class DoingBusiness extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Filming on MTA Properties')]")
    public static WebElement filmingMtaProperties;
    @FindBy(xpath = "//a[contains(text(),'Doing Business With Us')]")
    public static WebElement doingBusiness;
    @FindBy(xpath = "//a[@href='http://web.mta.info/nyct/AdvertiseonMetroCard.html']")
    public static WebElement adOnMtaCard;
    @FindBy(xpath = "//a[contains(text(),'Real Estate')]")
    public static WebElement reatState;
    @FindBy(xpath = "//a[contains(text(),'Business Service Center')]")
    public static WebElement businessService;

    public void clickOnDoingBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        doingBusiness.click();
    }
    public DoingBusiness(){}
    public DoingBusiness(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnAdOnMtaCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDoingBusiness();
        adOnMtaCard.click();
    }
    public void clickOnDoingBusinessItems(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        doingBusiness.click();
        element.click();
    }
    public String getDoingBusinessTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        doingBusiness.click();
        String title=doingBusiness.getText();
        System.out.println(title);
        return title;
    }

}
