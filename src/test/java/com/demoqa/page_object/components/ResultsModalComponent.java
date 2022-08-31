package com.demoqa.page_object.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsModalComponent {

    SelenideElement
            openWindow = $(".modal-dialog"),
            openTitle = $("#example-modal-sizes-title-lg"),
            resultsWindow = $(".table-responsive");

    public final static String TITLE_TEXT = "Thanks for submitting the form";

    public ResultsModalComponent checkIsVisible() {
        openWindow.should(appear);
        openTitle.shouldHave(text(TITLE_TEXT));

        return this;

    }

    public ResultsModalComponent checkResult(String key, String value) {
        resultsWindow.$(byText(key)).sibling(0).shouldHave(text(value));

        return this;

    }
}
