package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.LinkedList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(id = "busTab")
    public WebElement bus;
    @FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]")
    public WebElement bridgestunnels;
    @FindBy(xpath = "//input[@id='searchinputbox']")
    public static WebElement inputBox;

    public HomePage(){}
    public HomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnStatusServicesComponents() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("railTab")).click();
    }
    public void clickOnSubWay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("railTab")).click();
    }
    public void clickOnBus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//li[@id='busTab']")).click();
    }
    public void searchInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//input[@id='edit-search-keys']")).sendKeys("Schedules");
    }
    public void clickOnBridge(){
        driver.findElement(By.xpath("//li[@id='bntTab']")).click();
    }
    public List<String> selectLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> languages=driver.findElements(By.xpath("//select[@onchange='doGTranslate(this);']"));
            List<String>listOfLanguage=new LinkedList<String>();
            for(WebElement it:languages){
                listOfLanguage.add(it.getText());
            }
            return listOfLanguage;
        }
        public void searchButton() throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            searchInput();
            driver.findElement(By.className("form-submit")).click();
            sleepFor(2);
        }
        public void employment(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            driver.findElement(By.xpath("//a[contains(text(),'Employment')]")).click();
        }
        public void eMtaHeadQuarter(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            employment();
            driver.findElement(By.xpath("//a[contains(text(),'MTA Headquarters')]")).click();
        }
        public void eMtaBusiness(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            employment();
            driver.findElement(By.xpath("//a[contains(text(),'MTA Business Service Center')]")).click();
        }


    }
