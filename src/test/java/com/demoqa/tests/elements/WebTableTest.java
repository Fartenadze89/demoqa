package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.WebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test(enabled = false)
    public void testWebTable() {
        String email = "alden@example.com";
        String expectedAge = "34";
        WebTablesPage webTablesPage = homePage.goToElements().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("34");
        webTablesPage.clickSubmitBtn();
        String actualAge = webTablesPage.getTableAge("alden@example.com");

        Assert.assertEquals(actualAge, expectedAge, "Actual and Expected Ages Do not match");
    }
}
