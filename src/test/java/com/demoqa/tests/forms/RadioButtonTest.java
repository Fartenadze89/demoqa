package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();

        boolean isFemaleRadioButtonSelected = practiceFormPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\nFemale Radio Button is not selected \n");

    }
}
