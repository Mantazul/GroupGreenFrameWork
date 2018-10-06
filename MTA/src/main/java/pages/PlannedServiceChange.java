package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class PlannedServiceChange extends CommonAPI {
    /*@FindBy(xpath = "//img[@src='/nyct/images/TransitTrax_logo.jpg']")
   public WebElement transitTax;*/
    public void getPlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement plannedService1=driver.findElement(By.xpath("//a[contains(text(),'Planned Service Changes')]"));
        plannedService1.click();
        WebElement transitTax=driver.findElement(By.xpath("//img[@src='/nyct/images/TransitTrax_logo.jpg']"));
        transitTax.click();
        String s=transitTax.getText();
    }
    public String textPlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       String s= getTextByXpath("//img[@src='/nyct/images/TransitTrax_logo.jpg']");
    return  s;}


    public PlannedServiceChange(){}
    public PlannedServiceChange(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
