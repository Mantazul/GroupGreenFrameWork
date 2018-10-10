package FreeShipping;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FreeShippingOnItems extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/a")
    public static WebElement FreeShippingOnItems;
    @FindBy(xpath = "/html/body/div[8]/div/div/a/text()")
    public static WebElement LearnMore;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[9]/div/a/div[3]/div/text()")
    public static WebElement TrackYourOrder;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[11]/div/div/div[1]/div[1]/div[3]/a/text()")
    public static WebElement TargetREDcard;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[11]/div/div/div[1]/div[1]/div[3]/a/text()")
    public static WebElement FreeAndEasyReturns;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[11]/div/div/div[1]/div[2]/div[3]/a/text()")
    public static WebElement ReadMoreFAQs;

    public FreeShippingOnItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FreeShippingOnItems.click();
    }
    public void clickOnLearnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LearnMore.click();
    }
    public void clickOnTrackYourOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TrackYourOrder.click();
    }
    public void clickOnTargetREDcard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TargetREDcard.click();
    }
    public void clickOnFreeAndEasyReturns(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FreeAndEasyReturns.click();
    }
    public void clickOnReadMoreFAQs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReadMoreFAQs.click();
    }
}
