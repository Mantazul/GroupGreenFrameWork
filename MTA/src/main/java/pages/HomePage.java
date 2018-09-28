package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "t tdiv selectedStatusTab")
    public WebElement subway;
    @FindBy(id = "railTab")
    public WebElement rail;
    @FindBy(id = "busTab")
    public WebElement bus;
    @FindBy(id = "bntTab")
    public WebElement bridgestunnels;

    public HomePage(){}
    public HomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickOnStatusServicesComponents() {

        driver.findElement(By.id("railTab")).click();
    }
}