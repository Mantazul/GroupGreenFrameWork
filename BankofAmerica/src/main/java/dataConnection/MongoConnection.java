package dataConnection;

import base.CommonAPI;
import databases.ConnectToMongoDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MongoConnection extends ConnectToMongoDB {
    @Test
    public void DropDownList (){
        driver.findElement(By.id("NAV_CONTACT_US")).click();
        List<WebElement> dropdownlist= driver.findElements(By.xpath("//*[@id=\"stateListId\"]/option"));
       insertIntoMongoDB(dropdownlist,"Current_State","state");
    }
    @Test
    public void readData() {
        List<WebElement> expectedData = driver.findElements(By.xpath("//*[@id=\"stateListId\"]/option"));
        List<String> actualData =readLanguageListFromMongoDB("Current_State","state");
        for(int i=0;i<actualData.size();i++){
            Assert.assertEquals(actualData.get(i),expectedData.get(i).getText());
        }
    }
}


//*[@id="stateListId"]