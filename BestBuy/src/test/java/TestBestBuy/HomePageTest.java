package TestBestBuy;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {


    @Test

    public void homepagetesting () {

    CommonAPI.launchBrowser("http://wwww.bestbuy.com");


    methods.MainBestBuy.closePopUp();


    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollDown();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollDown();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollDown();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollDown();

    //Testing Scrolling up
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollUp();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollUp();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollUp();
    methods.MainBestBuy.sleep();
    methods.MainBestBuy.scrollUp();
}
    @Test
    public void testAccount() throws  InterruptedException{
        Driver.get("http://www.bestbuy.com");
        methods.MainBestBuy.closePopUp();
        methods.MainBestBuy.account();
        methods.MainBestBuy.signIn();
        methods.MainBestBuy.signIn();
    }

    @Test
    public void testSignIn()throws InterruptedException{
    Driver.get("http://www.bestbuy.com");
    methods.MainBestBuy.closePopUp();
    methods.MainBestBuy.signInButton();
    methods.MainBestBuy.signIn();

    }

    @Test
    public void product()throws InterruptedException {
        Driver.get("http://www.bestbuy.com");
        methods.MainBestBuy.closePopUp();
        methods.MainBestBuy.sleep();
        Driver.findElement(By.cssSelector("a#menu0")).click();
        methods.MainBestBuy.sleep();
        Driver.findElement(By.xpath("//*[@id='group0']/div[3]/a")).click();
        Driver.findElement(By.cssSelector("a#menuO")).click();
        methods.MainBestBuy.featuredItems();
        methods.MainBestBuy.allCategories();
        methods.MainBestBuy.featuredOffers();

    }
}



