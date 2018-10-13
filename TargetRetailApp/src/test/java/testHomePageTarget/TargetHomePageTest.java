package testHomePageTarget;

import homePageTarget.TargetHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TargetHomePageTest extends TargetHomePage {

    TargetHomePage targetHomePage;
    @BeforeMethod
    public void init () {
        targetHomePage = PageFactory.initElements(driver, TargetHomePage.class);
    }
    @Test
    public void ClickOnRegisterF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnRegisterR();
    }
    @Test
    public void ClickOnWeeklyAddF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnWeeklyAdd();
    }
    @Test
    public void ClickOnRestockF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnRestock();
    }
    @Test
    public void ClickOnRedCardF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnRedCard();
    }
    @Test
    public void ClickOnGiftCardsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnGiftCards();
    }
    @Test
    public void ClickOnFindStoresF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFindStores();
    }
    @Test
    public void ClickOnCatagoriesF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCategories();
    }
    @Test
    public void clickOnDealsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDeals(); }
    @Test
    public void HoverOverF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOver();}
    }
