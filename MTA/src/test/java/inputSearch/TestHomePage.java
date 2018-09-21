package inputSearch;

import ObjectPages.HomePage;
import ObjectPages.SchedulePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestHomePage extends HomePage
{
HomePage homePage;
    @BeforeMethod
    public void initialize(){
      homePage = new HomePage(driver);
    }
    @Test
    public void Test(){
       searchBox();}

    public void TestSchedules(){

    }
   @Test
    public void TesthoverHomePage(){
       hoverHomePageByXpath("//*[@id=\"menu-221-1\"]/a");
    }
    WebElement element;
    Actions action;
    @Test
    public void TestTransperancyHover(){
        TransperancyByXpath("//*[@id=\"menu-419-1\"]/a");

    }
    @Test
    public void TesttripPlanner(){
        clearInputBox(element);
        tripPlanner();
    }
    @Test
    public void TestSelectLanguage(){
        selectLanguage();
    }
    @Test
    public void screenShotTest() throws IOException {
        Screenshots();
    }
}


