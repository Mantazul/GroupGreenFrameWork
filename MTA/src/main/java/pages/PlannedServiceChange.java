package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlannedServiceChange extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"cssmenu1\"]/li[5]/a")
   public WebElement plannedService;


    public void getTextPlan(){
        WebElement plannedService1=driver.findElement(By.xpath("//*[@id=\"cssmenu1\"]/li[5]"));
        plannedService1.click();
    }
    public PlannedServiceChange(){}
    public PlannedServiceChange(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
