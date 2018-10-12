package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Maps extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"cssmenu1\"]/li[4]/a")
    public WebElement Maps;
    @FindBy(xpath = "//a[contains(text(),'Subway System')]")
    public WebElement subwaySystem;
    @FindBy(xpath = "//a[contains(text(),'Individual Subway Line Maps')]")
    public WebElement individualSubwayLine;
    @FindBy(xpath = "//a[contains(text(),'Bronx')]")
    public WebElement bronx;
    public Maps(){}
    public Maps(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnMaps(){
        driver.findElement(By.xpath("//a[@href='http://web.mta.info/maps']")).click();
    }
    public String getTitle(){
        clickOnMaps();
        String title=driver.findElement(By.xpath("//strong[contains(text(),'MTA Maps')]")).getText();
        System.out.println(title);
        return title;
    }
    public void clickOnsubwaySystem(){
        clickOnMaps();
        driver.findElement(By.xpath("//a[contains(text(),'Subway System')]")).click();
    }
    public void clickOnindividualSubwayLine(){
        clickOnMaps();
        driver.findElement(By.xpath("//a[contains(text(),'Individual Subway Line Maps')]")).click();
    }
    public void clickOnBronx(){
        clickOnMaps();
        driver.findElement(By.xpath("//a[contains(text(),'Bronx')]")).click();
    }
    public void clickOnBrooklyn(){
        clickOnMaps();
        driver.findElement(By.xpath("//a[contains(text(),'Brooklyn')]")).click();
    }
    public void clickOnManhattan(){
        clickOnMaps();
        driver.findElement(By.xpath("//a[contains(text(),'Manhattan')]")).click();
    }
    public void clickOnQueens(){
        clickOnMaps();
        driver.findElement(By.xpath("//div[@class='span-22']//ul[@class='arrow']//li[4]")).click();
    }
}
