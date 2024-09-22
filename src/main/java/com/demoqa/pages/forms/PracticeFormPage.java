package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By emailField = By.id("userEmail");
    private By maleRadioButton = By.id("gender-radio-1");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By otherRadioButton = By.id("gender-radio-3");
    private By numberField = By.id("userNumber");
    private By sportsCheckbox = By.id("hobbies-checkbox-1");
    private By readingCheckbox = By.id("hobbies-checkbox-2");
    private By musicCheckbox = By.id("hobbies-checkbox-3");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsCheckbox).isSelected()) {
            scrollToElementJS(sportsCheckbox);
            clickJS(sportsCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingCheckbox).isSelected()) {
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicCheckbox).isSelected()) {
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingCheckbox).isSelected()) {
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingCheckbox).isSelected();
    }

}
