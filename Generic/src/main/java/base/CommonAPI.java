package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class CommonAPI {

    public static WebDriver Driver;
    @BeforeMethod


    public void before() {

        System.setProperty("webdriver.chrome.driver","/Users/asifchowdhury/Desktop/automateWeb/Generic/Driver/geckodriver");
        Driver = new FirefoxDriver();
    }

    public static void launchBrowser(String url){
        Driver.get(url);
        Driver.manage().window().maximize();
    }
    public static void sleepFor(int sec)throws InterruptedException{
        Thread.sleep(sec * 1000);
    }

    public static WebDriver handleNewTab(WebDriver Driver){
        String oldTab = Driver.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(Driver.getWindowHandles());
        newTabs.remove(oldTab);
        Driver.switchTo().window(newTabs.get(0));
        return Driver;
    }

    @AfterMethod
    public void driverClose (){driverClose();}

}

