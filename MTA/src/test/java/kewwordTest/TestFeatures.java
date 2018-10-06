package kewwordTest;

import keywordDriven.InputFromXls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FeatureForKeyWord;
import reporting.TestLogger;

import java.io.IOException;

public class TestFeatures  extends FeatureForKeyWord {
    FeatureForKeyWord objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(driver, FeatureForKeyWord.class);
    }
    @Test
    public void testSignInithvalidIdAndPassword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfFeatures.clickOnSignUp();
    }
    @Test
    public void testSignInKeyWord() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InputFromXls xls=new InputFromXls();
        xls.SignInByKeyWord();
    }
}
