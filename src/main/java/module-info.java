module issuetrackinglite {
    requires javafx.controls;
    requires javafx.fxml;

    opens issuetrackinglite to javafx.fxml;
    exports issuetrackinglite;
    
    opens issuetrackinglite.model to javafx.fxml;
    exports issuetrackinglite.model;
}
