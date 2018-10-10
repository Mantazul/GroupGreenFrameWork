package FreeShippingOnItemsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FreeShippingOnItemsTest extends FreeShipping.FreeShippingOnItems {

    FreeShipping.FreeShippingOnItems ObjFreeShippingOnItems;
    @BeforeMethod
    public void init() {ObjFreeShippingOnItems = PageFactory.initElements(driver, FreeShipping.FreeShippingOnItems.class);}
    @Test
    public void FreeShippingOnItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FreeShippingOnItems();}
    @Test
    public void LearnMoreF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLearnMore();}
    @Test
    public void TrackYourOrderF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTrackYourOrder();}
    @Test
    public void TargetREDcardF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTargetREDcard();}
    @Test
    public void ReadMoreFAQsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnReadMoreFAQs();}
}

