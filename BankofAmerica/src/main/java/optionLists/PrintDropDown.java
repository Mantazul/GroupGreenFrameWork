package optionLists;

import base.CommonAPI;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrintDropDown extends CommonAPI {

    public void getAllItemsInDropdown() {
        List<WebElement> elementList = getListOfWebElementsByCss ("#topicId");
        List<String> list = getListOfString(elementList);
        for (String text : list) {
            System.out.println(text);
        }
    }
}