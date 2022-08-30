package com.demoqa.page_object;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SetValueOptions;
import com.demoqa.page_object.components.CalendarComponent;
import com.demoqa.page_object.components.ResultsModalComponent;
import com.demoqa.page_object.components.UploadComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    private CalendarComponent calendarComponent = new CalendarComponent();
    private UploadComponent uploadComponent = new UploadComponent();

    private ResultsModalComponent resultsModalComponent = new ResultsModalComponent();


    //Elments

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            EmailInput = $("#userEmail"),
            clickGender = $(".custom-control-label"),
            userNumberPhone = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbies = $("[for='hobbies-checkbox-2']"),
            currentAddress = $("#currentAddress"),
            selectionState = $("#state"),
            selectionCity = $("#city"),
            clickSubmit = $("#submit");



    //Action

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;

    }

    public RegistrationFormPage setUserEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationFormPage clickGender(String gender) {
        $(".custom-control-label").click();

        return this;
    }

    public RegistrationFormPage userNumber(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public RegistrationFormPage setBirthDate(String day, String month, String year) {
        $(dateOfBirthInput).click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

     public RegistrationFormPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
     }

     public RegistrationFormPage clickCheckboxHobbies (String Hobbies) {
        $("[for='hobbies-checkbox-2']").click();

        return this;
     }

     public RegistrationFormPage uploadImage (String pathToFile) {
        uploadComponent.uploadImage(pathToFile);

        return this;

     }

     public RegistrationFormPage setAddress ( String value) {
        $("#currentAddress").setValue(value);

        return this;

     }

     public RegistrationFormPage setState (String stateName) {
        $("#state").click();
        $(byText("Haryana")).click();

        return this;
     }

     public RegistrationFormPage setCity (String cityName) {
        $("#city").click();
        $(byText("Karnal")).click();

        return this;

     }

     public RegistrationFormPage clickSubmit (String submit) {
        $("#submit").click();

        return this;

     }

    public RegistrationFormPage checkResultsTableVisible(){
        resultsModalComponent.checkIsVisible();

        return this;

     }

    public RegistrationFormPage checkResult(String key, String value) {
        resultsModalComponent.checkResult(key, value);

        return this;
    }

}
