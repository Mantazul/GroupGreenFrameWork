package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;
import static net.sourceforge.htmlunit.cyberneko.HTMLEntities.get;

public class Search extends CommonAPI {
    @FindBy(css = "#nav-search-query")public WebElement searchBox;
    @FindBy(xpath = "//input[@alt='Search']") public WebElement searchButton;
    public WebElement getSearchButton() {
        return searchButton;
    }
    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }
    public void clearSearchBox(){
        getSearchBox().clear();
    }
    public void clickSerachButton(){
        getSearchButton().click();
    }
    public void searchInSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<String>();
        list.add("Location");
        list.add("e-banking");
        list.add("monthly fees");
        for(String topic: list) {
            getSearchBox().sendKeys(topic);
            clickSerachButton();
            clearSearchBox();
        }
    }
}