package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.List;

public class PrintDropDown extends CommonAPI {

    public void getAllItemsInDropdown() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> elementList = getListOfWebElementsByCss ("#topicId");
        List<String> list = getListOfString(elementList);
        for (String text : list) {
            System.out.println(text);
        }
    }
}