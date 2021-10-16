module com.mireahw.lab11_12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mireahw.lab11_12 to javafx.fxml;
    exports com.mireahw.lab11_12;
}