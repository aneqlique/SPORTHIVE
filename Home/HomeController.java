package Home;

import java.io.IOException;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController {
    

    @FXML
    private Stage stage;

    // Goes to Football.fxml
    public void gotoFootball(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Mainlist/Football.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    
    // Goes to Reservation.fxml
    public void gotoReservation(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Reservation/Reservation.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Calendar.fxml
    public void gotoCalendar(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Calendar/Calendar.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    

    
       public void showAbout(ActionEvent event) throws IOException { 

            AlertMaker.showAboutAlert("About us",
            "BuzzHAHA \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nDionisio, Jonathan \nValdez, Angelique");
   
       }




}
