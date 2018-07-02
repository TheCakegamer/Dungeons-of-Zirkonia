package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class GameOver {
    @FXML
    Button GObutton;

    Main main = new Main();

    public void closegame(ActionEvent actionEvent) throws Exception {
        Media oof = new Media(getClass().getResource("/image/oof.mp3").toExternalForm());
        MediaPlayer oofplayer = new MediaPlayer(oof);
        oofplayer.play();
        Stage GOwindow = (Stage) GObutton.getScene().getWindow();
        GOwindow.close();
        main.start(main.primaryStage);

    }
}
