package testHomePageTarget;

import homePageTarget.TargetLogin;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TargetLoginTest extends TargetLogin {

TargetLogin targetLogin;
@BeforeMethod

public void init() {
    targetLogin = new TargetLogin(driver);
}
@Test
public void ClickOnTargetLogin(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    clickOnTargetLogin();
}
@Test
public void EnterPassWordF(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    clickOnEnterEmailOrMobile();
}
@Test
public void RecoverPasswordF(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    clickOnForgotPassWord();
    }
}
