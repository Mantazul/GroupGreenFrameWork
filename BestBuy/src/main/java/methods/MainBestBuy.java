package methods;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainBestBuy extends CommonAPI {


    static WebDriverWait wait = new WebDriverWait(Driver, 15, 1000);

    public static void closePopUp() {

        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
    }

    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public static void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,-500)");
    }

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void account() throws InterruptedException {

        WebElement account = Driver.findElement(By.cssSelector("li.account > a:nth-child(1)"));
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOf(account)); //this will wait for elememt to be visible for 20 seconds

        account.click(); //now it clicks on element
    }

    //"am-create-account__button (btn btn-tertiary)"

    public static void accountButton() {

        WebElement account = Driver.findElement(By.cssSelector("a.am-create-account__button btn btn-tertiary"));
        wait.until(ExpectedConditions.visibilityOf(account));
        account.click();
    }

    public static void createAccount() throws InterruptedException {
        WebElement createAccount = null;
        Driver.findElement(By.cssSelector("#fld-firstName")).sendKeys("Asif");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-lastName")).sendKeys("Chowdhury");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-e")).sendKeys("selenium.summer18@gmail.com");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p1")).sendKeys("piit@usa");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p2")).sendKeys("piit@usa");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-phone")).sendKeys("3476562394");
        Thread.sleep(2000);
        createAccount = Driver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(createAccount)); //this will wait for elememt to be visible for 20 seconds
        createAccount.click();

    }

    public static void signInButton() {

        WebElement signInB = null;
        signInB = Driver.findElement(By.cssSelector(".lam-signIn__button"));
        wait.until(ExpectedConditions.visibilityOf(signInB)); //this will wait for elememt to be visible for 20 seconds
        signInB.click();
    }

    public static void signIn() throws InterruptedException {
        WebElement signIn = null;
        Driver.findElement(By.cssSelector("#fld-e")).sendKeys("selenium.summer18@gmail.com");
        Thread.sleep(2000);
        Driver.findElement(By.cssSelector("#fld-p1")).sendKeys("piit@usa");
        Thread.sleep(2000);
        signIn = Driver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(signIn)); //this will wait for elememt to be visible for 20 seconds
        signIn.click();
    }

    public static void featuredItems() {
        String title = Driver.findElement(By.cssSelector(".featured > h2:nth-child(1)")).getText();
        System.out.println("The " + title + " items are:");



        List <WebElement> alllinks = Driver.findElements(By.xpath("//div[@class=\"featured\"]//a"));
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());


    }

    public static void allCategories() {
        String title = Driver.findElement(By.cssSelector(".shopby > h2:nth-child(1)")).getText();
        System.out.println("The " + title + " items are:");
        List <WebElement> shopby = Driver.findElements(By.xpath("//div[@class=\"shopby\"]//li[@class=\"js-navitem sub-nav-parent taphover\"]"));
        for (int i = 0; i < shopby.size(); i++)
            System.out.println(shopby.get(i).getText());

    }

    public static void featuredOffers() {
        String title = Driver.findElement(By.cssSelector("#widget-a9596c6c-a001-4460-ae39-bf48cdcf4822 > div > p")).getText();
        System.out.println("The " + title + " items are:");

        List <WebElement> heading = Driver.findElements(By.xpath("//h2[@class=\"header-minimal\"]"));
        Actions actions = new Actions(Driver);
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,500)");
        List <WebElement> alllinks = Driver.findElements(By.xpath("//div[@class=\"image-shell\"]//a"));
        for (int i = 0; i < heading.size(); i++)
            System.out.println(heading.get(i).getText());

        for (int i = 0; i < alllinks.size(); i++) {
            js.executeScript("window.scrollBy(0,607)");
            sleep();
            actions.moveToElement(alllinks.get(i)).click().build().perform();
            // alllinks.get(i).click();
            Driver.navigate().back();
            sleep();
        }

    }

    public static void myBestBuy() {
        String title = Driver.findElement(By.cssSelector("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/a")).getText();
        System.out.println("The " + title + " items are:");
        List <WebElement> alllinks = Driver.findElements(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul//a"));
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());

    }

    public static void creditCard() {
        String title = Driver.findElement(By.cssSelector("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/a")).getText();
        System.out.println("The " + title + " items are:");
        List <WebElement> alllinks = Driver.findElements(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/ul//a"));
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());
    }
}

