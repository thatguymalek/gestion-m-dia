module org.fsb.projet_Media {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.fsb.projet_Media to javafx.fxml;
    exports org.fsb.projet_Media;
}
