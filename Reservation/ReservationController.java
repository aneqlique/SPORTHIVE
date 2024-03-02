package Reservation;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReservationController {

    @FXML
    private Stage stage;

    //Goes to Home.fxml
    public void gotoHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Home/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    
}
