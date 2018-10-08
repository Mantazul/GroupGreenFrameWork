package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class PlannedServiceChange extends CommonAPI {

    public void getPlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement plannedService1=driver.findElement(By.xpath("//a[contains(text(),'Planned Service Changes')]"));
        plannedService1.click();
        WebElement transitTax=driver.findElement(By.xpath("//img[@src='/nyct/images/TransitTrax_logo.jpg']"));
        transitTax.click();
    }
    public String textPlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPlan();
        String s= getTextByXpath("//h1[contains(text(),'TransitTrax')]");
        System.out.println(s);
        return  s;
    }
        public PlannedServiceChange(){}
        public PlannedServiceChange(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void subwaysChange(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement plannedService1=driver.findElement(By.xpath("//a[contains(text(),'Planned Service Changes')]"));
        plannedService1.click();
        WebElement subWaysChange=driver.findElement(By.xpath("//span[contains(text(),'Subways')]"));
        subWaysChange.click();
    }
    public void fLineRoute() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));subwaysChange();
        driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rblF']")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ImageButton1")).click();
    }
    public void description() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fLineRoute();
        sleepFor(2);
        driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_linkExpand")).click();
    }
}
