package homePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

}
