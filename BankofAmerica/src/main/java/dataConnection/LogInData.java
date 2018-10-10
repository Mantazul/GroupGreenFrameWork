package dataConnection;

import base.CommonAPI;
import databases.ConnectToMongoDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import java.util.List;


public class LogInData extends ConnectToMongoDB {

   public void inserDataIntoDatabase(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("NAV_CONTACT_US")).click();
        List<WebElement> locations =driver.findElements(By.xpath("//*[@id=\"stateListId\"]/option"));
        insertIntoMongoDB(locations,"Current_state","state");
    }
    public void readData(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> locationListFromMongoDB=LocationListFromMongoDB("Current_state","state");
        for(String element:locationListFromMongoDB){
            System.out.println(element);
        }
    }
    public LogInData(){}
    public LogInData(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);}
}