package ObjectPages;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//*[@id=\"subwayDiv\"]/ul/li[1]/a")
    public static WebElement searchStatusComponentTheWeekDay;
    @FindBy(className="t tdiv selectedStatusTab")
    public static WebElement searchStatusComponentRail;
    @FindBy(id="busTab")
    public static WebElement searchStatusComponentBus;

    @FindBy(id="bntTab")
    public static WebElement searchStatusComponentBridgesTunnels;
@FindBy(id="edit-submit")
    public static WebElement searchButton;
    @FindBy(css = "#block-gtranslate-gtranslate > div > select")
    public static WebElement selectLanguage;
    public HomePage(){};

    public HomePage(WebDriver driver)
    {   this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //checkComponentsOfServiceStatus
    public void SearchComponentsOfServiceStatus(){
        searchStatusComponentBridgesTunnels.click();
    }

    public void Screenshots() throws IOException {
        driver.findElement(By.xpath("//*[@id='edit-search-keys']")).sendKeys("schedule",Keys.ENTER);
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./screenShots/mta.png"));


    }
    public void hoverHomePageByXpath(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    public void TransperancyByXpath(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//a[text()='Board Materials']")).click();

    }
    public void clearInputBox()
    {
       driver.findElement(By.xpath("//*[@id=\"txtOriginInput\"]")).clear();

    }
    public void tripPlanner(){

      typeOnInputField("//*[@id=\"txtOriginInput\"]","NewYork");
      typeOnInputField("//*[@id=\"txtDestinationInput\"]","Virginia");
    }
    public void selectLanguage(){
        selectLanguage.click();
       Select select=new Select(selectLanguage);
       select.selectByIndex(1);
    }
    public void searchBox(){
        typeOnInputField("//*[@id=\"edit-search-keys\"]","schedule");
        searchButton.click();}


    public void searchBox2(){
        typeOnInputField("//*[@id=\"edit-search-keys\"]","Schedules");
        searchButton.click();
    }

}



