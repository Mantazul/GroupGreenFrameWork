package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver=null;

    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})

    @BeforeMethod
    public void setUP(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
                      @Optional("windows") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("60.0")
                              String browserVersion, @Optional("http://www.mta.info") String url)throws IOException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\IdeaProjects\\webautomation\\MTA\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        }
    //@AfterMethod
    //public void close(){driver.close();
    //}
    public void search(String locator,String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);}

    public void typeOnInputField(String locator, String value){
            driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
        }



    public void mouseHoverByCSS(String locator){
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        }catch(Exception ex){
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }

    }


