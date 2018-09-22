package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;


public class CommonAPI {

    public WebDriver driver=null;



    //@Parameters({"useCloudEnv","cloudEnv","os","browserName","browserVersion","url","os_version","resolution"})
    @Parameters({"url"})

    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv,@Optional String cloudEnv, @Optional("macOS High Sierra ") String os, @Optional("chrome") String browserName, @Optional("60")
            String browserVersion, @Optional("http://www.bestbuy.com") String url,@Optional String os_version,@Optional String resolution)throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/asifchowdhury/Desktop/automateWeb/Generic/Driver/chromedriver");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);
        }


        @AfterMethod
        public void close(){
        driver.close();
        }

        public void searchIn(){
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphonemax", Keys.ENTER);
        }




    }


