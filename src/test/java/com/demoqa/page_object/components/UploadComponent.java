package com.demoqa.page_object.components;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadComponent {

    SelenideElement
            uploadFile = $("#uploadPicture");

    public UploadComponent uploadImage(String pathToFile) {
        uploadFile.uploadFile(new File(pathToFile));

        return this;
    }
}
