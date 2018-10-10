package testHomePageTarget;

import homePageTarget.TargetLogin;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetLoginTest extends TargetLogin {

TargetLogin targetLogin;
@BeforeMethod
public void init() {
    targetLogin = new TargetLogin(driver);
}
@Test
public void ClickOnTargetLoginF(){

    clickOnTargetLogin();
}
@Test
public void EnterPassWordF(){

    clickOnEnterEmailOrMobile();
}
@Test
public void RecoverPasswordF(){

    //clickOnForgotPassWord();
}
}
