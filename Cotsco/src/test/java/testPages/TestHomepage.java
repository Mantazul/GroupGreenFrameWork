package testPages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;

public class TestHomepage extends Homepage {
    Homepage homepage;
    @BeforeMethod
    public void init(){
        homepage=new Homepage(driver);
    }
    @Test
    public void testShopAllDept(){
        clicOnShopAllDept();
    }
    @Test
    public void testGrocery() throws InterruptedException {
        hoveringGrocery();
    }
}
