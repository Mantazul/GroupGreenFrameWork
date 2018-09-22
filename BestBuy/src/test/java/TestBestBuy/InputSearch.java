package TestBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InputSearch extends CommonAPI {

    @Test
    public void search() {
        WebDriver driver;
        System.setProperty("webdriver.firefoxdriver.driver", "/Users/asifchowdhury/Desktop/automateWeb/Generic/Driver/chromedriver");
        driver= new FirefoxDriver();
        String baseURL = "https://www.bestbuy.com";
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("gh-search-input")).sendKeys("TV", Keys.ENTER);
        driver.findElement(By.className("gh-search-input")).sendKeys("Laptop", Keys.ENTER);
        driver.close();
    }
}