module com.iam2kabhishek.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.iam2kabhishek.login to javafx.fxml;
    exports com.iam2kabhishek.login;
}
