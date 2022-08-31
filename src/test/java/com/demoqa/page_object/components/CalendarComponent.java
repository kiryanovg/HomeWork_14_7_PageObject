package com.demoqa.page_object.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    SelenideElement
            monthSelect = $(".react-datepicker__month-select"),
            yearSelect = $(".react-datepicker__year-select"),
            daySelect = $(".react-datepicker__day--003");

    public CalendarComponent setDate(String day, String month, String year) {
        monthSelect.selectOption(month);
        yearSelect.selectOption(year);
        daySelect.click();

        return this;
    }

}
