package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class TripsPlanner extends CommonAPI {


    public TripsPlanner(){}
    public TripsPlanner(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnserviceInArea()
    { TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id=\"divSIA\"]")).click();
    }
    public void fillOutForm(String Local,String Destination,String Date){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id=\"txtOriginInput\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtOriginInput\"]")).sendKeys(Local);
        driver.findElement(By.xpath("//*[@id=\"txtDestinationInput\"]")).clear();
        driver.findElement(By.xpath(("//*[@id=\"txtDestinationInput\"]"))).sendKeys(Destination);
        driver.findElement(By.xpath("//*[@id=\"fdate\"]")).sendKeys(Date);
        waitUntilClickAble(By.xpath("//*[@id=\"xmodeX\"]"));
    }
    public void arrival(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       // driver.findElement(By.xpath("//*[@id=\"DepId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ArrId\"]")).click();
        WebElement element=driver.findElement(By.xpath("//*[@id=\"ddlHour\"]"));
        Select select=new Select(element);
        select.selectByIndex(4);
        WebElement minute=driver.findElement(By.xpath("//*[@id=\"ddlMinute\"]"));
        Select select1=new Select(minute);
        select1.selectByIndex(5);
        WebElement timeFormat=driver.findElement(By.xpath("//*[@id=\"ddlampm\"]"));
        Select select2=new Select(timeFormat);
        select2.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
    }
    public void clickOnAdvance(){
        driver.findElement(By.xpath("//a[@onclick=\"SmartTripClick('ADVANCEOPTION','' ,'' )\"]")).click();
    }
    public String getAdvanceTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAdvance();
        String title=driver.findElement(By.xpath("//a[@onclick=\"SmartTripClick('ADVANCEOPTION','' ,'' )\"]")).getText();
        System.out.println(title);
        return title;
    }
    public String getTripsPlannerTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));clickOnAdvance();
        sleepFor(2);
        String title=driver.findElement(By.xpath("//img[@id='ctl00_Img2']")).toString();
        System.out.println(title);
        return title;
    }
    public void hoveringTripPlanner() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAdvance();
        sleepFor(2);
        mouseHoverByXpath("//a[contains(text(),'Trip Planners')]");
        sleepFor(2);
    }
    public void selectHoveringItem() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoveringTripPlanner();
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Service In the Area')]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
}
