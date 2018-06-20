package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Quit {

    @FXML
    Button quitbutton;

    public void quit(){
        System.exit(1);
    }

    public void resume(){


        Stage menustage = (Stage) quitbutton.getScene().getWindow();
        menustage.close();
    }
}
