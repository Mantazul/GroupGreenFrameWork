package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends CommonAPI {
    @FindBy(css = "#navigation-dropdown")
    public WebElement shopAllDepartments;
    @FindBy()
    public WebElement grocery;
    @FindBy()
    public WebElement businessDelivery;
    @FindBy()
    public WebElement optical;
    @FindBy()
    public WebElement pharmacy;
    @FindBy()
    public WebElement services;
    @FindBy()
    public WebElement photo;
    @FindBy()
    public WebElement location;
    public Homepage(){}
    public Homepage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clicOnShopAllDept(){
        driver.findElement(By.cssSelector("#navigation-dropdown")).click();
    }
    public void hoveringGrocery() throws InterruptedException {
        WebElement element=driver.findElement(By.xpath("//a[@id='Home_Ancillary_0']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
        sleepFor(2);
    }


}
