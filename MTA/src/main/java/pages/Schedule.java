package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class Schedule extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"culverline\"]")
    public static WebElement subWay;
    @FindBy(xpath = "//*[@id=\"node-298556\"]/div/div/div/div/div[2]/p/a/img")
    public static WebDriver statenIslandBUsImg;
    public void clickOnSchedule() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id=\"menu-399-1\"]/a")).click();
    }
    public void clickOnsubWay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        subWay.getText();
        System.out.println("prnting"+subWay);
    }
    public void clickOnImg(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      WebElement  statenIslandBUsImg=driver.findElement(By.xpath("//*[@id=\"node-298556\"]/div/div/div/div/div[2]/p/a/img"));
      statenIslandBUsImg.click();
    }
    public Schedule(){}
    public Schedule(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
