package inputSearch;

import ObjectPages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


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
    @Test(priority = 1,enabled = true)
    public void searchInputPage(){
        //homePage.searchBox2();
        searchButton.click();
        boolean actual = driver.findElement(By.cssSelector("#page-title")).isDisplayed();
        boolean expected = true;
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testInputBox(){
        boolean actual=driver.findElement(By.xpath("//*[@id=\"edit-search-keys\"]")).isEnabled();
        boolean expected=true;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void TestTransperancyHover(){
        TransperancyByXpath("//*[@id=\"menu-419-1\"]/a");
    }
    @Test
    public void TesttripPlanner(){
        //clearInputBox(element);
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
    @Test
    public void clear(){
        clearInputBox();
    }
}


