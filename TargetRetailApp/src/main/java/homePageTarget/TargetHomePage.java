package homePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class TargetHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[1]/a/span")
    public static WebElement Register;
    @FindBy(xpath = "//*[@id=\\\"header\\\"]/div[1]/div[2]/div[1]/ul/li[1]/a/span")
    public static WebElement WeeklyAdd;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[4]/a/span")
    public static WebElement ReStock;
    @FindBy(xpath = "//*[@id=\\\"header\\\"]/div[1]/div[2]/div[1]/ul/li[3]/a/span")
    public static WebElement ClickOnRedCard;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[5]/a/span")
    public static WebElement GiftCards;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[6]/a/span")
    public static WebElement FindStores;
    @FindBy(xpath = "//*[@id=\"secondary\"]")
    public static WebElement Categories;
    @FindBy(xpath = "//*[@id=\"secondary\"]")
    public static WebElement Deals;
    @FindBy(css = "#cart")
    public static WebElement Cart;
    @FindBy(css = "#mainContainer > div:nth-child(2)")
    public static WebElement ViewCart;

    public TargetHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
    public void clickOnRegisterR() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Register.click();
    }
    public void clickOnWeeklyAdd() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WeeklyAdd.click();
    }
    public void clickOnRestock() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReStock.click();
    }
    public void clickOnRedCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnRedCard.click();
    }
    public void clickOnGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GiftCards.click();
    }
    public void clickOnFindStores(){
        FindStores.click();
    }
    public void clickOnCategories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Categories.click();
    }
    public void clickOnDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Deals.click();
    }
    public void hoverOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(Cart).perform();
        actions.moveToElement(ViewCart).click().perform();
    }
}
