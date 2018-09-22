package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    WebElement clickiphoneSX;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[3]/div/a[3]")
    WebElement selectGames;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/div/a[9]")
    WebElement laptop;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/a[2]")
    WebElement powerbank;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[2]/div/a[1]")
    WebElement samsungTV;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/div[8]/div/a[1]")
    WebElement cameraAndCamcoder;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[3]")
    WebElement handBags;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[3]/div/a[6]")
    WebElement artWork;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[7]/div/a[8]")
    WebElement gift;

    public void d() throws InterruptedException {
        selectGames.click();
        powerbank.click();
        clickiphoneSX.click();
        samsungTV.click();
        cameraAndCamcoder.click();
        laptop.click();
        handBags.click();
        artWork.click();
        gift.click();
    }
}


