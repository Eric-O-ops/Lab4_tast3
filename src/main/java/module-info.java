module com.eric.lab4_tast3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eric.lab4_tast3 to javafx.fxml;
    exports com.eric.lab4_tast3;
    exports com.eric.lab4_tast3.main;
    opens com.eric.lab4_tast3.main to javafx.fxml;
}