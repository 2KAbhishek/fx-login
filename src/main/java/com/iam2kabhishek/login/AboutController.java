package com.iam2kabhishek.login;

import java.io.IOException;

import javafx.fxml.FXML;

public class AboutController {
    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }
}
