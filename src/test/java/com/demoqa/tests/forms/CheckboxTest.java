package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSportsCheckbox();
        practiceFormPage.clickReadingCheckbox();
        practiceFormPage.clickMusicCheckbox();
        practiceFormPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = practiceFormPage.isReadingSelected();

        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox is Selected \n");
    }
}
