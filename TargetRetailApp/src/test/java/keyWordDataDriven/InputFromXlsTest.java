package keyWordDataDriven;

import keyWordDriven.InputFromXls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class InputFromXlsTest extends InputFromXls {
    InputFromXls objInputXls;
    @BeforeMethod
    public void initializePage(){
      objInputXls = PageFactory.initElements(driver, InputFromXls.class);
    }
    @Test
    public void testSignInByKeyWord() throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objInputXls.logInToTarget();
    }
}
