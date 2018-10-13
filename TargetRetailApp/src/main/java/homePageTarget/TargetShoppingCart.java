package homePageTarget;

import base.CommonAPI;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class TargetShoppingCart extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"cart\"]")
    public static WebElement ShoopingCart;
    @FindBy(xpath = "//*[@id=\"cart\"]")
    public static WebElement AddQuantity;
    @FindBy(xpath = "//*[@id=\"select_58\"]")
    public static WebElement ChangeQuantity;
    @FindBy(xpath = "//*[@id=\"cart-container\"]/div[1]/div[1]/div[5]/div[2]/div/div[2]/h2")
    public static WebElement Shipping;
    @FindBy(xpath = "//*[@id=\"STEP_DELIVERYMETHOD\"]/div[2]/div[1]/div/div[3]/div/div/div/div[2]/div/label/div/div[1]/div[1]")
    public static WebElement ShippingToStore;
    @FindBy(xpath = "<p>My order includes a gift.</p>")
    public static WebElement OrderIncludesAGift;
    @FindBy(xpath = "//*[@id=\"promoCodeEntry\"]")
    public static WebElement PromoCode;
    @FindBy(xpath = "//*[@id=\"cart-recommendations-container\"]/div/div/div[1]/h2")
    public static WebElement RecentBrowsing;
    @FindBy(xpath = "//*[@id=\"orderSummaryWrapperDiv\"]/div/div/div[2]/button/text()")
    public static WebElement ReadyToCheckOut;

    public TargetShoppingCart() { }
    public void clickOnShoppingCart() {
         //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ShoopingCart.click();
        String Actual = "Your cart is empty";
        String Expected = driver.findElement(By.xpath("//*[@id=\"cart-container\"]/div/div[1]/div[1]/div/div[2]")).getText();
        Assert.assertEquals(Actual,Expected);
    }
    public void clickOnAddQuantity() {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AddQuantity.click();
        String Actual = "QTY 2";
        String Expected = driver.findElement(By.xpath("//*[@id=\"select_22\"]")).getText();
        Assert.assertEquals(Actual,Expected);
    }
    public void clickOnChangeQuantity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ChangeQuantity.click();
    }
    public void clickOnShipping() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Shipping.click();
    }
    public void clickOnOrderIncludesAGift() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OrderIncludesAGift.click();}

    public void clickOnPromoCode() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PromoCode.click();}

    public void clickOnRecentBrowsing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RecentBrowsing.click();}

    public void clickOnCheckOut(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReadyToCheckOut.click();}
    }