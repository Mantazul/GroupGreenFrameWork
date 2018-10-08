package databaseTest;

import org.apache.commons.codec.language.bm.Languages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DatabaseData;
import reporting.TestLogger;

import java.util.List;

public class TestMongoDB extends DatabaseData {
    DatabaseData data;
    String Languages;
    @BeforeMethod
    public void init(){
        data=new DatabaseData(driver);
    }
    @Test
    public void insertLanguageListTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inserDataIntoDatabase();
       }
    @Test
    public void readDataTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readData();
       }
}



