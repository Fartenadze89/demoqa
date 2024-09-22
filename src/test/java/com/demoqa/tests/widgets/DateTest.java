package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.widgets.DatePickerMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";
        DatePickerMenuPage datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual and Expected Dates Do Not Match" +
                "\n Actual Date: " + actualDate +
                "\n Expected Date: " + expectedDate);
    }
}
