package dataDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XcelElement extends CommonAPI {

    @FindBy(xpath = "//*[@id='search']")
    public static WebElement getxlElement;

    public void getxlElement(){
        getxlElement.click();
    }
}