package testMtaInfo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MtaInfo;

public class TestMtaInfo extends MtaInfo{
    MtaInfo info;
    @BeforeMethod
    public void init(){
        info=new MtaInfo(driver);
    }
    @Test
    public void testMtaInfo(){
        clickOnMtaInfo();
    }
    @Test
    public void getMtaTitle(){
       String actual=MtaTitle();
        Assert.assertEquals(actual,"MTA Info");
    }
    @Test
    public void AboutMtaTest(){
        aboutMta(MtaInfo,AboutMta);
    }
}
