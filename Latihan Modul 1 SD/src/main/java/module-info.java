module com.example.latihan_modul_1_sd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihan_modul_1_sd to javafx.fxml;
    exports com.example.latihan_modul_1_sd;
    exports com.example.latihan_modul_1_sd_2;
    opens com.example.latihan_modul_1_sd_2 to javafx.fxml;
}