package kewwordTest;

import keywordDriven.InputFromXls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FeatureForKeyWord;

import java.io.IOException;

public class TestFeatures  extends FeatureForKeyWord {
    FeatureForKeyWord objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(driver, FeatureForKeyWord.class);
    }
    @Test
    public void testSignInithvalidIdAndPassword() throws IOException, InterruptedException {
        objOfFeatures.clickOnSignUp();
    }
    @Test
    public void testSignInKeyWord() throws Exception {
        InputFromXls xls=new InputFromXls();
        xls.SignInByKeyWord();
    }
}
