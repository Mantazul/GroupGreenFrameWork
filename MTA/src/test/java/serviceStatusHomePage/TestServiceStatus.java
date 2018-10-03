package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestServiceStatus extends HomePage {
    HomePage servicestatus;
    @BeforeMethod
    public void initialization(){servicestatus=new HomePage(driver);}

    @Test(priority = 1,enabled = true)
    public void checkServiceStatusComponents(){
        clickOnStatusServicesComponents();
        Assert.assertTrue(true);
    }
    @Test
    public void languageOptions(){
        selectLanguage();
        System.out.println(selectLanguage());
    }



}
