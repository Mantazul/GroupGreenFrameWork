package homePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TargetGiftCards extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[5]/a")
    public static WebElement GiftCards;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/div/div[2]/div[1]/div/div/a/div[2]/h2")
    public static WebElement OtherBrands;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[2]/div/div/div/div[1]/div[1]/div/div/a/div[2]/h2")
    public static WebElement TargetGiftCards;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div/div/div[1]/div[2]/h3/span")
    public static WebElement VideoGameGiftCards;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[3]/div/div/div/div[2]/div[2]/h3/span")
    public static WebElement CreditCardGiftCards;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[4]/div/div/ul/li[1]/a/div[1]/div/div/picture/img")
    public static WebElement GiftCardByDeliveryType;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[5]/div/div/div/h2")
    public static WebElement TargetGiftCardsHelp;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[5]/div/div/ul/li[1]/a/div[1]/div/div/picture/img")
    public static WebElement FAQs;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[5]/div/div/ul/li[1]/a/div[1]/div/div/picture/img")
    public static WebElement CheckYourBalance;
    @FindBy(xpath = "FraudPreventionInfo")
    public static WebElement FraudPreventionInfo;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div[6]/div/a/div[2]/div/div/text()")
    public static WebElement CorporateAndGiftCards;


    public void clickOnGiftCards (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCards.click();
    }
    public void clickOnOtherBrands(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OtherBrands.click();
    }
    public void clickOnTargetGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TargetGiftCards.click();
    }
    public void clickOnVideoGameGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        VideoGameGiftCards.click();
    }
    public void clickOnCreditCardsGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditCardGiftCards.click();
    }
    public void clickOnGiftCardByDeliveryType(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCardByDeliveryType.click();
    }
    public void clickOnTargetGiftCardsHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TargetGiftCards.click();
    }
    public void clickonFAQs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FAQs.click();
    }
    public void clickOnCheckYourBalance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CheckYourBalance.click();
    }
    public void clickOnFraudPreventionInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FraudPreventionInfo.click();
    }
    public void clickOnCorporateAndGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CorporateAndGiftCards.click();
    }
}
