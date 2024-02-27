package Mainlist;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OutdoorController {
    
    @FXML
    private Stage stage;

    // Goes back to Home.fxml
    public void gotoHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Home/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Football.fxml
    public void gotoFootball(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Mainlist/Football.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

     // Goes to Pool.fxml
     public void gotoPool(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Mainlist/Pool.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Badminton.fxml
    public void gotoBadminton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Mainlist/Badminton.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Goes to Basketball.fxml
    public void gotoBasketball(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Mainlist/Basketball.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

}