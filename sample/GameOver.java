package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class GameOver {
    @FXML
    Button GObutton;

    Main main = new Main();

    public void closegame(ActionEvent actionEvent) throws Exception {

        Stage GOwindow = (Stage) GObutton.getScene().getWindow();
        GOwindow.close();
        main.start(main.primaryStage);

    }
}
