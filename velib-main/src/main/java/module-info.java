module fr.tamdaz.velib {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires org.json;

    opens fr.ahassani.velib to javafx.fxml;
    opens fr.ahassani.velib.controllers to javafx.fxml;
    opens fr.ahassani.velib.models to javafx.base;
    
    exports fr.ahassani.velib;
    exports fr.ahassani.velib.controllers;
}
