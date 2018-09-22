package TestBestBuy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test

    public void searchbar ()throws InterruptedException {

        WebElement headerHistory;
        Driver.get("http://www.bestbuy.com");
        methods.MainBestBuy.closePopUp();
        Driver.get("http://www.bestbuy.com");
        methods.MainBestBuy.closePopUp();
        Driver.findElement(By.xpath ("//*[@id=\"gh-search-input\"]"));
        Driver.findElement(By.xpath ("//*[@id=\"gh-search-input\"]")).sendKeys("laptop", Keys.ENTER);
        methods.MainBestBuy.sleep();
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[1]")).click();
        Driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("laptop",Keys.ENTER);
        methods.MainBestBuy.sleep();
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]")).click();
        methods.MainBestBuy.sleep();
        Driver.navigate().back();
        Driver.navigate().refresh();
        Driver.navigate().forward();
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[1]")).click();
        Driver.navigate().refresh();

    }

    @AfterTest
    public void driverClose (){driverClose();}
}
