package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelectDropDown = By.id("cars");


    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelectDropDown);
        Select select = new Select(find(standardMultiSelectDropDown));
        selectByVisibleText(standardMultiSelectDropDown, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelectDropDown);
        Select select = new Select(find(standardMultiSelectDropDown));
        selectByIndex(standardMultiSelectDropDown, index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelectDropDown);
        deselectByValue(standardMultiSelectDropDown, value);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelectDropDown);
    }
}
