package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtaInfo extends CommonAPI {
    public MtaInfo(){}
    public MtaInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'MTA Info')]")
    public static WebElement MtaInfo;
    @FindBy(xpath = "//a[contains(text(),'About the MTA')]")
    public static WebElement AboutMta;
    public void clickOnMtaInfo(){
        MtaInfo.click();
    }
    public String MtaTitle(){
        MtaInfo.click();
        String title=MtaInfo.getText();
        System.out.println(title);
        return title;
    }
    public void aboutMta(WebElement element1,WebElement element2){
        element1.click();element2.click();
    }

}
