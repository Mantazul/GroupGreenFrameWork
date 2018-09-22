package TestBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InputSearch extends CommonAPI {

    @Test
    public void search() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/asifchowdhury/IdeaProjects/seleniumproject/lib/chromedriver");
        driver= new ChromeDriver();
        String baseURL = "https://www.bestbuy.com";
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV", Keys.ENTER);
        driver.findElement(By.className("a-color-base headline truncate-1line")).sendKeys("Laptop", Keys.ENTER);
        driver.close();
    }


}