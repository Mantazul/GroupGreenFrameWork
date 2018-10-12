package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class PopUpHandle extends CommonAPI {
    public void goToPopUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCss("#footer_bofa_feedback");
    }
    public WebDriver popUpClick(WebDriver driver1) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        driver1.findElement(By.cssSelector("#c1")).click();
        clickOnCss("#submitButton");
        return driver1;
    }
    public WebDriver popUpWrite(WebDriver driver1) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        driver1.findElement(By.cssSelector("#c1")).click();
        driver1.findElement(By.xpath("//textarea[@id='comments']")).click();
        Actions ac = new Actions(driver1);
       ac.moveToElement(driver1.findElement(By.xpath("//textarea[@id='comments']"))).click();
        driver1.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Great Service");
        clickOnCss("#submitButton");
        return driver1;
    }
}
