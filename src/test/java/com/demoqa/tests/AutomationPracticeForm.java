package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.page_object.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void config() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.browserSize = "760x840";

    }

    @Test
    void fillFormTests() {
        registrationFormPage
                .openPage()
                .setFirstName("Gendolf")
                .setLastName("Gray")
                .setUserEmail("gendolf@mail.mr")
                .clickGender("Male")
                .userNumber("9359659655")
                .setBirthDate("03", "December", "1988")
                .setSubjects("History")
                .clickCheckboxHobbies("Reading")
                .uploadImage("src/test/resources/111.jpg")
                .setAddress("middle earth")
                .setState("Haryana")
                .setCity("Karnal")
                .clickSubmit("submit");

        registrationFormPage.checkResultsTableVisible();
        registrationFormPage.checkResult("Date of Birth", "03 December,1988")
                .checkResult("Student Name", "Gendolf Gray")
                .checkResult("Student Email", "gendolf@mail.mr")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9359659655")
                .checkResult("Subjects", "History")
                .checkResult("Hobbies", "Reading")
                .checkResult("Address", "middle earth")
                .checkResult("State and City", "Haryana Karnal");

    }
}
