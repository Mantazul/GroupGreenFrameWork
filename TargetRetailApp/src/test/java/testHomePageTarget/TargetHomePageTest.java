package testHomePageTarget;

import homePageTarget.TargetHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetHomePageTest extends TargetHomePage {

    TargetHomePage ObjTargetHomePage;
    @BeforeMethod
    public void init () {
        ObjTargetHomePage = PageFactory.initElements(driver, TargetHomePage.class);
    }
    @Test
    public void ClickOnRegisterF(){

        clickOnRegisterR();
    }
    @Test
    public void ClickOnWeeklyAddF(){

        clickOnWeeklyAdd();
    }
    @Test
    public void ClickOnRestockF(){

        clickOnRestock();
    }
    @Test
    public void ClickOnRedCardF(){

        clickOnRedCard();
    }
    @Test
    public void ClickOnGiftCardsF(){

        clickOnGiftCards();
    }
    @Test
    public void ClickOnFindStoresF(){

        clickOnFindStores();
    }
    @Test
    public void ClickOnCatagoriesF(){

        clickOnCategories();
    }
    @Test
    public void clickOnDealsF(){
        clickOnDeals(); }
    @Test
    public void HoverOverF(){
        hoverOver();}
    }
