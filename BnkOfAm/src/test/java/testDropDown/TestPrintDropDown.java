package testDropDown;

import dropDown.PrintDropDown;
import org.testng.annotations.Test;

public class TestPrintDropDown extends PrintDropDown {
    @Test
    public void printDropDownMenu(){
        getAllItemsInDropdown();
    }
}
