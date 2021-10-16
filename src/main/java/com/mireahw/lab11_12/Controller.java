package com.mireahw.lab11_12;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private double result = 0;

    @FXML
    private TextField textFieldNumber;

    @FXML
    public void buttonPlusAction() {
        result += Double.parseDouble(textFieldNumber.getText());
        textFieldNumber.clear();
    }

    @FXML
    public void buttonMinusAction() {
        result -= Double.parseDouble(textFieldNumber.getText());
        textFieldNumber.clear();
    }

    @FXML
    public void buttonMultipleAction() {
        result *= Double.parseDouble(textFieldNumber.getText());
        textFieldNumber.clear();
    }

    @FXML
    public void buttonDivideAction() {
        result /= Double.parseDouble(textFieldNumber.getText());
        textFieldNumber.clear();
    }

    @FXML
    public void buttonCalculateAction() {
        textFieldNumber.setText(String.valueOf(result));
    }

}