package testHomePageTarget;

import homePageTarget.TargetShoppingCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ShoppingCartTest extends TargetShoppingCart {

    TargetShoppingCart shoppingCart ;

    @BeforeMethod
    public void init() {
        shoppingCart = PageFactory.initElements(driver, TargetShoppingCart.class);
    }
    @Test
    public void ClickOnShoppingCartF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShoppingCart();
    }
    @Test
    public void ClickOnAddQuantityF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAddQuantity();
    }
    @Test
    public void ClickOnChangeQuantityF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnChangeQuantity();
    }
    @Test
    public void ClickOnShippingF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShipping();
    }
    @Test
    public void ClickOnOrderIncludesAGiftF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnOrderIncludesAGift();
    }
    @Test
    public void ClickOnPromoCodeF() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnPromoCode();
    }
    @Test
    public void ClickOnRecentBrowsing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        super.clickOnRecentBrowsing();
    }
}

