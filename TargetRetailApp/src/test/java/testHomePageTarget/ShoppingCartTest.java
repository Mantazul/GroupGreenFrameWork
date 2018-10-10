package testHomePageTarget;

import homePageTarget.TargetShoppingCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TargetShoppingCart {

    TargetShoppingCart shoppingCart ;

    @BeforeMethod
    public void init() {
        shoppingCart = PageFactory.initElements(driver, TargetShoppingCart.class);
    }
    @Test
    public void ClickOnShoppingCartF() {
        clickOnShoppingCart();
    }
    @Test
    public void ClickOnAddQuantityF() {
        clickOnAddQuantity();
    }
    @Test
    public void ClickOnChangeQuantityF() {
        clickOnChangeQuantity();
    }
    @Test
    public void ClickOnShippingF() {
        clickOnShipping();
    }
    @Test
    public void ClickOnOrderIncludesAGiftF() {
        clickOnOrderIncludesAGift();
    }
    @Test
    public void ClickOnPromoCodeF() {
        clickOnPromoCode();
    }
    @Test
    public void ClickOnRecentBrowsing() {
        super.clickOnRecentBrowsing();
    }
}

