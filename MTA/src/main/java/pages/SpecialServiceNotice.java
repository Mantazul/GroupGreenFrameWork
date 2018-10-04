package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialServiceNotice extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'238 St')]")
    public static WebElement st238;
    @FindBy(xpath = "//div//span[1]//span[1]")
    public static WebElement spanFrame;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/img[1]")
    public static WebElement image;

    public SpecialServiceNotice(){}
    public SpecialServiceNotice(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOn238St(){
        st238.click();
    }
    public void switchToFrame(){
        //driver.switchTo().activeElement().getText();
        st238.click();
        //iframeHandle(spanFrame);
        spanFrame.isDisplayed();
        System.out.println(spanFrame);
    }
    public void getImageInfo(){
        st238.click();
        image.getSize();
        System.out.println(image);
    }

}
