package testDataConnection;

import dataConnection.SignInData;
import databases.ConnectToMongoDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MongoConnection extends SignInData {
    @Test
    public void DropDownList (){
        insertDataIntoDatabase();
    }
    @Test
    public void readData() {
        List<WebElement> expectedData = driver.findElements(By.xpath("//*[@id=\"stateListId\"]/option"));
        List<String> actualData = LocationListFromMongoDB("Current_state","state");
        for(int i = 0; i <actualData.size(); i++){
            System.out.println(actualData.get(i));
        }
    }
}


