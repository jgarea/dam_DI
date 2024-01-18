module com.example.nuevoproyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nuevoproyectojavafx to javafx.fxml;
    exports com.example.nuevoproyectojavafx;
}