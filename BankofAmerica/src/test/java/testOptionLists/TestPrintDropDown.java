package testOptionLists;

import optionLists.PrintDropDown;
import org.testng.annotations.Test;

public class TestPrintDropDown extends PrintDropDown {
    @Test
    public void printDropDownMenu(){
        getAllItemsInDropdown();
    }
}
