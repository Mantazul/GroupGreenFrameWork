package ObjectPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageMyMtaAlert extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"block-block-1426\"]/div/div/h2/a")
    public static WebElement MyMtaAlerts;

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")
    public static WebElement UserId;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmitLogin\"]")
    public static WebElement Login;


      public void clickOnMyMtaAlerts(){
          MyMtaAlerts.click();
          UserId.sendKeys("acb23", Keys.ENTER);
          password.sendKeys("ew5w",Keys.ENTER);
          Login.click();
      }
      public homePageMyMtaAlert(){}
      public homePageMyMtaAlert(WebDriver driver){
          this.driver=driver;
          PageFactory.initElements(driver,this);
      }
}

