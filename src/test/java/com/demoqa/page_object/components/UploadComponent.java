package com.demoqa.page_object.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadComponent {

    public UploadComponent uploadImage(String pathToFile) {
        $("#uploadPicture").uploadFile(new File(pathToFile));

        return this;
    }
}
