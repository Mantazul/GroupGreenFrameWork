package pages;

import base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

public class Transperancy extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Transparency')]")
    public WebElement transperancy;
    @FindBy(xpath = "//div[contains(text(),'Capital Program Dashboard')]")
    public static WebElement capital;

    public void TransperancyByCss(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
    public void hoverTransperancy() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Transparency')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
       WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'Capital Program Dashboard')]"));
       sleepFor(3);
       action.moveToElement(element1).click().perform();
    }
    public String getTitleFromCapitalProgram() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverTransperancy();
        String title=capital.getText();
        System.out.println(title);
    return title;
    }
    public Transperancy(){}
    public Transperancy(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
