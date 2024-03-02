package Mainlist;

import java.io.IOException;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainlistController {

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

    public void showAbout(ActionEvent event) throws IOException { 

        AlertMaker.showAboutAlert("About us",
        "BuzzHAHA \nAgustin, Sherlene \nAngeles, Jason \nBabao, Lark \nDionisio, Jonathan \nValdez, Angelique");
   
    }

    
}
