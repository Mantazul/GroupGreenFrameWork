package testHomePageTarget;

import homePageTarget.TargetGiftCards;
import homePageTarget.TargetShoppingCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TargetGiftCardsTest extends TargetGiftCards {

    TargetGiftCards giftCards;

    @BeforeMethod
    public void init() {
        giftCards = PageFactory.initElements(driver, TargetGiftCards.class);
    }
    @Test
    public void clickGiftCardsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnGiftCards();
    }
    @Test
    public void clickOtherBrandsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnOtherBrands();
    }
    @Test
    public void clickTargetGiftCardsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTargetGiftCards();
    }
    @Test
    public void clickOnVideoGiftCardsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnVideoGameGiftCards();
    }
    @Test
    public void clickOnGiftCardByDeliveryTypeF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnVideoGameGiftCards();
    }
    @Test
    public void clickOnTargetGiftCardsHelpF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTargetGiftCardsHelp();
    }
    @Test
    public void clickOnFAQsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickonFAQs();
    }
    @Test
    public void clickOnCheckYourBalanceF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCheckYourBalance();
    }
    @Test
    public void clickOnFraudPreventionInfoF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFraudPreventionInfo();
    }
    @Test
    public void clickOnCorporateAndGiftCardsF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnCorporateAndGiftCards();
    }
}
