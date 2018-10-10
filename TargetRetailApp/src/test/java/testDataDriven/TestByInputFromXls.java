
package testDataDriven;

import base.CommonAPI;
import homePageTarget.TargetLogin;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class TestByInputFromXls extends CommonAPI {
   DataReader dataReader = new DataReader();
   TargetLogin objLoginPage;

   @BeforeMethod
   public void initialization(){
      objLoginPage = PageFactory.initElements(driver, TargetLogin.class);

   }
   @Test
   public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      sleepFor(3);
      System.out.println("signInWithInvalidIdAndPassword");
   }
}

