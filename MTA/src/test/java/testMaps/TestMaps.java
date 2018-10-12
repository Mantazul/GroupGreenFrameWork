package testMaps;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Maps;

public class TestMaps extends Maps {
    Maps maps;
    @BeforeMethod
    public void init(){
        maps=new Maps(driver);
    }
    @Test
    public void testClickOnMaps(){
        clickOnMaps();
    }
    @Test
    public void testMapsTitle(){
        getTitle();
    }
    @Test
    public void testSubwaySystem(){
        clickOnsubwaySystem();
    }
    @Test
    public void testIndividualSubway(){
        clickOnindividualSubwayLine();
    }
    @Test
    public void testBronx(){
        clickOnBronx();
    }
    @Test
    public void testBroolyn(){
        clickOnBrooklyn();
    }
    @Test
    public void testManhattan(){
        clickOnManhattan();
    }
    @Test
    public void testQueens(){
        clickOnQueens();
    }
}
