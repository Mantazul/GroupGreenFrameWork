package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Transperancy extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"cssmenu1\"]/li[8]/a")
    public WebElement transperancy;

    public void TransperancyByCss(){
        WebElement element = driver.findElement(By.cssSelector("#menu-221-1 > a"));
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        Actions action = new Actions(driver);
        //action.moveToElement(element).perform();
       WebDriverWait wait = new WebDriverWait(driver, 15);
        action.moveToElement(element).perform();
        WebElement element1=driver.findElement(By.cssSelector("#menu-402-1 > a"));
        Actions actions1=new Actions(driver);
        actions1.moveToElement(element1).click();

    }

    public Transperancy(){}
    public Transperancy(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
