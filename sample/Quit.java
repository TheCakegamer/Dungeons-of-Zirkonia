package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Quit {

    @FXML
    Button quitbutton;
    @FXML
    Label text;

    public void initialize(){
        text.setText("Do you really want to quit, " + System.getProperty("user.name") + "?");

    }

    public void quit(){
        System.exit(1);
    }

    public void resume(){


        Stage menustage = (Stage) quitbutton.getScene().getWindow();
        menustage.close();
    }
}
