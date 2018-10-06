package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

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
    @FindBy(xpath = "//a[contains(text(),'Budget and Financial Statements')]")
    public static WebElement FinancialInfo;
    @FindBy(xpath = "//a[contains(text(),'MTA Police')]")
    public static WebElement MtaPolice;
    @FindBy(xpath = "//img[@src='images/logo-accredited.jpg']")
    public static WebElement AccridetetAgency;
    @FindBy(xpath = "//input[@id='rn_SimpleSearch_43_SearchField']")
    public static WebElement MtaPoliceSearchBox;
    @FindBy(xpath = "//span[@class='rn_ButtonLabel']")
    public static WebElement searchButtonMta;
    public void clickOnMtaInfo()
    { TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MtaInfo.click();
    }
    public String MtaTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MtaInfo.click();
        String title=MtaInfo.getText();
        System.out.println(title);
        return title;
    }
    public void aboutMta(WebElement element1,WebElement element2){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        element1.click();
        element2.click();
    }
    public void navigateBackMta(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MtaInfo.click();
        navigateBack();
    }
    public void mtaPolice(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MtaInfo.click();
        MtaPolice.click();
        driver.navigate().forward();
        AccridetetAgency.click();
    }
    public void mtaPoliceSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mtaPolice();
        sleepFor(2);
        MtaPoliceSearchBox.sendKeys("improper sexual conduct");
        searchButtonMta.click();
        sleepFor(2);
    }


}
