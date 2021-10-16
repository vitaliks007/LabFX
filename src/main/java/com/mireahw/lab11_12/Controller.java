package com.mireahw.lab11_12;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private int result = 0;

    @FXML
    private TextField textFieldNumber;

    @FXML
    public void buttonPlusAction() {
        result += textFieldNumber;
    }

}