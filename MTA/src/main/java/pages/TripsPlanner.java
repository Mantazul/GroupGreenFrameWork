package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TripsPlanner extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"divCP\"]")
    public WebElement customPlanner;
    @FindBy(xpath = "//*[@id=\"divSIA\"]")
    public WebElement serviceInTheArea;
    @FindBy(xpath = "//*[@id=\"divSCH\"]")
    public WebElement Schedules;
    @FindBy(xpath = "//*[@id=\"txtOriginInput\"]")
    public WebElement inputBoxFrom;
    @FindBy(xpath = "//*[@id=\"txtDestinationInput\"]")
    public WebElement inputBoxTo;

    public TripsPlanner(){}
    public TripsPlanner(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnserviceInArea(){
        driver.findElement(By.xpath("//*[@id=\"divSIA\"]")).click();
    }
    public void fillOutForm(String Local,String Destination,String Date){
        driver.findElement(By.xpath("//*[@id=\"txtOriginInput\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"txtOriginInput\"]")).sendKeys(Local);
        driver.findElement(By.xpath("//*[@id=\"txtDestinationInput\"]")).clear();
        driver.findElement(By.xpath(("//*[@id=\"txtDestinationInput\"]"))).sendKeys(Destination);
        driver.findElement(By.xpath("//*[@id=\"fdate\"]")).sendKeys(Date);
        driver.findElement(By.xpath("//*[@id=\"xmodeX\"]")).click();
    }
    public void arrival(){
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

}
